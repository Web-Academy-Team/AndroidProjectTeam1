package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import static com.webacademy.androidprojectteam.R.drawable.a_button;

public class Activity_3 extends AppCompatActivity {
    private String character = "";
    private String userName = "";
    private ImageView alphabetChar;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;

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

        choiseChar(character);
    }

    private void choiseChar(String character){
        switch (character){
            case "A":
                alphabetChar.setImageResource(R.drawable.a_button);
                img1.setImageResource(R.drawable.pineapple);
                img2.setImageResource(R.drawable.apricot);
                img3.setImageResource(R.drawable.squirrel);
                break;
            case "B":
                alphabetChar.setImageResource(R.drawable.b_button);
                break;
            case "V":
                alphabetChar.setImageResource(R.drawable.v_button);
                break;
            case "G":
                alphabetChar.setImageResource(R.drawable.g_button);
                break;
            case "D":
                alphabetChar.setImageResource(R.drawable.d_button);
                break;
            case "E":
                alphabetChar.setImageResource(R.drawable.e_button);
                break;
            case "Ey":
                alphabetChar.setImageResource(R.drawable.ey_button);
                break;
            case "Zh":
                alphabetChar.setImageResource(R.drawable.zh_button);
                break;
            case "Z":
                alphabetChar.setImageResource(R.drawable.z_button);
                break;
            case "I":
                alphabetChar.setImageResource(R.drawable.i_button);
                break;
            case "Iy":
                alphabetChar.setImageResource(R.drawable.iy_button);
                break;
            case "K":
                alphabetChar.setImageResource(R.drawable.k_button);
                break;
            case "L":
                alphabetChar.setImageResource(R.drawable.l_button);
                break;
            case "M":
                alphabetChar.setImageResource(R.drawable.m_button);
                break;
            case "N":
                alphabetChar.setImageResource(R.drawable.n_button);
                break;
            case "O":
                alphabetChar.setImageResource(R.drawable.o_button);
                break;
            case "P":
                alphabetChar.setImageResource(R.drawable.p_button);
                break;
            case "R":
                alphabetChar.setImageResource(R.drawable.r_button);
                break;
            case "S":
                alphabetChar.setImageResource(R.drawable.s_button);
                break;
            case "T":
                alphabetChar.setImageResource(R.drawable.t_button);
                break;
            case "U":
                alphabetChar.setImageResource(R.drawable.u_button);
                break;
            case "F":
                alphabetChar.setImageResource(R.drawable.f_button);
                break;
            case "H":
                alphabetChar.setImageResource(R.drawable.h_button);
                break;
            case "C":
                alphabetChar.setImageResource(R.drawable.c_button);
                break;
            case "Ch":
                alphabetChar.setImageResource(R.drawable.ch_button);
                break;
            case "Sh":
                alphabetChar.setImageResource(R.drawable.sh_button);
                break;
            case "Shy":
                alphabetChar.setImageResource(R.drawable.shy_button);
                break;
            case "Zt":
                alphabetChar.setImageResource(R.drawable.zt_button);
                break;
            case "Uy":
                alphabetChar.setImageResource(R.drawable.uy_button);
                break;
            case "Zm":
                alphabetChar.setImageResource(R.drawable.zm_button);
                break;
            case "Ee":
                alphabetChar.setImageResource(R.drawable.ee_button);
                break;
            case "Yy":
                alphabetChar.setImageResource(R.drawable.yy_button);
                break;
            case "Ya":
                alphabetChar.setImageResource(R.drawable.ya_button);
                break;
        }
    }

    public void charClick(View view){
//        звук буквы
    }
}
