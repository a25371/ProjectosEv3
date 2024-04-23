package com.example.proyecto041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    RadioButton rb1, rb2;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        rb1 = findViewById(R.id.r1);
        rb2 = findViewById(R.id.r2);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.tv1);
    }

    public void operar(View v) {
        int v1 = Integer.parseInt(et1.getText().toString());
        int v2 = Integer.parseInt(et2.getText().toString());
        if (rb1.isChecked()) {
            int suma = v1 + v2;
            tv2.setText(String.valueOf(suma));
        } else if (rb2.isChecked()) {
            int resta = v1 - v2;
            tv2.setText(String.valueOf(resta));
        }
    }
}