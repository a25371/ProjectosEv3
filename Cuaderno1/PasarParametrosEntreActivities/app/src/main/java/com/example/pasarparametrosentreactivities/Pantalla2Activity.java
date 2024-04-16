package com.example.pasarparametrosentreactivities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pasarparametrosentreactivities.beans.Usuario;
import com.example.pasarparametrosentreactivities.datos.SeasData;

public class Pantalla2Activity extends AppCompatActivity {
    private TextView txtUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla2);

        txtUser = (TextView)findViewById(R.id.textUserPantalla2);

        //Bundle variables = getIntent().getExtras();
        //String user = variables.getString("USUARIO");

        //Usuario usuario = (Usuario)variables.getSerializable("USUARIO");

        txtUser.setText(SeasData.getUsuario().getEmail());
    }
}