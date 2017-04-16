package com.example.sean.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OdgovorActivity extends AppCompatActivity {

    Button odgovrBTN;
    TextView OdgovorLBL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odgovor);

        odgovrBTN = (Button)findViewById(R.id.odgovorBTN);
        OdgovorLBL = (TextView) findViewById(R.id.OdgovorLBL);

        /**
         * Zavrseno sa ID-ovima
         * ---------------------------------------------------------------------*/



        odgovrBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * setOnClickListener SE DOBIJE TAKO DA KREIRAMO NEW i pritisnemo CTR + SSPACE
                 * I PRITISNEM TAB
                 * */




                /**
                 * Ovo je mjesto koje se koristi za
                 * izvođenje funkcionalsnoti
                 * koja se treba izvršiti
                 * kada se pritisne na dugme
                 */

                OdgovorLBL.setText("Ovo je neki odgovor");
                Toast.makeText(getApplicationContext(),"Ovo je neki TOAST",Toast.LENGTH_LONG).show();



            }
        });


    }
}
