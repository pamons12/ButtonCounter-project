package com.example.button_counter_amons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button countButton;
    private Button clearButton;
    private int currentCount=0;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentCount=0;
        countButton = (Button) this.findViewById(R.id.countButton);
        clearButton = (Button) this.findViewById(R.id.clearButton);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount+=1;
                text.setText(String.valueOf(currentCount));
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount=0;
                text.setText(String.valueOf(currentCount));
            }
        });
    }

    @Override
    public void onClick(View v) {
    }
}