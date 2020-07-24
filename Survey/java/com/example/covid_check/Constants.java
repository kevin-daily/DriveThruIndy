package com.example.covid_check;

import com.google.android.gms.location.Geofence;

final class Constants {
    private Constants() {
    }

    static final String id = "home_fence";
    static final int GEOFENCE_RADIUS_IN_METERS =100; // Sets the radius of the geofence
    static final double Latitude = 41.140692; // Sets the latitude of the fence
    static final double Longitude = -85.074082; // Sets the longitude of the fence
    static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = Geofence.NEVER_EXPIRE; // Sets the expiration time for the geofence
}
