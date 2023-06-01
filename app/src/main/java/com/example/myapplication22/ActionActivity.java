package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActionActivity extends AppCompatActivity {

    Button button,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

        button.setOnClickListener(view -> {
            Intent intent=new Intent(ActionActivity.this,InfoActivity.class);
            startActivity(intent);
        });
        button2.setOnClickListener(view -> {
            Intent intent=new Intent(ActionActivity.this,InfoActivity1.class);
            startActivity(intent);
        });
        button3.setOnClickListener(view -> {
            Intent intent=new Intent(ActionActivity.this,InfoActivity2.class);
            startActivity(intent);
        });
        button4.setOnClickListener(view -> {
            Intent intent=new Intent(ActionActivity.this,InfoActivity3.class);
            startActivity(intent);
        });
    }
}