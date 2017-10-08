package com.example.crystal.bagelfyme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity extends Activity {

    private String resultsNum;

    private TextView tvBagelID;
    private TextView tvBagelBlurb;
    private ImageView ivBagel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_layout);

        resultsNum = getIntent().getStringExtra("result");

        getUIComponents();
        setUpResults(resultsNum);
    }

    private void getUIComponents() {
        tvBagelID = (TextView) findViewById(R.id.tvBigReveal);
        tvBagelBlurb = (TextView) findViewById(R.id.tvBlurb);
        ivBagel = (ImageView) findViewById(R.id.ivBagel);
    }

    private void setUpResults(String result) {
        switch(result) {
            case "1":
                tvBagelID.setText(R.string.plain_results);
                tvBagelBlurb.setText(R.string.plain_blurb);
                ivBagel.setImageResource(R.drawable.plain);
                break;
            case "2":
                tvBagelID.setText(R.string.rainbow_results);
                tvBagelBlurb.setText(R.string.rainbow_blurb);
                ivBagel.setImageResource(R.drawable.rainbow);
                break;
            case "3":
                tvBagelID.setText(R.string.everything_results);
                tvBagelBlurb.setText(R.string.everything_blurb);
                ivBagel.setImageResource(R.drawable.everything);
                break;
            case "4":
                tvBagelID.setText(R.string.wholewheat_results);
                tvBagelBlurb.setText(R.string.wholewheat_blurb);
                ivBagel.setImageResource(R.drawable.wholewheat);
                break;
            case "5":
                tvBagelID.setText(R.string.poppy_results);
                tvBagelBlurb.setText(R.string.poppy_blurb);
                ivBagel.setImageResource(R.drawable.poppy_seed);
                break;
            case "6":
                tvBagelID.setText(R.string.sourdough_results);
                tvBagelBlurb.setText(R.string.sourdough_blurb);
                ivBagel.setImageResource(R.drawable.sourdough);
                break;
        }
    }

    public void gotoMain(View view) {
        Intent mainIntent = new Intent(ResultsActivity.this,MainActivity.class);
        mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(mainIntent);
    }
}
