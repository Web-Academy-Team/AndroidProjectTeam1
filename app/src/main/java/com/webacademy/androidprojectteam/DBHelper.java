package com.webacademy.androidprojectteam;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "AbcDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Variant.TABLE_NAME + " ("
        + Variant.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
        + Variant.COLUMN_LETTER + " TEXT NOT NULL,"
        + Variant.COLUMN_IMAGE + " INTEGER NOT NULL,"
        + Variant.COLUMN_COUNT + " INTEGER NOT NULL);");

        db.execSQL("CREATE TABLE " + Character.TABLE_NAME + " ("
                + Character.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Character.COLUMN_LETTER_IMAGE + " INTEGER NOT NULL,"
                + Character.COLUMN_LETTER_BEEP + " INTEGER NOT NULL);");
    }

    public long insertVariant(Variant variant){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Variant.COLUMN_LETTER, variant.Letter);
        values.put(Variant.COLUMN_IMAGE, variant.Img);
        values.put(Variant.COLUMN_COUNT, variant.Count);

        return db.insert(Variant.TABLE_NAME, null, values);
    }

    public long insertCharacter(Character character){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Character.COLUMN_LETTER_IMAGE, character.LetterImage);
        values.put(Character.COLUMN_LETTER_BEEP, character.LetterBeep);

        return db.insert(Character.TABLE_NAME, null, values);
    }

    public Variant getVariant (long id){
        SQLiteDatabase db = getWritableDatabase();
        Variant variant = null;
        Cursor cursor = null;

        try{
            cursor = db.query(Variant.TABLE_NAME, null,
                    Variant.COLUMN_ID + " = " + String.valueOf(id),
                    null, null, null, null);

            if(cursor.moveToFirst()){
                variant = new Variant();

                variant.id = cursor.getLong(cursor.getColumnIndex(Variant.COLUMN_ID));
                variant.Letter = cursor.getString(cursor.getColumnIndex(Variant.COLUMN_LETTER));
                variant.Img = cursor.getInt(cursor.getColumnIndex(Variant.COLUMN_IMAGE));
                variant.Count = cursor.getInt(cursor.getColumnIndex(Variant.COLUMN_COUNT));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(cursor != null){
                cursor.close();
            }
        }
        return variant;
    }

    public Character getCharacter (long id){
        SQLiteDatabase db = getWritableDatabase();
        Character character = null;
        Cursor cursor = null;

        try{
            cursor = db.query(Character.TABLE_NAME, null,
                    Character.COLUMN_ID + " = " + String.valueOf(id),
                    null, null, null, null);

            if(cursor.moveToFirst()){
                character = new Character();

                character.id = cursor.getLong(cursor.getColumnIndex(Character.COLUMN_ID));
                character.LetterImage = cursor.getInt(cursor.getColumnIndex(Character.COLUMN_LETTER_IMAGE));
                character.LetterBeep = cursor.getInt(cursor.getColumnIndex(Character.COLUMN_LETTER_BEEP));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(cursor != null){
                cursor.close();
            }
        }
        return character;
    }

    public int deleteVariant(long idVariant){
        SQLiteDatabase db = getWritableDatabase();

        return db.delete(Variant.TABLE_NAME,
                Variant.COLUMN_ID + " = " + String.valueOf(idVariant),
                null);
    }

    public ArrayList<Variant> getAllVariants (){
        SQLiteDatabase db = getWritableDatabase();
        ArrayList<Variant> variants = new ArrayList<>();
        Cursor cursor = null;

        try{
            cursor = db.query(Variant.TABLE_NAME, null, null, null, null, null, null);

            if(cursor.moveToFirst()) {
                while (!cursor.isAfterLast()) {
                    Variant variant = new Variant();

                    variant.id = cursor.getLong(cursor.getColumnIndex(Variant.COLUMN_ID));
                    variant.Letter = cursor.getString(cursor.getColumnIndex(Variant.COLUMN_LETTER));
                    variant.Img = cursor.getInt(cursor.getColumnIndex(Variant.COLUMN_IMAGE));
                    variant.Count = cursor.getInt(cursor.getColumnIndex(Variant.COLUMN_COUNT));

                    variants.add(variant);

                    cursor.moveToNext();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(cursor != null){
                cursor.close();
            }
        }
        return variants;
    }

    public int setAllVariants(ArrayList<Variant> object) {
        int idv, cntUp = 0;

        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();

        db.beginTransaction();

        try {
            for (idv = 0; idv < object.size(); idv++) {

                Log.d(Activity_1.LOG_TAG, " id " + object.get(idv).id + ": "
                        + object.get(idv).Letter + ", cnt_"
                        + object.get(idv).Count);

                values.put(Variant.COLUMN_ID, object.get(idv).id);
                values.put(Variant.COLUMN_LETTER, object.get(idv).Letter);
                values.put(Variant.COLUMN_IMAGE, object.get(idv).Img);
                values.put(Variant.COLUMN_COUNT, object.get(idv).Count);
                String[] args = new String[]{String.valueOf(object.get(idv).id), String.valueOf(object.get(idv).Count)};
                cntUp = db.update(Variant.TABLE_NAME, values, "_id = ? AND Count != ?", args);
            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
        }
        Log.d(Activity_1.LOG_TAG, "Update values -" + String.valueOf(cntUp));
        return idv;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
