package com.example.quizapp_v2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;



public class ExamCustomAdapter extends RecyclerView.Adapter<ExamCustomAdapter.ViewHolder> {

//    SparseBooleanArray mStateButtons = new SparseBooleanArray();
    Context context;
    private OnNoteListener onNoteListener;

//    private final ClickListener listener;
    ArrayList id, question, answer, optionOne, optionTwo, optionThree, optionFour;
    String stringAnswer,stringButton1, stringButton2, stringButton3, stringButton4;



    ExamCustomAdapter(Context context,
                      OnNoteListener onNoteListener,
                      ArrayList id,
                      ArrayList question,
                      ArrayList answer,
                      ArrayList optionOne,
                      ArrayList optionTwo,
                      ArrayList optionThree,
                      ArrayList optionFour

    ){
        this.context = context;
//        this.listener = listener;
        this.onNoteListener = onNoteListener;
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.my_exam_row, parent, false);


        return new ExamCustomAdapter.ViewHolder(view, onNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

//        final int currentPosition = holder.getAdapterPosition();

//        ImageView imageViewCorrectOpt1 = holder.imageViewCorrectOpt1;
//        ImageView imageViewCorrectOpt2 = holder.imageViewCorrectOpt2;
//        ImageView imageViewCorrectOpt3 = holder.imageViewCorrectOpt3;
//        ImageView imageViewCorrectOpt4 = holder.imageViewCorrectOpt4;
//
//        ImageView imageViewWrongOpt1 = holder.imageViewWrongOpt1;
//        ImageView imageViewWrongOpt2 = holder.imageViewWrongOpt2;
//        ImageView imageViewWrongOpt3 = holder.imageViewWrongOpt3;
//        ImageView imageViewWrongOpt4 = holder.imageViewWrongOpt4;

//        if(mStateButtons.valueAt(currentPosition)) {
//            // state is true, so the button need to be hide.
//            imageViewCorrectOpt1.setVisibility(View.VISIBLE);
//            imageViewWrongOpt1.setVisibility(View.VISIBLE);
//
//            imageViewCorrectOpt2.setVisibility(View.VISIBLE);
//            imageViewWrongOpt2.setVisibility(View.VISIBLE);
//
//            imageViewCorrectOpt3.setVisibility(View.VISIBLE);
//            imageViewWrongOpt3.setVisibility(View.VISIBLE);
//
//            imageViewCorrectOpt4.setVisibility(View.VISIBLE);
//            imageViewWrongOpt4.setVisibility(View.VISIBLE);
//        } else {
//            // default value is valse, which is we set as visible.
//            imageViewCorrectOpt1.setVisibility(View.GONE);
//            imageViewWrongOpt1.setVisibility(View.GONE);
//
//            imageViewCorrectOpt2.setVisibility(View.GONE);
//            imageViewWrongOpt2.setVisibility(View.GONE);
//
//            imageViewCorrectOpt3.setVisibility(View.GONE);
//            imageViewWrongOpt3.setVisibility(View.GONE);
//
//            imageViewCorrectOpt4.setVisibility(View.GONE);
//            imageViewWrongOpt4.setVisibility(View.GONE);
//        }


        holder.idTxt.setText(String.valueOf(id.get(position)));
        holder.questionTxt.setText(String.valueOf(question.get(position)));
        holder.examAnswerTxt.setText(String.valueOf(answer.get(position)));
        holder.buttonOpt1.setText(String.valueOf(optionOne.get(position)));
        holder.buttonOpt2.setText(String.valueOf(optionTwo.get(position)));
        holder.buttonOpt3.setText(String.valueOf(optionThree.get(position)));
        holder.buttonOpt4.setText(String.valueOf(optionFour.get(position)));


//        holder.imageViewCorrectOpt1.setVisibility(View.GONE);
//        holder.imageViewCorrectOpt2.setVisibility(View.GONE);
//        holder.imageViewCorrectOpt3.setVisibility(View.GONE);
//        holder.imageViewCorrectOpt4.setVisibility(View.GONE);
//        holder.imageViewWrongOpt1.setVisibility(View.GONE);
//        holder.imageViewWrongOpt2.setVisibility(View.GONE);
//        holder.imageViewWrongOpt3.setVisibility(View.GONE);
//        holder.imageViewWrongOpt4.setVisibility(View.GONE);

        holder.imageViewCorrectOpt1.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt2.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt3.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt4.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);

        holder.imageViewCorrectOpt1.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt2.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt3.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt4.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);

        holder.imageViewCorrectOpt1.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt2.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt3.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt4.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);

        holder.imageViewCorrectOpt1.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt2.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt3.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewCorrectOpt4.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);


        holder.imageViewWrongOpt1.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt2.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt3.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt4.setVisibility(holder.buttonOpt1.isActivated()? View.VISIBLE : View.GONE);

        holder.imageViewWrongOpt1.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt2.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt3.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt4.setVisibility(holder.buttonOpt2.isActivated()? View.VISIBLE : View.GONE);

        holder.imageViewWrongOpt1.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt2.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt3.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt4.setVisibility(holder.buttonOpt3.isActivated()? View.VISIBLE : View.GONE);

        holder.imageViewWrongOpt1.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt2.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt3.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);
        holder.imageViewWrongOpt4.setVisibility(holder.buttonOpt4.isActivated()? View.VISIBLE : View.GONE);

        holder.buttonOpt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

