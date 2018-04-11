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
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This is a quiz app that displays result in the toast message
 */
public class MainActivity extends AppCompatActivity {


    private int score = 0;

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private RadioGroup radioGroup7;
    private RadioGroup radioGroup8;
    private RadioGroup radioGroup9;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private EditText editText;
    private Button submitButton;
    private Button resetButton;

    /**
     * This method sets the radiogroup and the checkboxes
     */

    private void getView() {

        radioGroup1 = findViewById(R.id.radio_group_Q1);
        radioGroup2 = findViewById(R.id.radio_group_Q2);
        radioGroup3 = findViewById(R.id.radio_group_Q3);
        radioGroup4 = findViewById(R.id.radio_group_Q4);
        radioGroup5 = findViewById(R.id.radio_group_Q5);
        radioGroup7 = findViewById(R.id.radio_group_Q7);
        radioGroup8 = findViewById(R.id.radio_group_Q8);
        radioGroup9 = findViewById(R.id.radio_group_Q9);

        checkBox1 = findViewById(R.id.radio_button_Q6_Op1);
        checkBox2 = findViewById(R.id.radio_button_Q6_Op2);
        checkBox3 = findViewById(R.id.radio_button_Q6_Op3);
        checkBox4 = findViewById(R.id.radio_button_Q6_Op4);

        editText = findViewById(R.id.Q10_ans_view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = findViewById(R.id.radio_group_Q1);
        radioGroup2 = findViewById(R.id.radio_group_Q2);
        radioGroup3 = findViewById(R.id.radio_group_Q3);
        radioGroup4 = findViewById(R.id.radio_group_Q4);
        radioGroup5 = findViewById(R.id.radio_group_Q5);
        radioGroup7 = findViewById(R.id.radio_group_Q7);
        radioGroup8 = findViewById(R.id.radio_group_Q8);
        radioGroup9 = findViewById(R.id.radio_group_Q9);
        submitButton = findViewById(R.id.submit_button);
        resetButton = findViewById(R.id.reset_button);

        /**
         * This listener is called when the reset button is pressed
         */

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getView();
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                int selectedId2 = radioGroup2.getCheckedRadioButtonId();
                int selectedId3 = radioGroup3.getCheckedRadioButtonId();
                int selectedId4 = radioGroup4.getCheckedRadioButtonId();
                int selectedId5 = radioGroup5.getCheckedRadioButtonId();
                int selectedId7 = radioGroup7.getCheckedRadioButtonId();
                int selectedId8 = radioGroup8.getCheckedRadioButtonId();
                int selectedId9 = radioGroup9.getCheckedRadioButtonId();

                RadioButton radioButton1 = findViewById(selectedId1);
                RadioButton radioButton2 = findViewById(selectedId2);
                RadioButton radioButton3 = findViewById(selectedId3);
                RadioButton radioButton4 = findViewById(selectedId4);
                RadioButton radioButton5 = findViewById(selectedId5);
                RadioButton radioButton7 = findViewById(selectedId7);
                RadioButton radioButton8 = findViewById(selectedId8);
                RadioButton radioButton9 = findViewById(selectedId9);

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                editText.setText("");
                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                radioButton4.setChecked(false);
                radioButton5.setChecked(false);
                radioButton7.setChecked(false);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);


            }
        });

        /**
         * This listener is called when the submit button is presed
         */
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getView();
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                int selectedId2 = radioGroup2.getCheckedRadioButtonId();
                int selectedId3 = radioGroup3.getCheckedRadioButtonId();
                int selectedId4 = radioGroup4.getCheckedRadioButtonId();
                int selectedId5 = radioGroup5.getCheckedRadioButtonId();
                int selectedId7 = radioGroup7.getCheckedRadioButtonId();
                int selectedId8 = radioGroup8.getCheckedRadioButtonId();
                int selectedId9 = radioGroup9.getCheckedRadioButtonId();
                boolean selectedCheckBox1 = checkBox1.isChecked();
                boolean selectedCheckBox2 = checkBox2.isChecked();
                boolean selectedCheckBox3 = checkBox3.isChecked();
                boolean selectedCheckBox4 = checkBox4.isChecked();
                String name = editText.getText().toString();


                if (selectedId1 == R.id.radio_button_Q1_Op3) {
                    score += 1;
                }

                if (selectedId2 == R.id.radio_button_Q2_Op2) {
                    score += 1;
                }

                if (selectedId3 == R.id.radio_button_Q3_Op2) {
                    score += 1;
                }

                if (selectedId4 == R.id.radio_button_Q4_Op1) {
                    score += 1;
                }

                if (selectedId5 == R.id.radio_button_Q5_Op4) {
                    score += 1;
                }

                if (selectedId7 == R.id.radio_button_Q7_Op3) {
                    score += 1;
                }

                if (selectedId8 == R.id.radio_button_Q8_Op4) {
                    score += 1;
                }

                if (selectedId9 == R.id.radio_button_Q9_Op1) {
                    score += 1;
                }

                if ((selectedCheckBox1 && selectedCheckBox4) && (!selectedCheckBox2 && !selectedCheckBox3)) {
                    score += 1;
                }

                if (name.equals("Steve Smith")) {
                    score += 1;
                }

                getResult();
            }

        });
    }

    /**
     * This method displays the result in the toast message and send the result to the msil of the user playing the quiz
     */
    private void getResult() {
        EditText name = (EditText) findViewById(R.id.name_view);
        String playerName = name.getText().toString();

        Toast.makeText(this, playerName + ", You got " + score + " correct", Toast.LENGTH_LONG).show();
        int wrongAnswer = 10 - score;
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Result of Educational App for " + playerName);
        intent.putExtra(Intent.EXTRA_TEXT, "Total Questions = 10\nCorrect answer = " + score + "\nWrong Answer = " + wrongAnswer);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        score = 0;
    }


}
