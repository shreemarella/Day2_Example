package com.shreemarella.day2_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnok = findViewById(R.id.btnGoNext);

        btnok.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        Toast.makeText(FirstActivity.this,"Hello  : " + SecondActivity.class,Toast.LENGTH_SHORT).show();
        Intent mIntent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(mIntent);
        finish();

    }
}