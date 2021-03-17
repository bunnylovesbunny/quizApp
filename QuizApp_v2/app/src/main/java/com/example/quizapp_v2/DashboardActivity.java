package com.example.quizapp_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class DashboardActivity extends AppCompatActivity {

    private Button buttonExam, buttonLearn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        buttonLearn = (Button) findViewById(R.id.buttonLearn);
        buttonExam = (Button) findViewById(R.id.buttonExam);

        final String userType=getIntent().getStringExtra("userType");
        Toast.makeText(DashboardActivity.this, "Logged in as: "+userType,
                Toast.LENGTH_LONG).show();

        buttonLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //fetchLocation();
                Intent i = new Intent(DashboardActivity.this, LearnActivity.class);
                startActivity(i);

            }
        });

        buttonExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DashboardActivity.this, ExamActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });


    }
}