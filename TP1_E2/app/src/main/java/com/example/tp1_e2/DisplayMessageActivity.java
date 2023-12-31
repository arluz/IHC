package com.example.tp1_e2;// DisplayMessageActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        TextView textViewMessage = findViewById(R.id.textViewMessage);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        if (message != null) {
            textViewMessage.setText(message);
        }
    }
}