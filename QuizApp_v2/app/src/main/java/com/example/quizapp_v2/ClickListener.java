package com.example.quizapp_v2;

import android.view.View;

public interface ClickListener {

    void onPositionClicked(View v, int position);


    void onPositionClicked(int adapterPosition);
}
