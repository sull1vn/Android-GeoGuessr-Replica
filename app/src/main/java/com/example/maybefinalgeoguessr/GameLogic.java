package com.example.maybefinalgeoguessr;
import android.location.Location;


public class GameLogic {

    private int userScore;
    private int totalScore;
    private int tries;
    private MainActivity mainActivity;

    public void gameLogic(Location streetViewLoc, Location userPinLoc) {
        mainActivity = new MainActivity();
        float[] distance = new float[1];
        Location.distanceBetween(
                streetViewLoc.getLatitude(),
                streetViewLoc.getLongitude(),
                userPinLoc.getLatitude(),
                userPinLoc.getLongitude(),
                distance
        );

        float distanceInMeters = distance[0];
        float distanceInKm = distanceInMeters / 1000;
        float score = 5000f * (float) Math.log10(distanceInKm + 1f) + 500f;
        userScore = (int) score;
        totalScore += userScore;

        tries++;

        if (tries % 5 == 0) {
            totalScore = 0;
        }
    }
}


