package com.example.misegundofragmento;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private Button btnChange;
    private boolean pantalla = false;
    final Fragmento1 fragmento1 = new Fragmento1();
    final Fragmento2 fragmento2 = new Fragmento2();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarComponentes();

        FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();

            Fragmento1 fragmento1 = new Fragmento1();
            ft.add(R.id.fragmento, fragmento1);
            ft.commit();

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
                if(pantalla){
                    ft.replace(R.id.fragmento, fragmento2);
                    pantalla = false;
                }else{
                    ft.replace(R.id.fragmento, fragmento1);
                    pantalla = true;
                }
                ft.addToBackStack(null);
                ft.commit();

            }
        });
    }
    private void inicializarComponentes(){
        btnChange = (Button) findViewById(R.id.btnChange);
    }
}