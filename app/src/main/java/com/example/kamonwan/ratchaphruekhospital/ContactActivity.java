package com.example.kamonwan.ratchaphruekhospital;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContactActivity extends FragmentActivity {
    GoogleMap mMap;
    Marker mMarker;
    LocationManager lm;
    double lat, lng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
//        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map).getMap();
    }

//    LocationListener listener = new LocationListener() {
//        @Override
//        public void onLocationChanged(Location location) {
//            LatLng coordinate = new LatLng(location.getLatitude(), location.getLongitude());
//            lat = location.getLatitude();
//            lng = location.getLongitude();
//            if (mMarker != null) {
//                mMarker.remove();
//                mMarker = mMap.addMarker(new MarkerOptions().position(new LatLng(lat, lng)));
//                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinate, 16));
//            }
//
//        }
//
//        @Override
//        public void onStatusChanged(String provider, int status, Bundle extras) {
//
//        }
//
//        @Override
//        public void onProviderEnabled(String provider) {
//
//        }
//
//        @Override
//        public void onProviderDisabled(String provider) {
//
//        }
//    };
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//        boolean isNetwork = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
//        boolean isGPS = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
//        if (isNetwork) {
//            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//                // TODO: Consider calling
//                //    ActivityCompat#requestPermissions
//                // here to request the missing permissions, and then overriding
//                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                //                                          int[] grantResults)
//                // to handle the case where the user grants the permission. See the documentation
//                // for ActivityCompat#requestPermissions for more details.
//                return;
//            }
//            lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 10, listener);
//            Location loc = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
//            if (loc != null) {
//                lat = loc.getLatitude();
//                lng = loc.getLongitude();
//            }
//        }
//        if (isGPS) {
//            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 10, listener);
//            Location loc = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
//            if (loc != null) {
//                lat = loc.getLatitude();
//                lng = loc.getLongitude();
//            }
//        }
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        lm.removeUpdates(listener);
//    }
}