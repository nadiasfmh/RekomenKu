package com.nadiasfmh.rekomenku10119278.view.carikuliner;
/*
    nim                 : 10119278
    nama                : Nadia Siti Fatimah
    kelas               : IF-7
*/
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.nadiasfmh.rekomenku10119278.R;


public class CariKulinerFragment extends Fragment implements OnMapReadyCallback{
    private GoogleMap mMap;

    public CariKulinerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cari_kuliner, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.carikulinermap);
        mMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Bandung and move the camera
        LatLng kebun_begonia = new LatLng(-6.8253613916158695, 107.63826737058535);
        LatLng taman_lembah_dewata = new LatLng(-6.810633301072711, 107.6427242301649);
        LatLng stone_mountain = new LatLng(-6.829579212055847, 107.63569074864094);
        LatLng imah_baheula = new LatLng(-6.825652540533795, 107.64281883742389);
        LatLng curug_maribaya = new LatLng(-6.831374864539615, 107.65601274135986);

        mMap.addMarker(new MarkerOptions().position(kebun_begonia).title("Kebun Begonia"));
        mMap.addMarker(new MarkerOptions().position(taman_lembah_dewata).title("Taman Lembah Dewata"));
        mMap.addMarker(new MarkerOptions().position(stone_mountain).title("Stone Mountain"));
        mMap.addMarker(new MarkerOptions().position(imah_baheula).title("Imah Baheula"));
        mMap.addMarker(new MarkerOptions().position(curug_maribaya).title("Curug Maribaya"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(imah_baheula, 14));

    }
}