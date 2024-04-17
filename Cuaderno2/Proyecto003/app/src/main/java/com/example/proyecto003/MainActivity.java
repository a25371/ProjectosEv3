package com.example.proyecto003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumero1,edtNumero2;
    private TextView txt1;
    private RadioButton rbtn1,rbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero1=findViewById(R.id.edtNumero1);
        edtNumero2=findViewById(R.id.edtNumero2);
        txt1=findViewById(R.id.txt1);
        rbtn1=findViewById(R.id.rbtn1);
        rbtn2=findViewById(R.id.rbtn2);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view) {
        String valor1=edtNumero1.getText().toString();
        String valor2=edtNumero2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        if (rbtn1.isChecked()==true) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            txt1.setText(resu);
        } else
        if (rbtn2.isChecked()==true) {
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            txt1.setText(resu);
        }
    }
}