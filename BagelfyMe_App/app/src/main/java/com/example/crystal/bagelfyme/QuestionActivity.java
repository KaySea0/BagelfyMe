package com.example.crystal.bagelfyme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kyle on 10/7/2017.
 */
public class QuestionActivity extends AppCompatActivity {

    private bagelQuiz ourQuiz;

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;

    private TextView tvQNum;
    private TextView tvQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_layout);

        getUIComponents();

        ourQuiz = new bagelQuiz();
    }

    private void getUIComponents() {
        btnOne = (Button) findViewById(R.id.btnOption1);
        btnTwo = (Button) findViewById(R.id.btnOption2);
        btnThree = (Button) findViewById(R.id.btnOption3);
        btnFour = (Button) findViewById(R.id.btnOption4);
        btnFive = (Button) findViewById(R.id.btnOption5);
        btnSix = (Button) findViewById(R.id.btnOption6);

        tvQNum = (TextView) findViewById(R.id.tvQuestionNum);
        tvQuestion = (TextView) findViewById(R.id.tvQuestion);
    }


}
