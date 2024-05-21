package h.alberto.svalero.com.disenyovisualporcentajes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Elementos de pantalla
    private Button miBotonA;
    private Button miBotonB;
    private Button miBotonC;
    private Button miBotonD;
    private Button miBotonE;
    private Button miBotonF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //InicializarComponentes
        inicializarComponentes();
        // Fin
        miBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Botón A", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void inicializarComponentes(){
        miBotonA = (Button)findViewById(R.id.btnA);
        miBotonB = findViewById(R.id.btnB);
        miBotonC = findViewById(R.id.btnC);
        miBotonD = findViewById(R.id.btnD);
        miBotonE = findViewById(R.id.btnE);
        miBotonF = findViewById(R.id.btnF);
    }
}
