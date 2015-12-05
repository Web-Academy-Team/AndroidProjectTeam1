package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Activity_2 extends AppCompatActivity {
    public static final String KEY_ALPHABET_BUTTON = "com.webacademy.alphabet.KEY_ALPHABET_BUTTON";
    private Intent intent;
    private String userName = "";
    private String intentValue = "";

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
            case R.id.buttonI: intentValue = "I"; break;
            case R.id.buttonIy: intentValue = "Iy"; break;
            case R.id.buttonK: intentValue = "K"; break;
            case R.id.buttonL: intentValue = "L"; break;
            case R.id.buttonM: intentValue = "M"; break;
            case R.id.buttonN: intentValue = "N"; break;
            case R.id.buttonO: intentValue = "O"; break;
            case R.id.buttonP: intentValue = "P"; break;
            case R.id.buttonR: intentValue = "R"; break;
            case R.id.buttonS: intentValue = "S"; break;
            case R.id.buttonT: intentValue = "T"; break;
            case R.id.buttonU: intentValue = "U"; break;
            case R.id.buttonF: intentValue = "F"; break;
            case R.id.buttonH: intentValue = "H"; break;
            case R.id.buttonC: intentValue = "C"; break;
            case R.id.buttonCh: intentValue = "Ch"; break;
            case R.id.buttonSh: intentValue = "Sh"; break;
            case R.id.buttonShy: intentValue = "Shy"; break;
            case R.id.buttonZt: intentValue = "Zt"; break;
            case R.id.buttonUy: intentValue = "Uy"; break;
            case R.id.buttonZm: intentValue = "Zm"; break;
            case R.id.buttonEe: intentValue = "Ee"; break;
            case R.id.buttonYy: intentValue = "Yy"; break;
            case R.id.buttonYa: intentValue = "Ya"; break;
        }
        intent = new Intent(this, Activity_3.class);
        intent.putExtra(KEY_ALPHABET_BUTTON, intentValue);
        intent.putExtra(Activity_1.USER_NAME, userName);
        startActivity(intent);
    }
}
