package com.example.sean.geoquiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PitanjaActivity extends AppCompatActivity {

    Button dodajPitanjeBTN;
    EditText unesitePitanjeET, prikaziPitanjeET;
    Context _context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitanja);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        _context=this;

        dodajPitanjeBTN= (Button) findViewById(R.id.dodajPitanjeBTN);
        unesitePitanjeET = (EditText) findViewById(R.id.unesiPitanjeET);
        prikaziPitanjeET = (EditText) findViewById(R.id.PrikaziPitanjeET);


        /**
         * Kada trebamo pokrenuiti novu aktivnost, prvo trebamo kreirati novi INTENT
         * INTENT se kreiran an slijedeci nacin
         *
         * Intent _intent = new Intent(      trenutnaKlasa.this,    klasaKojuPozivamo.class);

         * */
        final Intent _intent = new Intent(PitanjaActivity.this,OdgovorActivity.class);



        dodajPitanjeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //unosPitanja();
                /**
                 * Aktivnost pozivamo sa gotovom funkcijom startActivity( intent koji smo predhodno kreirali)*/
                startActivity(_intent);
            }
        });

    }

    public void  unosPitanja()
    {
        String pitanje=unesitePitanjeET.getText().toString();
        prikaziPitanjeET.setText(pitanje);
    }

}
