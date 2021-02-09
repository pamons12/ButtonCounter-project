package com.example.button_counter_amons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button countButton;
    private Button clearButton;
    private int currentCount;
    private TextView currentCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentCountTextView = (TextView) findViewById(R.id.currentCountID);

        if (savedInstanceState != null){
            currentCount = savedInstanceState.getInt("savedCount");
            currentCountTextView.setText(String.valueOf(currentCount));
        }else{
            currentCount=0;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle saveState) {
        super.onSaveInstanceState(saveState);
        saveState.putInt("savedCount",currentCount);
    }

    public void countClicked(View view) {
        currentCount+=1;
        currentCountTextView.setText(String.valueOf(currentCount));
    }

    public void clearClicked(View view) {
        currentCount=0;
        currentCountTextView.setText(String.valueOf(currentCount));
    }
}