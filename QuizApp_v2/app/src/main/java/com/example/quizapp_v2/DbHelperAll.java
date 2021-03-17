package com.example.quizapp_v2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


import androidx.annotation.Nullable;

import java.lang.reflect.Array;


public class DbHelperAll extends SQLiteOpenHelper {

    //DB version, table and database name
    private static final int DB_VERSION = 2;
    private static final String DB_NAME = "quizdb2";
    private static final String DB_TABLE = "quiztableAll";



    //table column names news
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTA = "optA";
    private static final String KEY_OPTB = "optB";
    private static final String KEY_OPTC = "optC";
    private static final String KEY_OPTD = "optD";
    private static final String KEY_USER_TYPE = "userType";
    private static final String KEY_SUBJECT = "subject";
    private static final String KEY_QUESTION_TYPE = "questionType";



    private SQLiteDatabase dbase;
    private int rowCount = 0;



    public DbHelperAll(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sqlQuery = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT  )", DB_TABLE, KEY_ID, KEY_QUES, KEY_ANSWER, KEY_OPTA, KEY_OPTB, KEY_OPTC,KEY_OPTD, KEY_USER_TYPE, KEY_SUBJECT, KEY_QUESTION_TYPE);

        Log.d("TaskDBHelper", "Query to form table" + sqlQuery);
        db.execSQL(sqlQuery);
        addQuestions();


    }


    private void addQuestions() {
        QuestionAll q1 = new QuestionAll("Which company is the largest manufacturer of network equipment ?", "HP", "IBM", "CICSO", "Hawai","CISCO","a","film","mcq");
        this.addQuestionToDB(q1);
        QuestionAll q2 = new QuestionAll("Which of the following is NOT an operating system ?", "Linux", "BIOS", "DOS", "Hawai","BIOS","a","film","mcq");
        this.addQuestionToDB(q2);
        QuestionAll q3 = new QuestionAll("Who is the founder of Apple Inc. ?", "Jose Thomas", "Bill Gates", "Hawai","Steve Jobs", "Steve Jobs","a","science","mcq");
        this.addQuestionToDB(q3);
        QuestionAll q4 = new QuestionAll("Who is the first cricketer to score an international double century in 50-over match ?", "Hawai","Ricky Ponting", "Sachin Tendulkar", "Brian Lara", "Sachin Tendulkar","a","science","mcq");
        this.addQuestionToDB(q4);
        QuestionAll q5 = new QuestionAll("Which is the biggest largest city in the world ?", "Vienna", "Reno", "Hawai","Delhi", "Reno","a","science","mcq");
        this.addQuestionToDB(q5);
        QuestionAll q6 = new QuestionAll("Which is the biggest desert in in the world ?", "Thar", "Hawai","Sahara", "Mohave", "Sahara","a","sports","mcq");
        this.addQuestionToDB(q6);
        QuestionAll q7 = new QuestionAll("Which is the the largest coffee growing country in the world ?", "Brazil", "India", "Hawai","Myanmar", "Brazil","a","sports","mcq");
        this.addQuestionToDB(q7);
        QuestionAll q8 = new QuestionAll("Which is the longest river in the world ?", "Ganga", "Amazon", "Nile","Hawai", "Nile","a","sports","mcq");
        this.addQuestionToDB(q8);
        QuestionAll q9 = new QuestionAll("Which country is known as the country of copper ?", "Somalia", "Cameroon", "Zambia", "Hawai","Zambia","a","international","mcq");
        this.addQuestionToDB(q9);
        QuestionAll q10 = new QuestionAll("Which is the world's oldest known city ?", "Rome", "Damascus", "Jerusalem","Hawai", "Damascus","a","international","mcq");
        this.addQuestionToDB(q10);
        QuestionAll q11 = new QuestionAll("Who is the first Prime minister of India ?", "Jawaharlal Nehru", "Dr.Rajendra Prasad", "Lal Bahadur Shasthri", "Hawai","Jawaharlal Nehru","a","international","mcq");
        this.addQuestionToDB(q11);
        QuestionAll q12 = new QuestionAll("Which city is known as the city of canals ?", "Paris", "Venice", "London","Hawai", "Venice","a","international","mcq");
        this.addQuestionToDB(q12);
        QuestionAll q13 = new QuestionAll("Australia was discovered by ?", "James Cook", "Hawai","Columbus", "Magallan", "James Cook","a","history","mcq");
        this.addQuestionToDB(q13);
        QuestionAll q14 = new QuestionAll("The national flower of Britain is ?", "Lily", "Hawai","Rose", "Lotus", "Rose","a","history","mcq");
        this.addQuestionToDB(q14);
        QuestionAll q15 = new QuestionAll("The red cross was founded by ?", "Gullivar Crossby", "Hawai","Alexandra Maria Lara", "Jean Henri Durant", "Jean Henri Durant","a","bangladesh","mcq");
        this.addQuestionToDB(q15);
        QuestionAll q16 = new QuestionAll("Which place is known as the roof of the world ?", "Alphs", "Hawai","Tibet", "Nepal", "Tibet","a","bangladesh","mcq");
        this.addQuestionToDB(q16);
        QuestionAll q17 = new QuestionAll("Who invented washing machine ?", "James King", "Hawai","Alfred Vincor", "Christopher Marcossi", "James King","a","bangladesh","mcq");
        this.addQuestionToDB(q17);
        QuestionAll q18 = new QuestionAll("Who won the Football world Cup in 2014 ?", "Italy", "Hawai","Argentina", "Germany", "Germany","a","news","mcq");
        this.addQuestionToDB(q18);
        QuestionAll q19 = new QuestionAll("Who won the Cricket World cup in 2011 ?", "Hawai","Australia", "India", "England", "India","a","news","mcq");
        this.addQuestionToDB(q19);
        QuestionAll q20 = new QuestionAll("The number regarded as the lucky number in Italy is ?", "13","Hawai", "7", "9", "13","a","news","mcq");
        this.addQuestionToDB(q20);

    }

    public void addQuestionToDB(QuestionAll q){
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, q.getQuestion());
        values.put(KEY_ANSWER,q.getAnswer());
        values.put(KEY_OPTA,q.getOptA());
        values.put(KEY_OPTB,q.getOptB());
        values.put(KEY_OPTC,q.getOptC());
        values.put(KEY_OPTD,q.getOptD());
        values.put(KEY_USER_TYPE,q.getUserType());
        values.put(KEY_SUBJECT,q.getSubject());
        values.put(KEY_QUESTION_TYPE,q.getQuestionType());
        dbase.insert(DB_TABLE, null, values);
    }


    Cursor readAllDataNews(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        rowCount = cursor.getCount();

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataFilm(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataBangladesh(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataHistory(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataInternational(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataScience(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }


    Cursor readAllDataSports(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " +KEY_SUBJECT+ " = " + " \"news\" ";
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS "+DB_TABLE);
        onCreate(db);
    }


    public int getRowCount(){
        return rowCount;
    }
}
