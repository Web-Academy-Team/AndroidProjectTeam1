package com.webacademy.androidprojectteam;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.webacademy.androidprojectteam.R.drawable.a_button;

public class Activity_3 extends AppCompatActivity implements  SoundPool.OnLoadCompleteListener{
    private String character = "";
    private String userName = "";
    private SoundPool sp;
    private int soundId;

    public int Letter;
    public ArrayList<Variant> variants;
    public int countVariants = 4;
    public String[] imgLetter = new String[countVariants];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        variants = new ArrayList<>();
        variants.add(new Variant("A", R.drawable.pineapple, 0));   // 0
        variants.add(new Variant("A", R.drawable.apricot, 0));       // 1
        variants.add(new Variant("B", R.drawable.squirrel, 0));     // 2
        variants.add(new Variant("B", R.drawable.botinki, 0));
        variants.add(new Variant("V", R.drawable.vorota, 0));
        variants.add(new Variant("V", R.drawable.vilka, 0));
        variants.add(new Variant("G", R.drawable.grusha, 0));
        variants.add(new Variant("G", R.drawable.galstuk, 0));
        variants.add(new Variant("D", R.drawable.drova, 0));
        variants.add(new Variant("D", R.drawable.dyatel, 0));
        variants.add(new Variant("E", R.drawable.elka, 0));
        variants.add(new Variant("E", R.drawable.esch, 0));
        variants.add(new Variant("Ey", R.drawable.esch, 0));
        variants.add(new Variant("Ey", R.drawable.elka, 0));
        variants.add(new Variant("Zh", R.drawable.zhuk, 0));
        variants.add(new Variant("Zh", R.drawable.zhemchug, 0));
        variants.add(new Variant("Z", R.drawable.zebra, 0));
        variants.add(new Variant("Z", R.drawable.zont, 0));
        variants.add(new Variant("I", R.drawable.ikra, 0));
        variants.add(new Variant("I", R.drawable.izum, 0));
        variants.add(new Variant("Iy", R.drawable.yogurt, 0));
        variants.add(new Variant("Iy", R.drawable.yod, 0));
        variants.add(new Variant("K", R.drawable.kastrula, 0));
        variants.add(new Variant("K", R.drawable.kolokol, 0));
        variants.add(new Variant("L", R.drawable.lime, 0));
        variants.add(new Variant("L", R.drawable.lodka, 0));
        variants.add(new Variant("M", R.drawable.auto, 0));
        variants.add(new Variant("M", R.drawable.mylo, 0));
        variants.add(new Variant("N", R.drawable.noschnizy, 0));
        variants.add(new Variant("N", R.drawable.nebo, 0));
        variants.add(new Variant("O", R.drawable.ogurez, 0));
        variants.add(new Variant("O", R.drawable.window, 0));
        variants.add(new Variant("P", R.drawable.peper, 0));
        variants.add(new Variant("P", R.drawable.pylesos, 0));
        variants.add(new Variant("R", R.drawable.fish, 0));
        variants.add(new Variant("R", R.drawable.raduga, 0));
        variants.add(new Variant("S", R.drawable.desk, 0));
        variants.add(new Variant("S", R.drawable.slon, 0));
        variants.add(new Variant("T", R.drawable.tort, 0));
        variants.add(new Variant("T", R.drawable.phone, 0));
        variants.add(new Variant("U", R.drawable.utug, 0));
        variants.add(new Variant("U", R.drawable.usy, 0));
        variants.add(new Variant("F", R.drawable.photo, 0));
        variants.add(new Variant("F", R.drawable.fonar, 0));
        variants.add(new Variant("H", R.drawable.brot, 0));
        variants.add(new Variant("H", R.drawable.kholodilnik, 0));
        variants.add(new Variant("C", R.drawable.zvetok, 0));
        variants.add(new Variant("C", R.drawable.zep, 0));
        variants.add(new Variant("Ch", R.drawable.chesnok, 0));
        variants.add(new Variant("Ch", R.drawable.tasse, 0));
        variants.add(new Variant("Sh", R.drawable.shishki, 0));
        variants.add(new Variant("Sh", R.drawable.shashki, 0));
        variants.add(new Variant("Shy", R.drawable.shetka, 0));
        variants.add(new Variant("Shy", R.drawable.shenok, 0));
        variants.add(new Variant("Zt", R.drawable.zt_button, 0));
        variants.add(new Variant("Yy", R.drawable.yy_button, 0));
        variants.add(new Variant("Zm", R.drawable.zm_button, 0));
        variants.add(new Variant("Ee", R.drawable.ee_button, 0));
        variants.add(new Variant("Uy", R.drawable.ula, 0));
        variants.add(new Variant("Uy", R.drawable.ubka, 0));
        variants.add(new Variant("Ya", R.drawable.apple, 0));
        variants.add(new Variant("Ya", R.drawable.yakor, 0));

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
        setVariants(character, Letter, 1);       // (character, id.drawable.char, level)
    }

    public String charClick(View v){

        String answer = "false";
        String toastString = "Будь внимательней,\n    подумай еще...\n\n";

        sp.play(soundId, 1, 1, 0, 0, 1);
        switch (v.getId()){
            case R.id.img1:
                if(character.equals(imgLetter[1])){
                    answer = "true";
                }
                break;

            case R.id.img2:
                if(character.equals(imgLetter[2])){
                    answer = "true";
                }
                break;

            case R.id.img3:
                if(character.equals(imgLetter[3])){
                    answer = "true";
                }
                break;

        }

        LayoutInflater inflater = getLayoutInflater();
        View vToast = inflater.inflate(R.layout.toast, null);

        TextView toastText = (TextView) vToast.findViewById(R.id.toastText);
        if(answer.equals("true")){
            toastText.setTextColor(getResources().getColor(R.color.GREEN));
            toastString = "  Молодец! \nПравильно! \n\n";
        }
        toastText.setText(toastString);

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(vToast);
        toast.show();
        return answer;
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
    }

    public void setVariants(String letter, int buk, int level) {

        ((ImageView) findViewById(R.id.alpChar)).setImageResource(buk);
        ((TextView) findViewById(R.id.findWord)).setText(userName + ", угадай слово");

        int[] imgPosition = new int[countVariants];
        imgPosition[0] = 0;
        imgPosition[1] = R.id.img1;
        imgPosition[2] = R.id.img2;
        imgPosition[3] = R.id.img3;


        int pos = imgPosition.length-1, cnt = 0;

        for(int i = 0; i < variants.size(); i++) {

            if((letter.equals(variants.get(i).Letter)) && (level != 0)){
                ((ImageView) findViewById(imgPosition[pos])).setImageResource(variants.get(i).Img);
                imgLetter[pos] = variants.get(i).Letter;
                variants.get(i).incVariantCount(variants.size());
                level--;
                pos--;
                if(pos == 0){
                    return;
                }
            }
            if(!(letter.equals(variants.get(i).Letter)) && (pos > level)) {
                ((ImageView) findViewById(imgPosition[pos])).setImageResource(variants.get(i).Img);
                imgLetter[pos] = variants.get(i).Letter;
                pos--;
                if (pos == 0) {
                    return;
                }
            }
        }
    }
}
