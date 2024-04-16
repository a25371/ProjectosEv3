package com.example.androidonline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button miBotonA;
    private Button miBotonB;
    private Button miBotonC;
    private Button miBotonD;
    private Button miBotonE;
    private Button miBotonF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inicializarComponentes();
        
        miBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton A", Toast.LENGTH_SHORT).show();
            }
        });
        miBotonB.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton B", Toast.LENGTH_SHORT).show();
            }
        }));
        miBotonC.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton C", Toast.LENGTH_SHORT).show();
            }
        }));
        miBotonD.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton D", Toast.LENGTH_SHORT).show();
            }
        }));
        miBotonE.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton E", Toast.LENGTH_SHORT).show();
            }
        }));
        miBotonF.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton F", Toast.LENGTH_SHORT).show();
            }
        }));
    }

    private void inicializarComponentes() {
        miBotonA = (Button)findViewById(R.id.btnA);
        miBotonB = (Button)findViewById(R.id.btnB);
        miBotonC = (Button)findViewById(R.id.btnC);
        miBotonD = (Button)findViewById(R.id.btnD);
        miBotonE = (Button)findViewById(R.id.btnE);
        miBotonF = (Button)findViewById(R.id.btnF);
    }
}