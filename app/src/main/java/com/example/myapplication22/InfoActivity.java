package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {

    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        button6=findViewById(R.id.button6);

        button6.setOnClickListener(view -> {
            Intent intent=new Intent(InfoActivity.this,ActionActivity.class);
            startActivity(intent);
        });
    }
}