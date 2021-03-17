package com.example.quizapp_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonLogin;
    private TextInputEditText editTextUsername, editTextPassword;

    String jco = "jco@abc";
    String jcopassword = "jco123";

    String officer = "officer@abc";
    String officerpassword = "officer123";

    String others = "others@abc";
    String otherspassword = "others123";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);

        editTextUsername = (TextInputEditText) findViewById(R.id.editTextUsername);
        editTextPassword = (TextInputEditText) findViewById(R.id.editTextPassword);




        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editTextUsername.getText().toString().trim().equals(jco) && editTextPassword.getText().toString().trim().equals(jcopassword))
                {
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    String s = "jco";
                    i.putExtra("userType", s);
                    startActivity(i);

                }
                else if(editTextUsername.getText().toString().trim().equals(officer) && editTextPassword.getText().toString().trim().equals(officerpassword))
                {
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    String s = "officer";
                    i.putExtra("userType", s);
                    startActivity(i);

                }
                else if(editTextUsername.getText().toString().trim().equals(others) && editTextPassword.getText().toString().trim().equals(otherspassword))
                {
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    String s = "others";
                    i.putExtra("userType", s);
                    startActivity(i);

                }

                else{

                    Toast.makeText(MainActivity.this, "Login Unsuccessful",
                            Toast.LENGTH_SHORT).show();

                }
//                Intent i = new Intent(MainActivity.this, DashboardActivity.class);
//                startActivity(i);
                // fetchLocation();


            }
        });

    }
}