package com.example.a16004798.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] buttonsAndRJ = i.getStringArrayExtra("btnAndRJ");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.textView);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        // Display the name and age on the TextView
        tv1.append(" " + buttonsAndRJ[0]);
        tv2.append(" " + buttonsAndRJ[1]);
        tv3.append(" " + buttonsAndRJ[2]);
        tv4.append(" " + buttonsAndRJ[3]);

    }
}
