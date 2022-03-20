package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counterOfPointsGroup20it17=0;
    int counterOfPointsGroup20it19=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counterOfPointsGroup20it17")
                && savedInstanceState.containsKey("counterOfPointsGroup20it19")) {
            counterOfPointsGroup20it17 = savedInstanceState.getInt("counterOfPointsGroup20it17");
            counterOfPointsGroup20it19 = savedInstanceState.getInt("counterOfPointsGroup20it19");

        }
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.txt_view);
        textView.setText(counterOfPointsGroup20it17+"    :    "+counterOfPointsGroup20it19);
    }

    public void onClickAddPointTo20it17(View view) {
        counterOfPointsGroup20it17++;
        TextView textView = findViewById(R.id.txt_view);
        textView.setText(counterOfPointsGroup20it17+"    :    "+counterOfPointsGroup20it19);
    }

    public void onClickAddPointTo20it19(View view) {
        counterOfPointsGroup20it19++;
        TextView textView = findViewById(R.id.txt_view);
        textView.setText(counterOfPointsGroup20it17+"    :    "+counterOfPointsGroup20it19);
    }

    public void onClickReset(View view){
        TextView textView = findViewById(R.id.txt_view);
        counterOfPointsGroup20it17 = 0;
        counterOfPointsGroup20it19 = 0;
        textView.setText(counterOfPointsGroup20it17+"    :    "+counterOfPointsGroup20it19);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("counterOfPointsGroup20it17", counterOfPointsGroup20it17);
        outState.putInt("counterOfPointsGroup20it19", counterOfPointsGroup20it19);
    }


}