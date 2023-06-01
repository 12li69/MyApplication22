package com.example.myapplication22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InfoActivity1 extends AppCompatActivity {

    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info1);
        button7=findViewById(R.id.button7);

        button7.setOnClickListener(view -> {
            Intent intent=new Intent(InfoActivity1.this,ActionActivity.class);
            startActivity(intent);
        });
    }
}