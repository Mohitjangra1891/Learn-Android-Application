package com.example.learnandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second_ACTIVITY extends AppCompatActivity {
    EditText editText;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = findViewById(R.id.button);
        send = findViewById(R.id.send);
        editText = findViewById(R.id.edit_message);
        TextView textView = findViewById(R.id.text);
        textView.setText(getIntent().getStringExtra("code"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        String messge = editText.getText().toString();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("RESULT", messge);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

        int mode = getIntent().getIntExtra("mode", 0);
        if (mode == 1) {
            editText.setVisibility(View.INVISIBLE);
            send.setVisibility(View.INVISIBLE);
        } else if (mode == 2) {
            editText.setVisibility(View.INVISIBLE);
            send.setVisibility(View.INVISIBLE);
        }


    }
}