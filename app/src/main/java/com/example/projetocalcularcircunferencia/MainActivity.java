package com.example.projetocalcularcircunferencia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.botao);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v) {
                TextInputEditText b = findViewById(R.id.txtInputBase);
                TextInputEditText a = findViewById(R.id.txtInputAltura);
                double base = Double.parseDouble(b.getText().toString());
                double altura = Double.parseDouble(a.getText().toString());
                double resultado = (altura*base)/2;
                TextView resultadoTextView = findViewById(R.id.resultadoTextView);
                resultadoTextView.setText("Area: " + resultado);
            }
        });




    }

}