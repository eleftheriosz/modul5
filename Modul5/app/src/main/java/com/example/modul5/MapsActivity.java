package com.example.modul5;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.Task;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng batu = new LatLng( -7.871040,  112.526853);
        // Add a marker in Sydney and move the camera
        LatLng alun = new LatLng( -7.871040,  112.526853);
        mMap.addMarker(new MarkerOptions().position(alun).title("Alun - Alun Batu"));
        LatLng selecta = new LatLng(-7.817876, 112.525391);
        mMap.addMarker(new MarkerOptions().position(selecta).title("Selecta"));

        LatLng jtp1 = new LatLng(-7.884200,  112.524827);
        mMap.addMarker(new MarkerOptions().position(jtp1).title("Jawa Timur Park 1"));
        LatLng jtp2 = new LatLng(-7.888957500000001, 112.5296176);
        mMap.addMarker(new MarkerOptions().position(jtp2).title("Jawa Timur Park 2"));
        LatLng jtp3 = new LatLng(-7.896847,  112.553747);
        mMap.addMarker(new MarkerOptions().position(jtp3).title("Jawa Timur Park 3"));
        LatLng angkut = new LatLng(-7.878836, 112.520216);
        mMap.addMarker(new MarkerOptions().position(angkut).title("Museum Angkut"));
        LatLng ECO = new LatLng(-7.887369, 112.528197);
        mMap.addMarker(new MarkerOptions().position(ECO).title("ECO Green Park"));
        LatLng predator = new LatLng(-7.913086,  112.548403);
        mMap.addMarker(new MarkerOptions().position(predator).title("Predator Fun Park"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(batu));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
    }
}

