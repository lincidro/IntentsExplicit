package com.eduardo.citizenquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Button btnCall2nd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall2nd = findViewById(R.id.btn_call_2nd);
        btnCall2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: btnCall2nd");
                startSecondActivity();
            }
        });
    }

    private void startSecondActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("hidden_id","0001");
        startActivity(intent);
    }
}
