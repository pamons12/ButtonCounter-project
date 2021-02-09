package com.example.button_counter_amons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button countButton;
    private Button minusButton;
    private Button clearButton;
    private int currentCount;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) this.findViewById(R.id.currentCount);
        text.setText("0");
    }

    @Override
    public void onClick(View v) {
        currentCount+=1;
    }
}