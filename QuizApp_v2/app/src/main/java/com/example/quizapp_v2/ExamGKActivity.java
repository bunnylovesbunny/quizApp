package com.example.quizapp_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ExamGKActivity extends AppCompatActivity implements ExamCustomAdapter.OnNoteListener {

    List<Question> questionList;
    TextView gkTextView;
    int quid = 0;
    Question currentQuestion;
    DbHelper dbHelper;
    RecyclerView recyclerView;

    ArrayList<String> id, question, answer, optionOne, optionTwo, optionThree, optionFour;
    ExamCustomAdapter examCustomAdapter;
    ClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_g_k);

        dbHelper = new DbHelper(ExamGKActivity.this);
        questionList = dbHelper.getAllQuestions();
        recyclerView = findViewById(R.id.recycleView);
        currentQuestion = questionList.get(quid);

        Toast.makeText(getApplicationContext(), " "+ dbHelper.getRowCount(), Toast.LENGTH_LONG).show();

        id = new ArrayList<>();
        question = new ArrayList<>();
        answer = new ArrayList<>();
        optionOne = new ArrayList<>();
        optionTwo = new ArrayList<>();
        optionThree = new ArrayList<>();
        optionFour = new ArrayList<>();

        storeDataInArray();

        examCustomAdapter = new ExamCustomAdapter(ExamGKActivity.this, this, id, question, answer, optionOne, optionTwo, optionThree, optionFour);
        recyclerView.setAdapter(examCustomAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(ExamGKActivity.this));


    }

    void storeDataInArray(){
        Cursor cursor = dbHelper.readAllData();

        while (cursor.moveToNext()){
            id.add(cursor.getString(0));
            question.add(cursor.getString(1));
            answer.add(cursor.getString(2));
            optionOne.add(cursor.getString(3));
            optionTwo.add(cursor.getString(4));
            optionThree.add(cursor.getString(5));
            optionFour.add(cursor.getString(6));
        }



    }

    @Override
    public void onNoteClick(int position) {
        Toast.makeText(getApplicationContext(), " "+ id.get(position), Toast.LENGTH_SHORT).show();


    }
}