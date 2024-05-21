package com.seas.usuario.grouponandroidstudiov2;


import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.seas.usuario.grouponandroidstudiov2.threads.ServiceLogin;
import com.seas.usuario.grouponandroidstudiov2.tools.Post;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class LoginActivity extends Activity {
	private EditText edtEmail;
	private EditText edtPass;
	private Button btnLogin;

	private static LoginActivity loginActivity;
	public static LoginActivity getInstance(){
		return loginActivity;
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		loginActivity = this;
		
		edtEmail = (EditText) findViewById(R.id.edtEmail);
		edtPass = (EditText) findViewById(R.id.edtPass);
		

        btnLogin = (Button) findViewById(R.id.btnEnviar);
	        
	        btnLogin.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					ServiceLogin.accionLogin(edtEmail.getText().toString(), edtPass.getText().toString());
				}
			});
	}





}
