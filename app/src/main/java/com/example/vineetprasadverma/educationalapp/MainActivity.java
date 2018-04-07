package com.example.vineetprasadverma.educationalapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateScoreFromQuestion1() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q1_Op3);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion2() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q2_Op2);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion3() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q3_Op2);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion4() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q4_Op1);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion5() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q5_Op4);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion6() {

        CheckBox correctAnswer = (CheckBox) findViewById(R.id.radio_button_Q6_Op1);
        CheckBox correctAnswer2 = (CheckBox) findViewById(R.id.radio_button_Q6_Op2);
        CheckBox correctsAnswer3 = (CheckBox) findViewById(R.id.radio_button_Q6_Op3);
        CheckBox correctsAnswer4 = (CheckBox) findViewById(R.id.radio_button_Q6_Op4);
        boolean has1Checked = correctAnswer.isChecked();
        boolean has2Checked = correctAnswer2.isChecked();
        boolean has3Checked = correctsAnswer3.isChecked();
        boolean has4Checked = correctsAnswer4.isChecked();
        if ((has1Checked && has4Checked) && (!has3Checked && !has2Checked)) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion7() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q7_Op3);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion8() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q8_Op4);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion9() {

        RadioButton correctAnswerRadioButton = (RadioButton) findViewById(R.id.radio_button_Q9_Op1);
        boolean hasChecked = correctAnswerRadioButton.isChecked();
        if (hasChecked) {
            score += 1;
        }
    }

    public void updateScoreFromQuestion10() {

        EditText correctAnswerEditText = (EditText) findViewById(R.id.Q10_ans_view);
        String correctAnswer = correctAnswerEditText.getText().toString();
        if (correctAnswer.equals("Steve Smith")) {
            score += 1;
        }
    }

    public void getResult(View view) {
        EditText name = (EditText) findViewById(R.id.name_view);
        String playerName = name.getText().toString();
        updateScoreFromQuestion1();
        updateScoreFromQuestion2();
        updateScoreFromQuestion3();
        updateScoreFromQuestion4();
        updateScoreFromQuestion5();
        updateScoreFromQuestion6();
        updateScoreFromQuestion7();
        updateScoreFromQuestion8();
        updateScoreFromQuestion9();
        updateScoreFromQuestion10();
        Toast.makeText(this, playerName + ", You got " + score + " correct", Toast.LENGTH_LONG).show();
        int wrongAnswer = 5 - score;
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Result of Educational App for " + playerName);
        intent.putExtra(Intent.EXTRA_TEXT, "Total Questions = 5\nCorrect answer = " + score + "\nWrong Answer = " + wrongAnswer);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        score = 0;
    }


}
