package com.example.quizapp_v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    Context context;
    ArrayList id, question, answer;

    CustomAdapter(Context context,
                  ArrayList id ,
                  ArrayList question ,
                  ArrayList answer
                  ){
        this.context = context;
        this.id = id;
        this.question = question;
        this.answer = answer;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.idTxt.setText(String.valueOf(id.get(position)));
            holder.questionTxt.setText(String.valueOf(question.get(position)));
            holder.answerTxt.setText(String.valueOf(answer.get(position)));
    }

    @Override
    public int getItemCount() {
        return id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView idTxt, questionTxt, answerTxt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            idTxt = itemView.findViewById(R.id.idTxt);
            questionTxt = itemView.findViewById(R.id.questionTxt);
            answerTxt = itemView.findViewById(R.id.answerTxt);

        }
    }


}
