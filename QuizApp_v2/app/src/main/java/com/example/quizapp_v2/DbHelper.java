package com.example.quizapp_v2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


public class DbHelper extends SQLiteOpenHelper {

    //DB version, table and database name
    private static final int DB_VERSION = 3;
    private static final String DB_NAME = "quizdb";
    private static final String DB_TABLE = "quiztable";

    //table column names
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

    public DbHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
//        String sqlQuery = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT  )", DB_TABLE, KEY_ID, KEY_QUES, KEY_ANSWER, KEY_OPTA, KEY_OPTB, KEY_OPTC,KEY_OPTD);
        String sqlQuery = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT  )", DB_TABLE, KEY_ID, KEY_QUES, KEY_ANSWER, KEY_OPTA, KEY_OPTB, KEY_OPTC,KEY_OPTD, KEY_USER_TYPE, KEY_SUBJECT, KEY_QUESTION_TYPE);

        Log.d("TaskDBHelper", "Query to form table" + sqlQuery);
        db.execSQL(sqlQuery);
        addQuestions();
    }




//    private void addQuestions() {
//        Question q1 = new Question("Which company is the largest manufacturer of network equipment ?", "HP", "IBM", "CICSO", "Hawai","CISCO");
//        this.addQuestionToDB(q1);
//        Question q2 = new Question("Which of the following is NOT an operating system ?", "Linux", "BIOS", "DOS", "Hawai","BIOS");
//        this.addQuestionToDB(q2);
//        Question q3 = new Question("Who is the founder of Apple Inc. ?", "Jose Thomas", "Bill Gates", "Hawai","Steve Jobs", "Steve Jobs");
//        this.addQuestionToDB(q3);
//        Question q4 = new Question("Who is the first cricketer to score an international double century in 50-over match ?", "Hawai","Ricky Ponting", "Sachin Tendulkar", "Brian Lara", "Sachin Tendulkar");
//        this.addQuestionToDB(q4);
//        Question q5 = new Question("Which is the biggest largest city in the world ?", "Vienna", "Reno", "Hawai","Delhi", "Reno");
//        this.addQuestionToDB(q5);
//        Question q6 = new Question("Which is the biggest desert in in the world ?", "Thar", "Hawai","Sahara", "Mohave", "Sahara");
//        this.addQuestionToDB(q6);
//        Question q7 = new Question("Which is the the largest coffee growing country in the world ?", "Brazil", "India", "Hawai","Myanmar", "Brazil");
//        this.addQuestionToDB(q7);
//        Question q8 = new Question("Which is the longest river in the world ?", "Ganga", "Amazon", "Nile","Hawai", "Nile");
//        this.addQuestionToDB(q8);
//        Question q9 = new Question("Which country is known as the country of copper ?", "Somalia", "Cameroon", "Zambia", "Hawai","Zambia");
//        this.addQuestionToDB(q9);
//        Question q10 = new Question("Which is the world's oldest known city ?", "Rome", "Damascus", "Jerusalem","Hawai", "Damascus");
//        this.addQuestionToDB(q10);
//        Question q11 = new Question("Who is the first Prime minister of India ?", "Jawaharlal Nehru", "Dr.Rajendra Prasad", "Lal Bahadur Shasthri", "Hawai","Jawaharlal Nehru");
//        this.addQuestionToDB(q11);
//        Question q12 = new Question("Which city is known as the city of canals ?", "Paris", "Venice", "London","Hawai", "Venice");
//        this.addQuestionToDB(q12);
//        Question q13 = new Question("Australia was discovered by ?", "James Cook", "Hawai","Columbus", "Magallan", "James Cook");
//        this.addQuestionToDB(q13);
//        Question q14 = new Question("The national flower of Britain is ?", "Lily", "Hawai","Rose", "Lotus", "Rose");
//        this.addQuestionToDB(q14);
//        Question q15 = new Question("The red cross was founded by ?", "Gullivar Crossby", "Hawai","Alexandra Maria Lara", "Jean Henri Durant", "Jean Henri Durant");
//        this.addQuestionToDB(q15);
//        Question q16 = new Question("Which place is known as the roof of the world ?", "Alphs", "Hawai","Tibet", "Nepal", "Tibet");
//        this.addQuestionToDB(q16);
//        Question q17 = new Question("Who invented washing machine ?", "James King", "Hawai","Alfred Vincor", "Christopher Marcossi", "James King");
//        this.addQuestionToDB(q17);
//        Question q18 = new Question("Who won the Football world Cup in 2014 ?", "Italy", "Hawai","Argentina", "Germany", "Germany");
//        this.addQuestionToDB(q18);
//        Question q19 = new Question("Who won the Cricket World cup in 2011 ?", "Hawai","Australia", "India", "England", "India");
//        this.addQuestionToDB(q19);
//        Question q20 = new Question("The number regarded as the lucky number in Italy is ?", "13","Hawai", "7", "9", "13");
//        this.addQuestionToDB(q20);
//
//    }
//
//    public void addQuestionToDB(Question q){
//        ContentValues values = new ContentValues();
//        values.put(KEY_QUES, q.getQuestion());
//        values.put(KEY_ANSWER,q.getAnswer());
//        values.put(KEY_OPTA,q.getOptA());
//        values.put(KEY_OPTB,q.getOptB());
//        values.put(KEY_OPTC,q.getOptC());
//        values.put(KEY_OPTD,q.getOptD());
//        dbase.insert(DB_TABLE, null, values);
//    }


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

    public List <Question> getAllQuestions(){
        List <Question> questionList = new ArrayList<Question>();

        dbase = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM "+DB_TABLE;
        Cursor cursor = dbase.rawQuery(selectQuery,null);
        rowCount = cursor.getCount();

        if(cursor.moveToFirst()){
            do{
                Question q = new Question();
                q.setId(cursor.getInt(0));
                q.setQuestion(cursor.getString(1));
                q.setAnswer(cursor.getString(2));
                q.setOptA(cursor.getString(3));
                q.setOptB(cursor.getString(4));
                q.setOptC(cursor.getString(5));
                q.setOptC(cursor.getString(6));
                questionList.add(q);

            }while (cursor.moveToNext());
        }
        return questionList;
    }

    Cursor readAllData(){

        String query = " SELECT * FROM " + DB_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if ( db != null){

            cursor = db.rawQuery(query, null);

        }

        return cursor;

    }

    Cursor readAllDataScience(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'science' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataSports(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'sports' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataNews(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'news' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataHistory(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'science' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataInternational(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'history' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataFilm(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'film' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    Cursor readAllDataBangladesh(){

        String query = " SELECT * FROM " + DB_TABLE + " WHERE " + KEY_SUBJECT + " = 'bangladesh' ";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;
        if ( db != null){
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+DB_TABLE);
        onCreate(db);
    }

    public int getRowCount(){
        return rowCount;
    }
}
