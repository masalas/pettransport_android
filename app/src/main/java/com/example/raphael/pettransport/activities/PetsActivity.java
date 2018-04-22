package com.example.raphael.pettransport.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.raphael.pettransport.R;
import com.example.raphael.pettransport.controller.ControllerPet;
import com.example.raphael.pettransport.impl.ControllerPetImpl;
import com.example.raphael.pettransport.models.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetsActivity extends Activity  {

    Button button;
    EditText raio;
    ListView listViewPets;
    ArrayAdapter<String> adaptador;

    ControllerPet controllerPet;

    public PetsActivity() {
        controllerPet = new ControllerPetImpl();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.buscarpets);

        this.button = findViewById(R.id.procurarbotao);
        this.raio = findViewById(R.id.raiotexto);
        this.listViewPets = findViewById(R.id.listViewPets);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscarPets(v);
            }
        });
    }

    public void buscarPets(View view) {
        String raiotxt = this.raio.getText().toString();

        List<Pet> pets = new ArrayList<>();

        try {
            if (raiotxt.isEmpty()){
                pets = controllerPet.getPets();
            }
            else{
                pets = controllerPet.getPetsByRaio(Integer.valueOf(raiotxt));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.petsToString(pets));

        listViewPets.setAdapter(adaptador);
    }

    private List<String> petsToString(List<Pet> pets){
        List<String> petStrings  = new ArrayList<>();
        for (Pet pet : pets) {
            petStrings.add(pet.toString());
        }
        return petStrings;
    }

}



