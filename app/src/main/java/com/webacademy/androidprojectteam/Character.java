package com.webacademy.androidprojectteam;

/**
 * Created by vitaly on 21.12.15.
 */
public class Character {

    public static final String TABLE_NAME = "Characters";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_LETTER_IMAGE = "LetterImage";
    public static final String COLUMN_LETTER_BEEP = "LetterBeep";

    public long id;
    public int LetterImage;
    public int LetterBeep;

    public Character(){

    }

    public Character(int letterImage, int letterBeep){
        this.LetterImage = letterImage;
        this.LetterBeep = letterBeep;
    }


}
