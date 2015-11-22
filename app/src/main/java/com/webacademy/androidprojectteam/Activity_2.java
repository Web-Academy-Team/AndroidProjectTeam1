package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_2 extends AppCompatActivity {
    public static final String KEY_ALPHABET_BUTTON = "com.webacademy.alphabet.KEY_ALPHABET_BUTTON";
    private Intent intent;
    private String intentValue = "";
    private String userName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        intent = getIntent();
        if (intent != null) userName = intent.getStringExtra(Activity_1.USER_NAME);
    }

    public void alphabetButtonClick(View view){
        switch (view.getId()){
            case R.id.buttonA: intentValue = "A"; break;
            case R.id.buttonB: intentValue = "B"; break;
            case R.id.buttonV: intentValue = "V"; break;
            case R.id.buttonG: intentValue = "G"; break;
            case R.id.buttonD: intentValue = "D"; break;
            case R.id.buttonE: intentValue = "E"; break;
            case R.id.buttonEy: intentValue = "Ey"; break;
            case R.id.buttonZh: intentValue = "Zh"; break;
            case R.id.buttonZ: intentValue = "Z"; break;
        }
        intent = new Intent(this, Activity_3.class);
        intent.putExtra(KEY_ALPHABET_BUTTON, intentValue);
        intent.putExtra(Activity_1.USER_NAME, userName);
        startActivity(intent);
    }
}
