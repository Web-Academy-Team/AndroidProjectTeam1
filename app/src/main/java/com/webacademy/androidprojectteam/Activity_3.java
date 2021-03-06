package com.webacademy.androidprojectteam;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    private int countVariant = 0;

    public int Letter;
    public ArrayList<Variant> variants;
    public int countVariants = 4;
    public String[] imgLetter = new String[countVariants];
    public DBHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        helper = new DBHelper(this);
        variants = helper.getAllVariants();

        for(int i = 0; i < variants.size(); i++){
            if(variants.get(i).Count != countVariant) {
                countVariant = variants.get(i).Count;
            }
        }

        Log.d(Activity_1.LOG_TAG, "Array variants - " + String.valueOf(variants.size()));

        Intent intent = getIntent();
        if (intent != null){
            userName = intent.getStringExtra(Activity_1.USER_NAME);
            character = intent.getStringExtra(Activity_2.KEY_ALPHABET_BUTTON);
        }

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        sp.setOnLoadCompleteListener(this);

        choiceChar(character);
    }

    @Override
    protected void onStop() {
        super.onStop();

        int cnt;

        cnt = helper.setAllVariants(variants);
    }

    private void choiceChar(String character){
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
        String toastString = "Будь внимательней,\n     подумай еще...\n\n";

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
        ((TextView) findViewById(R.id.findWord)).setText("Какое название предмета\nначинается на эту букву?");

        int[] imgPosition = new int[countVariants];
        imgPosition[0] = 0;
        imgPosition[1] = R.id.img1;
        imgPosition[2] = R.id.img2;
        imgPosition[3] = R.id.img3;


        int pos = imgPosition.length-1, in;

        for( in = 0; in < variants.size(); in++) {

            if ((letter.equals(variants.get(in).Letter)) && (level != 0)) {
                ((ImageView) findViewById(imgPosition[pos])).setImageResource(variants.get(in).Img);
                imgLetter[pos] = variants.get(in).Letter;
                level--;
                pos--;
                if (pos == 0) {
                    break;
                }
            }
            if (!(letter.equals(variants.get(in).Letter)) && (pos > level)) {
                if (countVariant >= variants.get(in).Count) {
                    ((ImageView) findViewById(imgPosition[pos])).setImageResource(variants.get(in).Img);
                    variants.get(in).incVariantCount(variants.size());
                    imgLetter[pos] = variants.get(in).Letter;
                    in++;
                    pos--;
                    if (pos == 0) {
                        break;
                    }
                }
            }
        }
        if(pos > 1){
            countVariant++;
            if(countVariants >= variants.size()){
                countVariants = 0;
            }
        }
        Log.d(Activity_1.LOG_TAG, "countVariant - " + String.valueOf(countVariant));
    }
}
