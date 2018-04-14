package com.example.vineetprasadverma.educationalapp;

import android.content.Intent;
import android.graphics.Color;
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
 * This is a quiz3 app that displays result in the toast message
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

        submitButton = findViewById(R.id.submit_button);
        resetButton = findViewById(R.id.reset_button);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getView();

        /**
         * This listener is called when the reset button is pressed
         */

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
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
                checkBox1.setTextColor(Color.WHITE);
                checkBox2.setTextColor(Color.WHITE);
                checkBox3.setTextColor(Color.WHITE);
                checkBox4.setTextColor(Color.WHITE);

                editText.setText("");
                editText.setTextColor(Color.WHITE);

                radioButton1.setChecked(false);
                radioButton1.setTextColor(Color.WHITE);

                radioButton2.setChecked(false);
                radioButton2.setTextColor(Color.WHITE);

                radioButton3.setChecked(false);
                radioButton3.setTextColor(Color.WHITE);

                radioButton4.setChecked(false);
                radioButton4.setTextColor(Color.WHITE);

                radioButton5.setChecked(false);
                radioButton5.setTextColor(Color.WHITE);

                radioButton7.setChecked(false);
                radioButton7.setTextColor(Color.WHITE);

                radioButton8.setChecked(false);
                radioButton8.setTextColor(Color.WHITE);

                radioButton9.setChecked(false);
                radioButton9.setTextColor(Color.WHITE);


            }
        });

        /**
         * This listener is called when the submit button is presed
         */
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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

                /**
                 * finding buttons for changing the color of the button whenever right or wrong option is checked
                 */

                RadioButton radioButton1 = findViewById(selectedId1);
                RadioButton radioButton2 = findViewById(selectedId2);
                RadioButton radioButton3 = findViewById(selectedId3);
                RadioButton radioButton4 = findViewById(selectedId4);
                RadioButton radioButton5 = findViewById(selectedId5);
                RadioButton radioButton7 = findViewById(selectedId7);
                RadioButton radioButton8 = findViewById(selectedId8);
                RadioButton radioButton9 = findViewById(selectedId9);


                if (selectedId1 == R.id.radio_button_Q1_Op3) {
                    score += 1;
                    radioButton1.setTextColor(Color.GREEN);
                } else {
                    radioButton1.setTextColor(Color.RED);
                }

                if (selectedId2 == R.id.radio_button_Q2_Op2) {
                    score += 1;
                    radioButton2.setTextColor(Color.GREEN);
                } else {
                    radioButton2.setTextColor(Color.RED);
                }

                if (selectedId3 == R.id.radio_button_Q3_Op2) {
                    score += 1;
                    radioButton3.setTextColor(Color.GREEN);
                } else {
                    radioButton3.setTextColor(Color.RED);
                }

                if (selectedId4 == R.id.radio_button_Q4_Op1) {
                    score += 1;
                    radioButton4.setTextColor(Color.GREEN);
                } else {
                    radioButton4.setTextColor(Color.RED);
                }

                if (selectedId5 == R.id.radio_button_Q5_Op4) {
                    score += 1;
                    radioButton5.setTextColor(Color.GREEN);
                } else {
                    radioButton5.setTextColor(Color.RED);
                }

                if (selectedId7 == R.id.radio_button_Q7_Op3) {
                    score += 1;
                    radioButton7.setTextColor(Color.GREEN);
                } else {
                    radioButton7.setTextColor(Color.RED);
                }

                if (selectedId8 == R.id.radio_button_Q8_Op4) {
                    score += 1;
                    radioButton8.setTextColor(Color.GREEN);
                } else {
                    radioButton8.setTextColor(Color.RED);
                }

                if (selectedId9 == R.id.radio_button_Q9_Op1) {
                    score += 1;
                    radioButton9.setTextColor(Color.GREEN);
                } else {
                    radioButton9.setTextColor(Color.RED);
                }

                if ((selectedCheckBox1 && selectedCheckBox4) && (!selectedCheckBox2 && !selectedCheckBox3)) {
                    score += 1;
                    checkBox1.setTextColor(Color.GREEN);
                    checkBox4.setTextColor(Color.GREEN);
                } else {
                    checkBox1.setTextColor(Color.RED);
                    checkBox4.setTextColor(Color.RED);
                    checkBox2.setTextColor(Color.RED);
                    checkBox3.setTextColor(Color.RED);
                }

                if (name.equals("Steve Smith")) {
                    score += 1;
                    editText.setTextColor(Color.GREEN);

                } else {
                    editText.setTextColor(Color.RED);
                }

                getResult();
            }

        });
    }

    /**
     * This method displays the result in the toast message and send the result to the msil of the user playing the quiz3
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
