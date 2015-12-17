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

import java.util.ArrayList;

import static com.webacademy.androidprojectteam.R.drawable.a_button;

public class Activity_3 extends AppCompatActivity implements  SoundPool.OnLoadCompleteListener{
    private String character = "";
    private String userName = "";
    private SoundPool sp;
    private int soundId;

    public int Letter;
    public ArrayList<Variant> variants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        variants = new ArrayList<>();
        variants.add(new Variant("A", "pineapple", R.drawable.pineapple, 0));   // 0
        variants.add(new Variant("A", "apricot", R.drawable.apricot, 0));       // 1
        variants.add(new Variant("B", "squirrel", R.drawable.squirrel, 0));     // 2


        Intent intent = getIntent();
        if (intent != null){
            userName = intent.getStringExtra(Activity_1.USER_NAME);
            character = intent.getStringExtra(Activity_2.KEY_ALPHABET_BUTTON);
        }

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        sp.setOnLoadCompleteListener(this);

        choiseChar(character);
    }

    private void choiseChar(String character){
        switch (character){
            case "A":
                Letter = R.drawable.a_button;
                soundId = sp.load(this, R.raw.a, 1);
                break;
            case "B":
                Letter = R.drawable.b_button;
                soundId = sp.load(this, R.raw.b, 1);
                break;
            case "V":
                Letter = R.drawable.v_button;
                soundId = sp.load(this, R.raw.v, 1);
                break;
            case "G":
                Letter = R.drawable.g_button;
                soundId = sp.load(this, R.raw.g, 1);
                break;
            case "D":
                Letter = R.drawable.d_button;
                soundId = sp.load(this, R.raw.d, 1);
                break;
            case "E":
                Letter = R.drawable.e_button;
                soundId = sp.load(this, R.raw.e, 1);
                break;
            case "Ey":
                Letter = R.drawable.ey_button;
                soundId = sp.load(this, R.raw.ey, 1);
                break;
            case "Zh":
                Letter = R.drawable.zh_button;
                soundId = sp.load(this, R.raw.zh, 1);
                break;
            case "Z":
                Letter = R.drawable.z_button;
                soundId = sp.load(this, R.raw.z, 1);
                break;
            case "I":
                Letter = R.drawable.i_button;
                soundId = sp.load(this, R.raw.i, 1);
                break;
            case "Iy":
                Letter = R.drawable.iy_button;
                soundId = sp.load(this, R.raw.iy, 1);
                break;
            case "K":
                Letter = R.drawable.k_button;
                soundId = sp.load(this, R.raw.k, 1);
                break;
            case "L":
                Letter = R.drawable.l_button;
                soundId = sp.load(this, R.raw.l, 1);
                break;
            case "M":
                Letter = R.drawable.m_button;
                soundId = sp.load(this, R.raw.m, 1);
                break;
            case "N":
                Letter = R.drawable.n_button;
                soundId = sp.load(this, R.raw.n, 1);
                break;
            case "O":
                Letter = R.drawable.o_button;
                soundId = sp.load(this, R.raw.o, 1);
                break;
            case "P":
                Letter = R.drawable.p_button;
                soundId = sp.load(this, R.raw.p, 1);
                break;
            case "R":
                Letter = R.drawable.r_button;
                soundId = sp.load(this, R.raw.r, 1);
                break;
            case "S":
                Letter = R.drawable.s_button;
                soundId = sp.load(this, R.raw.s, 1);
                break;
            case "T":
                Letter = R.drawable.t_button;
                soundId = sp.load(this, R.raw.t, 1);
                break;
            case "U":
                Letter = R.drawable.u_button;
                soundId = sp.load(this, R.raw.u, 1);
                break;
            case "F":
                Letter = R.drawable.f_button;
                soundId = sp.load(this, R.raw.f, 1);
                break;
            case "H":
                Letter = R.drawable.h_button;
                soundId = sp.load(this, R.raw.h, 1);
                break;
            case "C":
                Letter = R.drawable.c_button;
                soundId = sp.load(this, R.raw.c, 1);
                break;
            case "Ch":
                Letter = R.drawable.ch_button;
                soundId = sp.load(this, R.raw.ch, 1);
                break;
            case "Sh":
                Letter = R.drawable.sh_button;
                soundId = sp.load(this, R.raw.sh, 1);
                break;
            case "Shy":
                Letter = R.drawable.shy_button;
                soundId = sp.load(this, R.raw.shy, 1);
                break;
            case "Zt":
                Letter = R.drawable.zt_button;
                soundId = sp.load(this, R.raw.zt, 1);
                break;
            case "Uy":
                Letter = R.drawable.uy_button;
                soundId = sp.load(this, R.raw.uy, 1);
                break;
            case "Zm":
                Letter = R.drawable.zm_button;
                soundId = sp.load(this, R.raw.zm, 1);
                break;
            case "Ee":
                Letter = R.drawable.ee_button;
                soundId = sp.load(this, R.raw.ee, 1);
                break;
            case "Yy":
                Letter = R.drawable.yy_button;
                soundId = sp.load(this, R.raw.yy, 1);
                break;
            case "Ya":
                Letter = R.drawable.ya_button;
                soundId = sp.load(this, R.raw.ya, 1);
                break;
        }
        setVariants(character, Letter, 3, 1);       // (character, id.drawable.char, count variants, level)
    }

    public void charClick(View view){
        sp.play(soundId, 1, 1, 0, 0, 1);
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
    }

    public void setVariants(String letter, int buk, int count, int level) {

        ((ImageView) findViewById(R.id.alpChar)).setImageResource(buk);
        ((TextView) findViewById(R.id.findWord)).setText(userName + ", угадай слово");

        int[] imgPosition = new int[4];
        imgPosition[0] = 0;
        imgPosition[1] = R.id.img1;
        imgPosition[2] = R.id.img2;
        imgPosition[3] = R.id.img3;

        int pos = imgPosition.length-1, cnt = 0;

        for(int i = 0; i < variants.size(); i++) {

            if((letter.equals(variants.get(i).Letter)) && (level != 0)){
                ((ImageView) findViewById(imgPosition[pos])).setImageResource(variants.get(i).Img);
                variants.get(i).incVariantCount(variants.size());
                level--;
                pos--;
                if(pos == 0){
                    return;
                }
            }
            if(!(letter.equals(variants.get(i).Letter)) && (pos > level)) {
                ((ImageView) findViewById(imgPosition[pos])).setImageResource(variants.get(i).Img);
                pos--;
                if (pos == 0) {
                    return;
                }

            }

        }
    }
}
