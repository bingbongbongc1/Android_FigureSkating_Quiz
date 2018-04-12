package com.example.android.figureskatingquiz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //    To store return statements from each question.
    String qq1;
    String qq2;
    String qq3;
    String qq4;
    String qq5;
    String qq6;
    String qq7;
    String qq8;

    //    To store if each question is correct.
    Boolean bb1 = false;
    Boolean bb2 = false;
    Boolean bb3 = false;
    Boolean bb4 = false;
    Boolean bb5 = false;
    Boolean bb6 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the See Result button is clicked.
     */
    public void seeResults(View view) {

        //        Check Q1 answer.
        RadioButton q1a3_view = (RadioButton) findViewById(R.id.q1a3);
        boolean q1a3_isChecked = q1a3_view.isChecked();
        String q1text = q1_result(q1a3_isChecked);

        //        Check Q2 answer.
        CheckBox q2a1_view = (CheckBox) findViewById(R.id.q2a1);
        boolean q2a1_isChecked = q2a1_view.isChecked();
        CheckBox q2a2_view = (CheckBox) findViewById(R.id.q2a2);
        boolean q2a2_isChecked = q2a2_view.isChecked();
        CheckBox q2a3_view = (CheckBox) findViewById(R.id.q2a3);
        boolean q2a3_isChecked = q2a3_view.isChecked();
        CheckBox q2a4_view = (CheckBox) findViewById(R.id.q2a4);
        boolean q2a4_isChecked = q2a4_view.isChecked();
        String q2text = q2_result(q2a1_isChecked, q2a2_isChecked, q2a3_isChecked, q2a4_isChecked);

        //        Check Q3 answer.
        RadioButton q3a2_view = (RadioButton) findViewById(R.id.q3a2);
        boolean q3a2_isChecked = q3a2_view.isChecked();
        String q3text = q3_result(q3a2_isChecked);

        //        Check Q4 answer.
        RadioButton q4a1_view = (RadioButton) findViewById(R.id.q4a1);
        boolean q4a1_isChecked = q4a1_view.isChecked();
        String q4text = q4_result(q4a1_isChecked);

        //        Check Q5 answer.
        CheckBox q5a1_view = (CheckBox) findViewById(R.id.q5a1);
        boolean q5a1_isChecked = q5a1_view.isChecked();
        CheckBox q5a2_view = (CheckBox) findViewById(R.id.q5a2);
        boolean q5a2_isChecked = q5a2_view.isChecked();
        CheckBox q5a3_view = (CheckBox) findViewById(R.id.q5a3);
        boolean q5a3_isChecked = q5a3_view.isChecked();
        CheckBox q5a4_view = (CheckBox) findViewById(R.id.q5a4);
        boolean q5a4_isChecked = q5a4_view.isChecked();
        String q5text = q5_result(q5a1_isChecked, q5a2_isChecked, q5a3_isChecked, q5a4_isChecked);

        //        Check Q6 answer.
        RadioButton q6a4_view = (RadioButton) findViewById(R.id.q6a4);
        boolean q6a4_isChecked = q6a4_view.isChecked();
        String q6text = q6_result(q6a4_isChecked);

        //        Check Q7 answer.
        EditText femaleSkaterNameTextView = (EditText) findViewById(R.id.q7a1);
        String femaleSkaterName = femaleSkaterNameTextView.getText().toString();
        String q7text = q7_result(femaleSkaterName);

        //        Check Q8 answer.
        EditText maleSkaterNameTextView = (EditText) findViewById(R.id.q8a1);
        String maleSkaterName = maleSkaterNameTextView.getText().toString();
        String q8text = q8_result(maleSkaterName);

        //        Calculate # of correct answers.
        int correctAnswers = 0;
        if (bb1 == true) {
            correctAnswers += 1;
        }
        if (bb2 == true) {
            correctAnswers += 1;
        }
        if (bb3 == true) {
            correctAnswers += 1;
        }
        if (bb4 == true) {
            correctAnswers += 1;
        }
        if (bb5 == true) {
            correctAnswers += 1;
        }
        if (bb6 == true) {
            correctAnswers += 1;
        }

        String answer = "You answered " + correctAnswers + " out of 6 correctly.";
        answer += "\n" + "\n" + q1text;
        answer += "\n" + "\n" + q2text;
        answer += "\n" + "\n" + q3text;
        answer += "\n" + "\n" + q4text;
        answer += "\n" + "\n" + q5text;
        answer += "\n" + "\n" + q6text;
        answer += "\n" + "\n" + q7text;
        answer += "\n" + "\n" + q8text;
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, answer, duration).show();

        bb1 = false;
        bb2 = false;
        bb3 = false;
        bb4 = false;
        bb5 = false;
        bb6 = false;

    }

    /**
     * This determines the result of Q1 .
     */
    public String q1_result(boolean q1answer) {
        if (q1answer == true) {
            qq1 = getString(R.string.q1correct);
            bb1 = true;
        } else {
            qq1 = getString(R.string.q1wrong);
        }
        return qq1;
    }

    /**
     * This determines the result of Q2 .
     */
    public String q2_result(boolean q2answer1, boolean q2answer2, boolean q2answer3, boolean q2answer4) {
        if (q2answer1 == true && q2answer3 == true && q2answer2 == false && q2answer4 == false) {
            qq2 = getString(R.string.q2correct);
            bb2 = true;
        } else {
            qq2 = getString(R.string.q2wrong);
        }
        return qq2;
    }

    /**
     * This determines the result of Q3 .
     */
    public String q3_result(boolean q3answer) {
        if (q3answer == true) {
            qq3 = getString(R.string.q3correct);
            bb3 = true;
        } else {
            qq3 = getString(R.string.q3wrong);
        }
        return qq3;
    }

    /**
     * This determines the result of Q4 .
     */
    public String q4_result(boolean q4answer) {
        if (q4answer == true) {
            qq4 = getString(R.string.q4correct);
            bb4 = true;
        } else {
            qq4 = getString(R.string.q4wrong);
        }
        return qq4;
    }

    /**
     * This determines the result of Q5 .
     */
    public String q5_result(boolean q5answer1, boolean q5answer2, boolean q5answer3, boolean q5answer4) {
        if (q5answer1 == true && q5answer4 == true && q5answer2 == false && q5answer3 == false) {
            qq5 = getString(R.string.q5correct);
            bb5 = true;
        } else {
            qq5 = getString(R.string.q5wrong);
        }
        return qq5;
    }

    /**
     * This determines the result of Q6 .
     */
    public String q6_result(boolean q6answer) {
        if (q6answer == true) {
            qq6 = getString(R.string.q6correct);
            bb6 = true;
        } else {
            qq6 = getString(R.string.q6wrong);
        }
        return qq6;
    }

    /**
     * This determines the result of Q7 .
     */
    public String q7_result(String femaleSkater) {
        if (femaleSkater != null) {
            qq7 = getString(R.string.q7NotNull, femaleSkater);
        } else {
            qq7 = getString(R.string.q7IsNull);
        }
        return qq7;
    }

    /**
     * This determines the result of Q8 .
     */
    public String q8_result(String maleSkater) {
        if (maleSkater != null) {
            qq8 = getString(R.string.q8NotNull, maleSkater);
        } else {
            qq8 = getString(R.string.q8IsNull);
        }
        return qq8;
    }

}
