package com.webacademy.androidprojectteam;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.webacademy.androidprojectteam.R.drawable.a_button;

public class Activity_3 extends AppCompatActivity implements  SoundPool.OnLoadCompleteListener{
    private String character = "";
    private String userName = "";
    private ImageView alphabetChar;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private SoundPool sp;
    private int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView findWord = (TextView) findViewById(R.id.findWord);
        alphabetChar = (ImageView) findViewById(R.id.alpChar);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);

        Intent intent = getIntent();
        if (intent != null){
            userName = intent.getStringExtra(Activity_1.USER_NAME);
            character = intent.getStringExtra(Activity_2.KEY_ALPHABET_BUTTON);
        }
        String findWordText = userName + ", угадай слово";
        findWord.setText(findWordText);

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        sp.setOnLoadCompleteListener(this);

        choiseChar(character);
    }

    private void choiseChar(String character){
        switch (character){
            case "A":
                alphabetChar.setImageResource(R.drawable.a_button);
                img1.setImageResource(R.drawable.pineapple);
                img2.setImageResource(R.drawable.apricot);
                img3.setImageResource(R.drawable.squirrel);
                soundId = sp.load(this, R.raw.a, 1);
                break;
            case "B":
                alphabetChar.setImageResource(R.drawable.b_button);
                soundId = sp.load(this, R.raw.b, 1);
                break;
            case "V":
                alphabetChar.setImageResource(R.drawable.v_button);
                soundId = sp.load(this, R.raw.v, 1);
                break;
            case "G":
                alphabetChar.setImageResource(R.drawable.g_button);
                soundId = sp.load(this, R.raw.g, 1);
                break;
            case "D":
                alphabetChar.setImageResource(R.drawable.d_button);
                soundId = sp.load(this, R.raw.d, 1);
                break;
            case "E":
                alphabetChar.setImageResource(R.drawable.e_button);
                soundId = sp.load(this, R.raw.e, 1);
                break;
            case "Ey":
                alphabetChar.setImageResource(R.drawable.ey_button);
                soundId = sp.load(this, R.raw.ey, 1);
                break;
            case "Zh":
                alphabetChar.setImageResource(R.drawable.zh_button);
                soundId = sp.load(this, R.raw.zh, 1);
                break;
            case "Z":
                alphabetChar.setImageResource(R.drawable.z_button);
                soundId = sp.load(this, R.raw.z, 1);
                break;
            case "I":
                alphabetChar.setImageResource(R.drawable.i_button);
                soundId = sp.load(this, R.raw.i, 1);
                break;
            case "Iy":
                alphabetChar.setImageResource(R.drawable.iy_button);
                soundId = sp.load(this, R.raw.iy, 1);
                break;
            case "K":
                alphabetChar.setImageResource(R.drawable.k_button);
                soundId = sp.load(this, R.raw.k, 1);
                break;
            case "L":
                alphabetChar.setImageResource(R.drawable.l_button);
                soundId = sp.load(this, R.raw.l, 1);
                break;
            case "M":
                alphabetChar.setImageResource(R.drawable.m_button);
                soundId = sp.load(this, R.raw.m, 1);
                break;
            case "N":
                alphabetChar.setImageResource(R.drawable.n_button);
                soundId = sp.load(this, R.raw.n, 1);
                break;
            case "O":
                alphabetChar.setImageResource(R.drawable.o_button);
                soundId = sp.load(this, R.raw.o, 1);
                break;
            case "P":
                alphabetChar.setImageResource(R.drawable.p_button);
                soundId = sp.load(this, R.raw.p, 1);
                break;
            case "R":
                alphabetChar.setImageResource(R.drawable.r_button);
                soundId = sp.load(this, R.raw.r, 1);
                break;
            case "S":
                alphabetChar.setImageResource(R.drawable.s_button);
                soundId = sp.load(this, R.raw.s, 1);
                break;
            case "T":
                alphabetChar.setImageResource(R.drawable.t_button);
                soundId = sp.load(this, R.raw.t, 1);
                break;
            case "U":
                alphabetChar.setImageResource(R.drawable.u_button);
                soundId = sp.load(this, R.raw.u, 1);
                break;
            case "F":
                alphabetChar.setImageResource(R.drawable.f_button);
                soundId = sp.load(this, R.raw.f, 1);
                break;
            case "H":
                alphabetChar.setImageResource(R.drawable.h_button);
                soundId = sp.load(this, R.raw.h, 1);
                break;
            case "C":
                alphabetChar.setImageResource(R.drawable.c_button);
                soundId = sp.load(this, R.raw.c, 1);
                break;
            case "Ch":
                alphabetChar.setImageResource(R.drawable.ch_button);
                soundId = sp.load(this, R.raw.ch, 1);
                break;
            case "Sh":
                alphabetChar.setImageResource(R.drawable.sh_button);
                soundId = sp.load(this, R.raw.sh, 1);
                break;
            case "Shy":
                alphabetChar.setImageResource(R.drawable.shy_button);
                soundId = sp.load(this, R.raw.shy, 1);
                break;
            case "Zt":
                alphabetChar.setImageResource(R.drawable.zt_button);
                soundId = sp.load(this, R.raw.zt, 1);
                break;
            case "Uy":
                alphabetChar.setImageResource(R.drawable.uy_button);
                soundId = sp.load(this, R.raw.uy, 1);
                break;
            case "Zm":
                alphabetChar.setImageResource(R.drawable.zm_button);
                soundId = sp.load(this, R.raw.zm, 1);
                break;
            case "Ee":
                alphabetChar.setImageResource(R.drawable.ee_button);
                soundId = sp.load(this, R.raw.ee, 1);
                break;
            case "Yy":
                alphabetChar.setImageResource(R.drawable.yy_button);
                soundId = sp.load(this, R.raw.yy, 1);
                break;
            case "Ya":
                alphabetChar.setImageResource(R.drawable.ya_button);
                soundId = sp.load(this, R.raw.ya, 1);
                break;
        }
    }

    public void charClick(View view){
        sp.play(soundId, 1, 1, 0, 0, 1);
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
    }
}
