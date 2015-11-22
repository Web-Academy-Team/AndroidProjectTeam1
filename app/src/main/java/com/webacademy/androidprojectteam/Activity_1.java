package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_1 extends AppCompatActivity {
    public static final String USER_NAME = "com.webacademy.androidprojectteam.USER_NAME";
    private Intent intent;
    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        inputName = (EditText) findViewById(R.id.inputName);
    }

    public void goToActivity2(View view){
        if (!inputName.getText().toString().isEmpty()){
            intent = new Intent(this, Activity_2.class);
            intent.putExtra(USER_NAME, inputName.getText().toString());
            startActivity(intent);
            finish();
        }
    }
}
