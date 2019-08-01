package com.eduardo.citizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String valueFromMainActivity = getIntent().getStringExtra("hidden_id");

        tvMessage = findViewById(R.id.tv_message);
        tvMessage.setText(valueFromMainActivity);
    }
}
