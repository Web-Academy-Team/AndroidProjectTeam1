package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Activity_3 extends AppCompatActivity {
    private Intent intent;
    private String character = "";
    private String userName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        intent = getIntent();
        if (intent != null){
            userName = intent.getStringExtra(Activity_1.USER_NAME);
            character = intent.getStringExtra(Activity_2.KEY_ALPHABET_BUTTON);
        }

        ImageButton imagebutton1 = (ImageButton)findViewById(R.id.imageButton1);
        ImageButton imagebutton2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton imagebutton3 = (ImageButton)findViewById(R.id.imageButton3);
        ImageButton imagebutton4 = (ImageButton)findViewById(R.id.imageButton4);


        imagebutton1.setImageResource(R.drawable.apricot);
        imagebutton2.setImageResource(R.drawable.pineapple);
        imagebutton3.setImageResource(R.drawable.orange);
        imagebutton4.setImageResource(R.drawable.squirrel);
    }
}