//               Toast.makeText(view.getContext()," Button 1: "+ holder.buttonOpt1.getText()+"\n"+ " Answer: "+ holder.examAnswerTxt.getText(),Toast.LENGTH_LONG ).show();
                    if(holder.buttonOpt1.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt1.setVisibility(view.VISIBLE);

                    }
                    else{
                        holder.imageViewWrongOpt1.setVisibility(view.VISIBLE);
                        if(holder.buttonOpt2.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                            holder.imageViewCorrectOpt2.setVisibility(view.VISIBLE);

                        }
                        else if(holder.buttonOpt3.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                            holder.imageViewCorrectOpt3.setVisibility(view.VISIBLE);
                        }

                        else if(holder.buttonOpt4.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                            holder.imageViewCorrectOpt4.setVisibility(view.VISIBLE);

                        }


                    }

           }
       });

        holder.buttonOpt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(view.getContext()," Button 1: "+ holder.buttonOpt2.getText()+"\n"+ " Answer: "+ holder.examAnswerTxt.getText(),Toast.LENGTH_LONG ).show();
                if(holder.buttonOpt2.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                    holder.imageViewCorrectOpt2.setVisibility(view.VISIBLE);

                }
                else{
                    holder.imageViewWrongOpt2.setVisibility(view.VISIBLE);

                    if(holder.buttonOpt1.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt1.setVisibility(view.VISIBLE);

                    }
                    else if(holder.buttonOpt3.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt3.setVisibility(view.VISIBLE);
//                        holder.imageViewWrongOpt2.setVisibility(view.VISIBLE);
                    }

                    else if(holder.buttonOpt4.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt4.setVisibility(view.VISIBLE);
//                        holder.imageViewWrongOpt2.setVisibility(view.VISIBLE);
                    }

                }

            }
        });


        holder.buttonOpt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(view.getContext()," Button 1: "+ holder.buttonOpt3.getText()+"\n"+ " Answer: "+ holder.examAnswerTxt.getText(),Toast.LENGTH_LONG ).show();
                if(holder.buttonOpt3.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                    holder.imageViewCorrectOpt3.setVisibility(view.VISIBLE);

                }
                else{
                    holder.imageViewWrongOpt3.setVisibility(view.VISIBLE);

                    if(holder.buttonOpt1.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt1.setVisibility(view.VISIBLE);
//                        holder.imageViewWrongOpt3.setVisibility(view.VISIBLE);
                    }
                    else if(holder.buttonOpt2.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt2.setVisibility(view.VISIBLE);

                    }

                    else if(holder.buttonOpt4.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt4.setVisibility(view.VISIBLE);
//                        holder.imageViewWrongOpt3.setVisibility(view.VISIBLE);
                    }

                }

            }
        });

        holder.buttonOpt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(view.getContext()," Button 1: "+ holder.buttonOpt4.getText()+"\n"+ " Answer: "+ holder.examAnswerTxt.getText(),Toast.LENGTH_LONG ).show();
                if(holder.buttonOpt4.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                    holder.imageViewCorrectOpt4.setVisibility(view.VISIBLE);

                }
                else{

                    holder.imageViewWrongOpt4.setVisibility(view.VISIBLE);
                    if(holder.buttonOpt1.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt1.setVisibility(view.VISIBLE);

                    }
                    else if(holder.buttonOpt2.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt2.setVisibility(view.VISIBLE);

                    }

                    else if(holder.buttonOpt3.getText().toString().trim().equals(holder.examAnswerTxt.getText().toString().trim()) ){
                        holder.imageViewCorrectOpt3.setVisibility(view.VISIBLE);

                    }

                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return id.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private WeakReference<ClickListener> listenerRef;
        TextView idTxt, questionTxt, examAnswerTxt;
        Button buttonOpt1, buttonOpt2, buttonOpt3, buttonOpt4;
        ImageView imageViewCorrectOpt1, imageViewCorrectOpt2, imageViewCorrectOpt3, imageViewCorrectOpt4;
        ImageView imageViewWrongOpt1, imageViewWrongOpt2, imageViewWrongOpt3, imageViewWrongOpt4;

        OnNoteListener onNoteListener;

        public ViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);

//            listenerRef = new WeakReference<>(listener);

            idTxt = itemView.findViewById(R.id.idExamTxt);
            questionTxt = itemView.findViewById(R.id.questionExamTxt);
            examAnswerTxt = itemView.findViewById(R.id.examAnswerTxt);

            buttonOpt1 = itemView.findViewById(R.id.buttonOpt1);
            buttonOpt2 = itemView.findViewById(R.id.buttonOpt2);
            buttonOpt3 = itemView.findViewById(R.id.buttonOpt3);
            buttonOpt4 = itemView.findViewById(R.id.buttonOpt4);

            imageViewCorrectOpt1 = itemView.findViewById(R.id.imageViewCorrectOpt1);
            imageViewCorrectOpt2 = itemView.findViewById(R.id.imageViewCorrectOpt2);
            imageViewCorrectOpt3 = itemView.findViewById(R.id.imageViewCorrectOpt3);
            imageViewCorrectOpt4 = itemView.findViewById(R.id.imageViewCorrectOpt4);

            imageViewWrongOpt1 = itemView.findViewById(R.id.imageViewWrongOpt1);
            imageViewWrongOpt2 = itemView.findViewById(R.id.imageViewWrongOpt2);
            imageViewWrongOpt3 = itemView.findViewById(R.id.imageViewWrongOpt3);
            imageViewWrongOpt4 = itemView.findViewById(R.id.imageViewWrongOpt4);

            this.onNoteListener = onNoteListener;


        }

        @Override
        public void onClick(View view) {

            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }

    public interface OnNoteListener{
        void onNoteClick(int position);

    }

}
