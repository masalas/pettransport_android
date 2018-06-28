package com.example.raphael.pettransport.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.raphael.pettransport.R;

public class ActivityMapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MapsActivity(), "MapaFragmento").addToBackStack("MapaTag").commit();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
            finish();
        } else {
            super.onBackPressed();
        }
    }
}
