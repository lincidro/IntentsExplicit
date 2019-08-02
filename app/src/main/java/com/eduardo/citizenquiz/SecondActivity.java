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

        //
        tvMessage = findViewById(R.id.tv_message);

        //1era forma
        //String valueFromMainActivity = getIntent().getStringExtra("hidden_id");

        //2da forma - Utilizando Bundle para obtener el valor
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String valueFromMainActivity = bundle.getString("hidden_id");
            tvMessage.setText(valueFromMainActivity);
        }
    }
}
