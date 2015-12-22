package com.webacademy.androidprojectteam;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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


 //     Create Data base Variants;
        DBHelper helper = new DBHelper(this);

/*
        helper.insertVariant(new Variant("A", R.drawable.pineapple, 0));   // 0
        helper.insertVariant(new Variant("A", R.drawable.apricot, 0));       // 1
        helper.insertVariant(new Variant("B", R.drawable.squirrel, 0));     // 2
        helper.insertVariant(new Variant("B", R.drawable.botinki, 0));
        helper.insertVariant(new Variant("V", R.drawable.vorota, 0));
        helper.insertVariant(new Variant("V", R.drawable.vilka, 0));
        helper.insertVariant(new Variant("G", R.drawable.grusha, 0));
        helper.insertVariant(new Variant("G", R.drawable.galstuk, 0));
        helper.insertVariant(new Variant("D", R.drawable.drova, 0));
        helper.insertVariant(new Variant("D", R.drawable.dyatel, 0));
        helper.insertVariant(new Variant("E", R.drawable.elka, 0));
        helper.insertVariant(new Variant("E", R.drawable.esch, 0));
        helper.insertVariant(new Variant("Ey", R.drawable.esch, 0));
        helper.insertVariant(new Variant("Ey", R.drawable.elka, 0));
        helper.insertVariant(new Variant("Zh", R.drawable.zhuk, 0));
        helper.insertVariant(new Variant("Zh", R.drawable.zhemchug, 0));
        helper.insertVariant(new Variant("Z", R.drawable.zebra, 0));
        helper.insertVariant(new Variant("Z", R.drawable.zont, 0));
        helper.insertVariant(new Variant("I", R.drawable.ikra, 0));
        helper.insertVariant(new Variant("I", R.drawable.izum, 0));
        helper.insertVariant(new Variant("Iy", R.drawable.yogurt, 0));
        helper.insertVariant(new Variant("Iy", R.drawable.yod, 0));
        helper.insertVariant(new Variant("K", R.drawable.kastrula, 0));
        helper.insertVariant(new Variant("K", R.drawable.kolokol, 0));
        helper.insertVariant(new Variant("L", R.drawable.lime, 0));
        helper.insertVariant(new Variant("L", R.drawable.lodka, 0));
        helper.insertVariant(new Variant("M", R.drawable.auto, 0));
        helper.insertVariant(new Variant("M", R.drawable.mylo, 0));
        helper.insertVariant(new Variant("N", R.drawable.noschnizy, 0));
        helper.insertVariant(new Variant("N", R.drawable.nebo, 0));
        helper.insertVariant(new Variant("O", R.drawable.ogurez, 0));
        helper.insertVariant(new Variant("O", R.drawable.window, 0));
        helper.insertVariant(new Variant("P", R.drawable.peper, 0));
        helper.insertVariant(new Variant("P", R.drawable.pylesos, 0));
        helper.insertVariant(new Variant("R", R.drawable.fish, 0));
        helper.insertVariant(new Variant("R", R.drawable.raduga, 0));
        helper.insertVariant(new Variant("S", R.drawable.desk, 0));
        helper.insertVariant(new Variant("S", R.drawable.slon, 0));
        helper.insertVariant(new Variant("T", R.drawable.tort, 0));
        helper.insertVariant(new Variant("T", R.drawable.phone, 0));
        helper.insertVariant(new Variant("U", R.drawable.utug, 0));
        helper.insertVariant(new Variant("U", R.drawable.usy, 0));
        helper.insertVariant(new Variant("F", R.drawable.photo, 0));
        helper.insertVariant(new Variant("F", R.drawable.fonar, 0));
        helper.insertVariant(new Variant("H", R.drawable.brot, 0));
        helper.insertVariant(new Variant("H", R.drawable.kholodilnik, 0));
        helper.insertVariant(new Variant("C", R.drawable.zvetok, 0));
        helper.insertVariant(new Variant("C", R.drawable.zep, 0));
        helper.insertVariant(new Variant("Ch", R.drawable.chesnok, 0));
        helper.insertVariant(new Variant("Ch", R.drawable.tasse, 0));
        helper.insertVariant(new Variant("Sh", R.drawable.shishki, 0));
        helper.insertVariant(new Variant("Sh", R.drawable.shashki, 0));
        helper.insertVariant(new Variant("Shy", R.drawable.shetka, 0));
        helper.insertVariant(new Variant("Shy", R.drawable.shenok, 0));
        helper.insertVariant(new Variant("Zt", R.drawable.zt_button, 200));
        helper.insertVariant(new Variant("Yy", R.drawable.yy_button, 200));
        helper.insertVariant(new Variant("Zm", R.drawable.zm_button, 200));
        helper.insertVariant(new Variant("Ee", R.drawable.ee_button, 200));
        helper.insertVariant(new Variant("Uy", R.drawable.ula, 0));
        helper.insertVariant(new Variant("Uy", R.drawable.ubka, 0));
        helper.insertVariant(new Variant("Ya", R.drawable.apple, 0));
        helper.insertVariant(new Variant("Ya", R.drawable.yakor, 0));
*/
/*
 //     Delete Data base
        int i;
        for(i = 0; i < 6200; i++){
        helper.deleteVariant(i);
       }
        Log.d(Activity_1.LOG_TAG, "Delete variants - " + String.valueOf(i));
*/

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
