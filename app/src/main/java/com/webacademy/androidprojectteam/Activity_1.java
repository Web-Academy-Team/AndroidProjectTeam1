package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_1 extends AppCompatActivity implements SoundPool.OnLoadCompleteListener {
    public static final String USER_NAME = "com.webacademy.androidprojectteam.USER_NAME";
    private Intent intent;
    private EditText inputName;
    private SoundPool sp;
    private int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        inputName = (EditText) findViewById(R.id.inputName);

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        sp.setOnLoadCompleteListener(this);
        soundId = sp.load(this, R.raw.hi, 1);
    }

    public void goToActivity2(View view){
        if (!inputName.getText().toString().isEmpty()){
            intent = new Intent(this, Activity_2.class);
            intent.putExtra(USER_NAME, inputName.getText().toString());
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
    }

    public void onBallClick(View view){
        sp.play(soundId, 1, 1, 0, 0, 1);
    }
}
