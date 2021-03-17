package com.example.quizapp_v2;

public class QuestionAll {

    private int id;
    private String question;
    private String optA;
    private String optB;
    private String optC;
    private String optD;
    private String answer;
    private String userType;
    private  String subject;
    private String questionType;

    public QuestionAll(){
        id=0;
        question = "";
        optA = "";
        optB = "";
        optC = "";
        optD = "";
        answer = "";
        userType = "";
        subject = "";
        questionType = "";
    }



    public QuestionAll(String question, String optA, String optB, String optC, String optD, String answer, String userType, String subject, String questionType){
        this.question = question;
        this.optA = optA;
        this.optB = optB;
        this.optC = optC;
        this.optD = optD;
        this.answer = answer;
        this.userType = userType;
        this.subject = subject;
        this.questionType = questionType;
    }


    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public String getOptD() {
        return optD;
    }

    public String getOptC() {
        return optC;
    }

    public String getOptB() {
        return optB;
    }

    public String getOptA() {
        return optA;
    }

    public String getQuestion() {
        return question;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptA(String optA) {
        this.optA = optA;
    }

    public void setOptB(String optB) {
        this.optB = optB;
    }

    public void setOptC(String optC) {
        this.optC = optC;
    }

    public void setOptD(String optD) {
        this.optC = optD;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}
