package com.example.crystal.bagelfyme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

    static private int questionNum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_layout);

        getUIComponents();

        ourQuiz = new bagelQuiz();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(questionNum > 5)
            questionNum = 1;
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

    // change labels based on question number
    // switch intent once last question is recognized
    // winTheGame
    public void onClick(View v) {
        switch(v.getId()) { // call bagelQuiz method with appropriate value
            case R.id.btnOption1:
                ourQuiz.addValue(1);
                break;
            case R.id.btnOption2:
                ourQuiz.addValue(2);
                break;
            case R.id.btnOption3:
                ourQuiz.addValue(3);
                break;
            case R.id.btnOption4:
                ourQuiz.addValue(4);
                break;
            case R.id.btnOption5:
                ourQuiz.addValue(5);
                break;
            case R.id.btnOption6:
                ourQuiz.addValue(6);
                break;
        }

        questionNum++;
        switch(questionNum) {
            case 2:
                tvQNum.setText(R.string.question2);
                tvQuestion.setText(R.string.q2_text);

                btnOne.setText(R.string.q2_option1);
                btnTwo.setText(R.string.q2_option2);
                btnThree.setText(R.string.q2_option3);
                btnFour.setText(R.string.q2_option4);
                btnFive.setText(R.string.q2_option5);
                btnSix.setText(R.string.q2_option6);
                break;
            case 3:
                tvQNum.setText(R.string.question3);
                tvQuestion.setText(R.string.q3_text);

                btnOne.setText(R.string.q3_option1);
                btnTwo.setText(R.string.q3_option2);
                btnThree.setText(R.string.q3_option3);
                btnFour.setText(R.string.q3_option4);
                btnFive.setText(R.string.q3_option5);
                btnSix.setText(R.string.q3_option6);
                break;
            case 4:
                tvQNum.setText(R.string.question4);
                tvQuestion.setText(R.string.q4_text);

                btnOne.setText(R.string.q4_option1);
                btnTwo.setText(R.string.q4_option2);
                btnThree.setText(R.string.q4_option3);
                btnFour.setText(R.string.q4_option4);
                btnFive.setText(R.string.q4_option5);
                btnSix.setText(R.string.q4_option6);
                break;
            case 5:
                tvQNum.setText(R.string.question5);
                tvQuestion.setText(R.string.q5_text);

                btnOne.setText(R.string.q5_option1);
                btnTwo.setText(R.string.q5_option2);
                btnThree.setText(R.string.q5_option3);
                btnFour.setText(R.string.q5_option4);
                btnFive.setText(R.string.q5_option5);
                btnSix.setText(R.string.q5_option6);
                break;
            case 6:
                Intent resultIntent = new Intent(QuestionActivity.this,ResultsActivity.class);
                resultIntent.putExtra("result",Integer.toString(ourQuiz.getBagel()));
                resultIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(resultIntent);
                break;
        }
    }

}
