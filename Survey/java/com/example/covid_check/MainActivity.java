package com.example.covid_check;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;

import static com.example.covid_check.Constants.GEOFENCE_EXPIRATION_IN_MILLISECONDS;
import static com.example.covid_check.Constants.GEOFENCE_RADIUS_IN_METERS;
import static com.example.covid_check.Constants.Latitude;
import static com.example.covid_check.Constants.Longitude;

//@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.covid_check.MESSAGE";
    private static final String CHANNEL_ID = "channel_01";
    private FusedLocationProviderClient fusedLocationClient;
    private Geofence geofence;
    private GeofencingClient geofencingClient;
    private PendingIntent geofencePendingIntent;
    private static final String TAG = "MainActivity_";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the geofence
        geofence = createGeofence();

        // Create geofence request
        GeofencingRequest request = getGeofencingRequest();
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        // Instantiate the pending intent and geofencing client
        geofencePendingIntent = null;
        geofencingClient = LocationServices.getGeofencingClient(this);

        // Check permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        // Add the geofences to be monitored
        geofencingClient.addGeofences(request, getGeofencePendingIntent());

    }


    // Method for creating the geofence
    private Geofence createGeofence() {
        Log.d(TAG, "createGeofence");
        return new Geofence.Builder()
                .setRequestId("Home")
                .setCircularRegion(Latitude, Longitude, GEOFENCE_RADIUS_IN_METERS)
                .setExpirationDuration(GEOFENCE_EXPIRATION_IN_MILLISECONDS)
                .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER |
                        Geofence.GEOFENCE_TRANSITION_EXIT |
                        Geofence.GEOFENCE_TRANSITION_DWELL)
                .setLoiteringDelay(0)
                .build();
    }

    // Method that creates the geofencing request
    private GeofencingRequest getGeofencingRequest() {
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.addGeofence(geofence);
        return builder.build();
    }

    // Method that creates the geofencing pending intent
    private PendingIntent getGeofencePendingIntent() {
        // Reuse the PendingIntent if we already have it.
        if (geofencePendingIntent != null) {
            return geofencePendingIntent;
        }
        Intent intent = new Intent(this, GeofenceBroadcastReceiver.class);
        // We use FLAG_UPDATE_CURRENT so that we get the same pending intent back when
        // calling addGeofences() and removeGeofences().
        geofencePendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.
                FLAG_UPDATE_CURRENT);
        return geofencePendingIntent;
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = "Thanks for your reply!\nStay healthy and enjoy Indy!";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        /* Check which radio button was clicked
        TO_DO Check if this works once connected to
        application
         */
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    // Button for "almost empty"
                    break;
            case R.id.radioButton2:
                if (checked)
                    // Button for "moderate"
                    break;
            case R.id.radioButton3:
                if (checked)
                    // Button for "packed"
                    break;

        }

        switch(view.getId()) {
            case R.id.radioButton5:
                if(checked)
                    // Button for "yes"
                    break;
            case R.id.radioButton6:
                if(checked)
                    // Button for "no"
                    break;
        }

        switch(view.getId()) {
            case R.id.radioButton7:
                if(checked)
                    // Button for "0-33%"
                    break;
            case R.id.radioButton8:
                if(checked)
                    // Button for "34-66"
                    break;
            case R.id.radioButton9:
                if(checked)
                    // Button for "67-100"
                    break;
        }

        switch(view.getId()) {
            case R.id.radioButton10:
                if(checked)
                    // Button for "yes"
                    break;
            case R.id.radioButton11:
                if(checked)
                    //Button for "no"
                    break;
        }
    }
}