package com.example.android;

import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RechercheChambre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recherche_chambre);

        TextView NomRef =(TextView) findViewById(R.id.editTextName);
        TextView Date =(TextView) findViewById(R.id.editTextDate);
        Spinner spinnerNbPersonne = (Spinner) findViewById(R.id.spinnerNbPersonne);


    }
}