package com.example.maybefinalgeoguessr;

import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.model.LatLng;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coordinates extends AppCompatActivity {

    private static final double us_min_lat = 24.396308;
    private static final double us_max_lat = 49.384358;
    private static final double us_min_lon = -124.848974;
    private static final double us_max_lon = -66.885444;

    private static final double nyc_min_lat = 40.5;
    private static final double nyc_max_lat = 40.9;
    private static final double nyc_min_lon = -74.3;
    private static final double nyc_max_lon = -73.7;

    private static final double dc_min_lat = 38.79163;
    private static final double dc_max_lat = 38.995548;
    private static final double dc_min_lon = -77.119759;
    private static final double dc_max_lon = -76.909393;

    private static final double la_min_lat = 33.703652;
    private static final double la_max_lat = 34.337307;
    private static final double la_min_lon = -118.668176;
    private static final double la_max_lon = -118.155289;

    private static final double miami_min_lat = 25.711232;
    private static final double miami_max_lat = 25.889526;
    private static final double miami_min_lon = -80.319722;
    private static final double miami_max_lon = -80.127593;

    private static final double vancouver_min_lat = 49.199913;
    private static final double vancouver_max_lat = 49.314130;
    private static final double vancouver_min_lon = -123.224436;
    private static final double vancouver_max_lon = -123.023716;

    private static final double london_min_lat = 51.286760;
    private static final double london_max_lat = 51.691874;
    private static final double london_min_lon = -0.510375;
    private static final double london_max_lon = 0.334015;

    private static final double dublin_min_lat = 53.247216;
    private static final double dublin_max_lat = 53.425063;
    private static final double dublin_min_lon = -6.443504;
    private static final double dublin_max_lon = -6.062875;

    private static final double paris_min_lat = 48.815574;
    private static final double paris_max_lat = 48.902156;
    private static final double paris_min_lon = 2.224199;
    private static final double paris_max_lon = 2.469920;

    private static final double warsaw_min_lat = 52.107980;
    private static final double warsaw_max_lat = 52.367877;
    private static final double warsaw_min_lon = 20.842525;
    private static final double warsaw_max_lon = 21.271655;

    private static final double copenhagen_min_lat = 55.611352;
    private static final double copenhagen_max_lat = 55.735248;
    private static final double copenhagen_min_lon = 12.429230;
    private static final double copenhagen_max_lon = 12.655570;

    private static final double amsterdam_min_lat = 52.314470;
    private static final double amsterdam_max_lat = 52.431346;
    private static final double amsterdam_min_lon = 4.728110;
    private static final double amsterdam_max_lon = 5.068860;

    private static final double tokyo_min_lat = 35.542781;
    private static final double tokyo_max_lat = 35.817375;
    private static final double tokyo_min_lon = 139.562703;
    private static final double tokyo_max_lon = 139.910201;

    private static final double beijing_min_lat = 39.739157;
    private static final double beijing_max_lat = 40.016050;
    private static final double beijing_min_lon = 116.190874;
    private static final double beijing_max_lon = 116.606573;

    private static final double ulaanbaatar_min_lat = 47.808633;
    private static final double ulaanbaatar_max_lat = 47.996545;
    private static final double ulaanbaatar_min_lon = 106.729617;
    private static final double ulaanbaatar_max_lon = 107.146255;


    private static final double kl_min_lat = 3.047481;
    private static final double kl_max_lat = 3.264147;
    private static final double kl_min_lon = 101.579082;
    private static final double kl_max_lon = 101.775594;

    private static final double lagos_min_lat = 6.393761;
    private static final double lagos_max_lat = 6.701682;
    private static final double lagos_min_lon = 3.255910;
    private static final double lagos_max_lon = 3.544850;

    private static final double joburg_min_lat = -26.305133;
    private static final double joburg_max_lat = -25.767389;
    private static final double joburg_min_lon = 27.903224;
    private static final double joburg_max_lon = 28.501490;

    private static final double cairo_min_lat = 29.908863;
    private static final double cairo_max_lat = 30.201710;
    private static final double cairo_min_lon = 31.200246;
    private static final double cairo_max_lon = 31.433352;

    private static final double santo_domingo_min_lat = 18.432013;
    private static final double santo_domingo_max_lat = 18.530166;
    private static final double santo_domingo_min_lon = -69.997190;
    private static final double santo_domingo_max_lon = -69.850145;

    private static final double mexico_city_min_lat = 19.182062;
    private static final double mexico_city_max_lat = 19.617918;
    private static final double mexico_city_min_lon = -99.328437;
    private static final double mexico_city_max_lon = -98.910820;

    private static final double albuquerque_min_lat = 34.979119;
    private static final double albuquerque_max_lat = 35.259485;
    private static final double albuquerque_min_lon = -106.763657;
    private static final double albuquerque_max_lon = -106.471743;

    private static final double las_cruces_min_lat = 32.247369;
    private static final double las_cruces_max_lat = 32.404727;
    private static final double las_cruces_min_lon = -106.837720;
    private static final double las_cruces_max_lon = -106.622015;

    private static final double rio_min_lat = -23.081811;
    private static final double rio_max_lat = -22.746979;
    private static final double rio_min_lon = -43.796974;
    private static final double rio_max_lon = -43.096081;

    private static final double montevideo_min_lat = -34.967684;
    private static final double montevideo_max_lat = -34.798039;
    private static final double montevideo_min_lon = -56.365479;
    private static final double montevideo_max_lon = -56.031029;

    private static final double santiago_min_lat = -33.618860;
    private static final double santiago_max_lat = -33.246074;
    private static final double santiago_min_lon = -70.811898;
    private static final double santiago_max_lon = -70.438555;

    private static final double lima_min_lat = -12.088227;
    private static final double lima_max_lat = -11.781473;
    private static final double lima_min_lon = -77.205090;
    private static final double lima_max_lon = -76.705416;

    private static final double sydney_min_lat = -34.169248;
    private static final double sydney_max_lat = -33.578140;
    private static final double sydney_min_lon = 150.502229;
    private static final double sydney_max_lon = 151.342804;

    private static final double reading_min_lat = 40.272720;
    private static final double reading_max_lat = 40.397052;
    private static final double reading_min_lon = -76.056942;
    private static final double reading_max_lon = -75.821150;

    private static final double philadelphia_min_lat = 39.871811;
    private static final double philadelphia_max_lat = 40.137959;
    private static final double philadelphia_min_lon = -75.280286;
    private static final double philadelphia_max_lon = -74.955712;


    Random random = new Random();

    public LatLng getRandomStreetView() {

        List<Method> streetViewMethods = new ArrayList<>();
        Method[] methods = Coordinates.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().endsWith("StreetView") && method.getReturnType() == LatLng.class) {
                streetViewMethods.add(method);
            }
        }

        Random random = new Random();
        int index = random.nextInt(streetViewMethods.size());
        try {
            return (LatLng) streetViewMethods.get(index).invoke(this);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }


    public LatLng nycStreetView() {
        double lat = nyc_min_lat + (nyc_max_lat - nyc_min_lat) * random.nextDouble();
        double lng = nyc_min_lon + (nyc_max_lon - nyc_min_lon) * random.nextDouble();

        LatLng nycLatLng = new LatLng(lat, lng);
        return nycLatLng;
    }

    public LatLng dcStreetView() {
        double lat = dc_min_lat + (dc_max_lat - dc_min_lat) * random.nextDouble();
        double lng = dc_min_lon + (dc_max_lon - dc_min_lon) * random.nextDouble();

        LatLng dcLatLng = new LatLng(lat, lng);
        return dcLatLng;
    }

    public LatLng laStreetView() {
        double lat = la_min_lat + (la_max_lat - la_min_lat) * random.nextDouble();
        double lng = la_min_lon + (la_max_lon - la_min_lon) * random.nextDouble();

        LatLng laLatLng = new LatLng(lat, lng);
        return laLatLng;
    }

    public LatLng miamiStreetView() {
        double lat = miami_min_lat + (miami_max_lat - miami_min_lat) * random.nextDouble();
        double lng = miami_min_lon + (miami_max_lon - miami_min_lon) * random.nextDouble();

        LatLng miamiLatLng = new LatLng(lat, lng);
        return miamiLatLng;
    }

    public LatLng vancouverStreetView() {
        double lat = vancouver_min_lat + (vancouver_max_lat - vancouver_min_lat) * random.nextDouble();
        double lng = vancouver_min_lon + (vancouver_max_lon - vancouver_min_lon) * random.nextDouble();

        LatLng vanLatLng = new LatLng(lat, lng);
        return vanLatLng;
    }

    public LatLng londonStreetView() {
        double lat = london_min_lat + (london_max_lat - london_min_lat) * random.nextDouble();
        double lng = london_min_lon + (london_max_lon - london_min_lon) * random.nextDouble();

        LatLng londonLatLng = new LatLng(lat, lng);
        return londonLatLng;
    }

    public LatLng dublinStreetView() {
        double lat = dublin_min_lat + (dublin_max_lat - dublin_min_lat) * random.nextDouble();
        double lng = dublin_min_lon + (dublin_max_lon - dublin_min_lon) * random.nextDouble();

        LatLng dubLatLng = new LatLng(lat, lng);
        return dubLatLng;
    }

    public LatLng parisStreetView() {
        double lat = paris_min_lat + (paris_max_lat - paris_min_lat) * random.nextDouble();
        double lng = paris_min_lon + (paris_max_lon - paris_min_lon) * random.nextDouble();

        LatLng parisLatLng = new LatLng(lat, lng);
        return parisLatLng;
    }

    public LatLng warsawStreetView() {
        double lat = warsaw_min_lat + (warsaw_max_lat - warsaw_min_lat) * random.nextDouble();
        double lng = warsaw_min_lon + (warsaw_max_lon - warsaw_min_lon) * random.nextDouble();

        LatLng warsawLatLng = new LatLng(lat, lng);
        return warsawLatLng;
    }

    public LatLng amsterdamStreetView() {
        double lat = amsterdam_min_lat + (amsterdam_max_lat - amsterdam_min_lat) * random.nextDouble();
        double lng = amsterdam_min_lon + (amsterdam_max_lon - amsterdam_min_lon) * random.nextDouble();

        LatLng amsterdamLatLng = new LatLng(lat, lng);
        return amsterdamLatLng;
    }

    public LatLng tokyoStreetView() {
        double lat = tokyo_min_lat + (tokyo_max_lat - tokyo_min_lat) * random.nextDouble();
        double lng = tokyo_min_lon + (tokyo_max_lon - tokyo_min_lon) * random.nextDouble();

        LatLng tokyoLatLng = new LatLng(lat, lng);
        return tokyoLatLng;
    }

    public LatLng beijingStreetView() {
        double lat = beijing_min_lat + (beijing_max_lat - beijing_min_lat) * random.nextDouble();
        double lng = beijing_min_lon + (beijing_max_lon - beijing_min_lon) * random.nextDouble();

        LatLng beijingLatLng = new LatLng(lat, lng);
        return beijingLatLng;
    }

    public LatLng ulaanbaatarStreetView() {
        double lat = ulaanbaatar_min_lat + (ulaanbaatar_max_lat - ulaanbaatar_min_lat) * random.nextDouble();
        double lng = ulaanbaatar_min_lon + (ulaanbaatar_max_lon - ulaanbaatar_min_lon) * random.nextDouble();

        LatLng ulaanbaatarLatLng = new LatLng(lat, lng);
        return ulaanbaatarLatLng;
    }

    public LatLng kualaLumpurStreetView() {
        double lat = kl_min_lat + (kl_max_lat - kl_min_lat) * random.nextDouble();
        double lng = kl_min_lon + (kl_max_lon - kl_min_lon) * random.nextDouble();

        LatLng kualaLumpurLatLng = new LatLng(lat, lng);
        return kualaLumpurLatLng;
    }

    public LatLng lagosStreetView() {
        double lat = lagos_min_lat + (lagos_max_lat - lagos_min_lat) * random.nextDouble();
        double lng = lagos_min_lon + (lagos_max_lon - lagos_min_lon) * random.nextDouble();

        LatLng lagosLatLng = new LatLng(lat, lng);
        return lagosLatLng;
    }

    public LatLng johannesburgStreetView() {
        double lat = joburg_min_lat + (joburg_max_lat - joburg_min_lat) * random.nextDouble();
        double lng = joburg_min_lon + (joburg_max_lon - joburg_min_lon) * random.nextDouble();

        LatLng johannesburgLatLng = new LatLng(lat, lng);
        return johannesburgLatLng;
    }

    public LatLng cairoStreetView() {
        double lat = cairo_min_lat + (cairo_max_lat - cairo_min_lat) * random.nextDouble();
        double lng = cairo_min_lon + (cairo_max_lon - cairo_min_lon) * random.nextDouble();

        LatLng cairoLatLng = new LatLng(lat, lng);
        return cairoLatLng;
    }

    public LatLng mexicoCityStreetView() {
        double lat = mexico_city_min_lat + (mexico_city_max_lat - mexico_city_min_lat) * random.nextDouble();
        double lng = mexico_city_min_lon + (mexico_city_max_lon - mexico_city_min_lon) * random.nextDouble();

        LatLng mexicoCityLatLng = new LatLng(lat, lng);
        return mexicoCityLatLng;
    }

    public LatLng albuquerqueStreetView() {
        double lat = albuquerque_min_lat + (albuquerque_max_lat - albuquerque_min_lat) * random.nextDouble();
        double lng = albuquerque_min_lon + (albuquerque_max_lon - albuquerque_min_lon) * random.nextDouble();

        LatLng albuquerqueLatLng = new LatLng(lat, lng);
        return albuquerqueLatLng;
    }

    public LatLng lasCrucesStreetView() {
        double lat = las_cruces_min_lat + (las_cruces_max_lat - las_cruces_min_lat) * random.nextDouble();
        double lng = las_cruces_min_lon + (las_cruces_max_lon - las_cruces_min_lon) * random.nextDouble();

        LatLng lasCrucesLatLng = new LatLng(lat, lng);
        return lasCrucesLatLng;
    }

    public LatLng rioDeJaneiroStreetView() {
        double lat = rio_min_lat + (rio_max_lat - rio_min_lat) * random.nextDouble();
        double lng = rio_min_lon + (rio_max_lon - rio_min_lon) * random.nextDouble();

        LatLng rioDeJaneiroLatLng = new LatLng(lat, lng);
        return rioDeJaneiroLatLng;
    }

    public LatLng montevideoStreetView() {
        double lat = montevideo_min_lat + (montevideo_max_lat - montevideo_min_lat) * random.nextDouble();
        double lng = montevideo_min_lon + (montevideo_max_lon - montevideo_min_lon) * random.nextDouble();

        LatLng montevideoLatLng = new LatLng(lat, lng);
        return montevideoLatLng;
    }

    public LatLng santiagoStreetView() {
        double lat = santiago_min_lat + (santiago_max_lat - santiago_min_lat) * random.nextDouble();
        double lng = santiago_min_lon + (santiago_max_lon - santiago_min_lon) * random.nextDouble();

        LatLng santiagoLatLng = new LatLng(lat, lng);
        return santiagoLatLng;
    }

    public LatLng limaStreetView() {
        double lat = lima_min_lat + (lima_max_lat - lima_min_lat) * random.nextDouble();
        double lng = lima_min_lon + (lima_max_lon - lima_min_lon) * random.nextDouble();

        LatLng limaLatLng = new LatLng(lat, lng);
        return limaLatLng;
    }

    public LatLng sydneyStreetView() {
        double lat = sydney_min_lat + (sydney_max_lat - sydney_min_lat) * random.nextDouble();
        double lng = sydney_min_lon + (sydney_max_lon - sydney_min_lon) * random.nextDouble();

        LatLng sydneyLatLng = new LatLng(lat, lng);
        return sydneyLatLng;
    }

    public LatLng readingStreetView() {
        double lat = reading_min_lat + (reading_max_lat - reading_min_lat) * random.nextDouble();
        double lng = reading_min_lon + (reading_max_lon - reading_min_lon) * random.nextDouble();

        LatLng readingLatLng = new LatLng(lat, lng);
        return readingLatLng;
    }

    public LatLng philadelphiaStreetView() {
        double lat = philadelphia_min_lat + (philadelphia_max_lat - philadelphia_min_lat) * random.nextDouble();
        double lng = philadelphia_min_lon + (philadelphia_max_lon - philadelphia_min_lon) * random.nextDouble();

        LatLng philadelphiaLatLng = new LatLng(lat, lng);
        return philadelphiaLatLng;
    }

}


