package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InfoActivity2 extends AppCompatActivity {

    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);
        button8=findViewById(R.id.button8);

        button8.setOnClickListener(view -> {
            Intent intent=new Intent(InfoActivity2.this,ActionActivity.class);
            startActivity(intent);
        });
    }
}