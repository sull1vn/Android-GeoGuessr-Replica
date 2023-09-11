package com.example.maybefinalgeoguessr;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.StreetViewSource;


import androidx.annotation.NonNull;

import java.util.Random;


public class MainActivity extends Coordinates implements OnStreetViewPanoramaReadyCallback, OnMapReadyCallback {

    private StreetViewPanorama streetViewPanorama;
    private GoogleMap googleMap;
    Random random = new Random();
    private LatLng randomLocation;
    double locLat;
    double locLng;

    private double userLat;
    private double userLng;

    public Location streetViewLoc;
    public Location userPinLoc;
    private int userScore;
    private boolean hasDroppedPin = false;

    private EditText scoreCount;
    private int totalScore;

    private int tries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportStreetViewPanoramaFragment streetViewPanoramaFragment = (SupportStreetViewPanoramaFragment)getSupportFragmentManager().findFragmentById(R.id.googlemapstreetview);
        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);

        scoreCount = (EditText) findViewById(R.id.scoreCount);

    }


    @Override
    public void onStreetViewPanoramaReady(StreetViewPanorama streetViewPanorama) {

        randomLocation = getRandomStreetView();

        this.streetViewPanorama = streetViewPanorama;
        this.streetViewPanorama.setPosition(randomLocation, 1000000);

        streetViewLoc = new Location("");
        streetViewLoc.setLatitude(randomLocation.latitude);
        streetViewLoc.setLongitude(randomLocation.longitude);


    }





    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.googleMap = googleMap;

        googleMap.getUiSettings().setZoomControlsEnabled(true);

        googleMap.moveCamera(CameraUpdateFactory.zoomTo(12));

        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {

                MarkerOptions markerOptions = new MarkerOptions().position(latLng);
                Marker markerUser = googleMap.addMarker(markerOptions);

                MarkerOptions markerGuess = new MarkerOptions().position(randomLocation);
                Marker markerPos = googleMap.addMarker(markerGuess);
                markerPos.setVisible(false);


                userPinLoc = new Location("");
                userLat = latLng.latitude;
                userLng = latLng.longitude;


                hasDroppedPin = true;

                if (hasDroppedPin) {
                    markerPos.setVisible(true);

                    CameraPosition posZoom = new CameraPosition.Builder()
                            .target(markerPos.getPosition())
                            .zoom(6)
                            .build();

                    CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(posZoom);

                    googleMap.moveCamera(cameraUpdate);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            markerPos.setVisible(false);
                            markerUser.setVisible(false);

                            gameLogic(streetViewPanorama);
                        }
                    }, 7000);


                }

            }
        });
    }



    public void gameLogic(StreetViewPanorama streetViewPanorama) {


        float[] distance = new float[1];
        Location.distanceBetween(streetViewLoc.getLatitude(), streetViewLoc.getLongitude(),
                userPinLoc.getLatitude(), userPinLoc.getLongitude(), distance);

        float distanceInMeters = distance[0];
        float distanceInKm = distanceInMeters / 1000;
        float score = 5000f * (float) Math.log10(distanceInKm + 1f) + 500f;
        userScore = (int) score;
        totalScore += userScore;

        tries++;

        if (tries % 5 == 0) {
            totalScore = 0;
        }

        scoreCount.setText(String.valueOf(totalScore));

        this.streetViewPanorama.setPosition(randomLocation, 10000, StreetViewSource.OUTDOOR);

        onStreetViewPanoramaReady(this.streetViewPanorama);


    }

    }



