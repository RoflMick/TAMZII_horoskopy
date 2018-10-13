package com.example.mmascautanu.tamz1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class settingsActivity extends Activity {

    Button myButton;
    EditText myEditText;
    Button redButton;
    Button yellowButton;
    Button blueButton;
    Button defaultButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        myButton = findViewById(R.id.buttonSettings);
        redButton = findViewById(R.id.buttonRed);
        yellowButton= findViewById(R.id.buttonYellow);
        blueButton = findViewById(R.id.buttonBlue);
        myEditText = findViewById(R.id.editTextSettings);
    }

    public void myClick2(View view) {

    }

    public void colorClick(View view) {

        String myText = "";

        switch(view.getId()) {
            case R.id.buttonBlue:
                myText = "blue";
                break;

            case R.id.buttonRed:
                myText = "red";
                break;

            case R.id.buttonYellow:
                myText = "yellow";
                break;
        }

        Intent intent = new Intent();
        intent.putExtra("color", myText);
        setResult(333, intent);
        finish();
    }
}
