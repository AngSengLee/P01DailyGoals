package com.example.a16004798.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button)findViewById(R.id.buttonOK);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get radio group object
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);

                //Get the ID of the selected radio button in the RadioGroup
                int qn1SelectedId = rg1.getCheckedRadioButtonId();
                int qn2SelectedId = rg2.getCheckedRadioButtonId();
                int qn3SelectedId = rg3.getCheckedRadioButtonId();

                //Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(qn1SelectedId);
                RadioButton rb2 = (RadioButton) findViewById(qn2SelectedId);
                RadioButton rb3 = (RadioButton) findViewById(qn3SelectedId);

                EditText etRJ = (EditText)findViewById(R.id.editTextRJ);

                String[] buttonsAndRJ = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), etRJ.getText().toString()};

                //Create an intent to start another activity
                Intent i = new Intent(MainActivity.this, Summary.class);

                //Pass the string array holding the selected buttons into the new activity
                i.putExtra("btnAndRJ", buttonsAndRJ);

                //Start the new activity
                startActivity(i);
            }
        });

    }
}
