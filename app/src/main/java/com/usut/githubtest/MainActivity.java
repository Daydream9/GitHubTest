package com.usut.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Nice");
        //GitHub에서 바꿨
        //내가 원하는 추가작업

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
