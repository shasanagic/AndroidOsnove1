package com.example.sean.geoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.security.AccessController.getContext;

public class QuizActivity extends AppCompatActivity {

    Button prikaziAktivnostBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        //intent se koristi kako bi mogli pokrenuti novu aktivnost
        final Intent myIntent = new Intent(QuizActivity.this,PitanjaActivity.class);

        prikaziAktivnostBTN = (Button) findViewById(R.id.button2);
        prikaziAktivnostBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(myIntent);

            }
        });


    }
}
