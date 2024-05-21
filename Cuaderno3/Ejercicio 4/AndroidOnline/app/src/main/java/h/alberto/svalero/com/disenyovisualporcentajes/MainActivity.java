package h.alberto.svalero.com.disenyovisualporcentajes;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;

import java.util.HashMap;

import h.alberto.svalero.com.disenyovisualporcentajes.utils.Post;

public class MainActivity extends AppCompatActivity {
    //Elementos de pantalla
    private Button miBotonA;
    private Button miBotonB;
    private Button miBotonC;
    private Button miBotonD;
    private Button miBotonE;
    private Button miBotonF;
    private EditText edtEmail;
    private EditText edtPassword;
    private Button btnLogin;
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
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // En este punto es donde lanzaremos el qué??
                // AsyncTask!!!
                String resultado = edtEmail.getText().toString()
                        + "-" +
                         edtPassword.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Datos:" + resultado, Toast.LENGTH_SHORT).show();
                // Pasos para lanzar la tarea en segundo plano
                    // y conectar con el Servidor Web
                    //¿Dónde está alojado el Servidor?
                    //¿Cómo se llama el fichero al que quiero acceder?
                    // Y qué parámetros requiere para ejecutarse
                    // URL= http://localhost/groupon/loginGroupon.php
                        // 1º post = EMAIL
                        // 2º post = PASS
                    // Crear el hilo
                    // Lanzarlo
                HashMap<String, String> parametros = new HashMap<String, String>();
                    parametros.put("EMAIL",edtEmail.getText().toString());
                    parametros.put("PASS",edtPassword.getText().toString() );

                TareaSegundoPlano tarea = new TareaSegundoPlano(parametros);
                tarea.execute("http://localhost/groupon/loginGroupon.php");
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
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
    // HILO ASYNCTASK
    class TareaSegundoPlano extends AsyncTask<String, Integer, Boolean> {
        private HashMap<String, String> parametros = null;
        //Comentado: private ArrayList<Cliente> listaClientes = null;

        public TareaSegundoPlano( HashMap<String, String> parametros) {
            super();
            this.parametros = parametros;
        }

        @Override
        protected Boolean  doInBackground(String... params) {
            String url_select = params[0];
            try {
                    Post post = new Post();
                JSONArray result = post.getServerDataPost(parametros,url_select);
                //Comentado: listaClientes = Cliente.getArrayListFromJSon(result);
            } catch (Exception e) {
                Log.e("log_tag", "Error in http connection " + e.toString());
                //messageUser = "Error al conectar con el servidor. ";
            }
            return true;
        }

        @Override
        protected void onPostExecute(Boolean resp) {
            try {
                if(resp){
                    Toast.makeText(MainActivity.this,
                            "Conectados correctamente. ", Toast.LENGTH_SHORT).show();
                }
            }catch (Exception e) {
                // TODO: handle exception
                Log.e("log_tag", "Error parsing data "+e.toString());
            }
        }
    }
}
