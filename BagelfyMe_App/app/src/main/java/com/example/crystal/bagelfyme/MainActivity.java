package com.example.crystal.bagelfyme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int resultNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoQuestions(View view) {
        Intent questionIntent = new Intent(MainActivity.this,QuestionActivity.class);
        startActivity(questionIntent);
    }
}
