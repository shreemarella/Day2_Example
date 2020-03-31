package com.shreemarella.day2_example;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle();


    }

    private void setTitle()
    {
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setIcon(R.drawable.ic_action_dollar);
        mActionBar.setTitle("Hello Shree");
        mActionBar.setSubtitle("Thank You");

    }
}
