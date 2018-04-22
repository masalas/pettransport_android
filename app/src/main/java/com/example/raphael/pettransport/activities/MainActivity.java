package com.example.raphael.pettransport.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.raphael.pettransport.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.botaobuscar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirTelaPets(v);
            }
        });
    }

    public void abrirTelaPets(View view){
        Intent intent = new Intent(this, PetsActivity.class);
        startActivity(intent);
    }


}
