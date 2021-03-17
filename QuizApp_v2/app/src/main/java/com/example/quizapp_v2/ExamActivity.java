package com.example.quizapp_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExamActivity extends AppCompatActivity {

    Button  buttonExamGk, buttonExamSports, buttonExamFilm,buttonExamHistory,
            buttonExamScience, buttonExamNews, buttonExamBangladesh,buttonExamInternational;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        buttonExamGk = findViewById(R.id.buttonExamGK);
        buttonExamSports = findViewById(R.id.buttonExamSports);
        buttonExamFilm = findViewById(R.id.buttonExamFilm);
        buttonExamHistory = findViewById(R.id.buttonExamHistory);
        buttonExamScience = findViewById(R.id.buttonExamScience);
        buttonExamNews = findViewById(R.id.buttonExamNews);
        buttonExamBangladesh = findViewById(R.id.buttonExamBangladesh);
        buttonExamInternational = findViewById(R.id.buttonExamInternational);

        buttonExamGk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamGKActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamBangladeshActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamFilmActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamHistoryActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamInternational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamInternationalActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamNewsActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamScienceActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonExamSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ExamActivity.this, ExamSportsActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

    }
}