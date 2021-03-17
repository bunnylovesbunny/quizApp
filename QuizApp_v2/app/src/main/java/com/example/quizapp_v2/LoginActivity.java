package com.example.quizapp_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private Button  buttonLogin;
    private TextInputEditText editTextUsername, editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        editTextUsername = (TextInputEditText) findViewById(R.id.editTextUsername);
        editTextPassword = (TextInputEditText) findViewById(R.id.editTextPassword);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });




    }
}