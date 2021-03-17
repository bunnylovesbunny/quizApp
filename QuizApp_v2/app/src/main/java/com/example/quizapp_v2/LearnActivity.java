package com.example.quizapp_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnActivity extends AppCompatActivity {

   Button buttonGk, buttonSports, buttonFilm,buttonHistory, buttonScience, buttonNews, buttonBangladesh,buttonInternational;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        buttonGk = findViewById(R.id.buttonGK);
        buttonSports = findViewById(R.id.buttonSports);
        buttonFilm = findViewById(R.id.buttonFilm);
        buttonHistory = findViewById(R.id.buttonHistory);
        buttonScience = findViewById(R.id.buttonScience);
        buttonNews = findViewById(R.id.buttonNews);
        buttonBangladesh = findViewById(R.id.buttonBangladesh);
        buttonInternational = findViewById(R.id.buttonInternational);


        buttonGk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, GKActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });


        buttonSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, SportsActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });


        buttonFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, FilmActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });


        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, HistoryActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });


        buttonScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, ScienceActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, NewsActivity.class);
                startActivity(i);



            }
        });

        buttonBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, BangladeshActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });

        buttonInternational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LearnActivity.this, InternationalActivity.class);
                startActivity(i);
                // fetchLocation();


            }
        });




    }


}