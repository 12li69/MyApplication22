package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InfoActivity3 extends AppCompatActivity {

    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);
        button9=findViewById(R.id.button9);

        button9.setOnClickListener(view -> {
            Intent intent=new Intent(InfoActivity3.this,ActionActivity.class);
            startActivity(intent);
        });
    }
}