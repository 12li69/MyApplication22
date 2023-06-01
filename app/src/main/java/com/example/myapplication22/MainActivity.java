package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button20=findViewById(R.id.button20);

        button20.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,ActionActivity.class);
            startActivity(intent);
        });

    }
}

