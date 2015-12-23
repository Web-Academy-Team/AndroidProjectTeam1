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

        db.execSQL("INSERT INTO " + Variant.TABLE_NAME + " ("
                        + Variant.COLUMN_LETTER + ", "
                        + Variant.COLUMN_IMAGE + ", "
                        + Variant.COLUMN_COUNT + ") " +
                        "VALUES " +
                        "('A', " + String.valueOf(R.drawable.pineapple) + ", 0), " +
                        "('A', " + String.valueOf(R.drawable.apricot) + ", 0), " +
                        "('B', " + String.valueOf(R.drawable.squirrel) + ", 0), " +
                        "('B', " + String.valueOf(R.drawable.botinki) + ", 0), " +
                        "('V', " + String.valueOf(R.drawable.vorota) + ", 0), " +
                        "('V', " + String.valueOf(R.drawable.vilka) + ", 0), " +
                        "('G', " + String.valueOf(R.drawable.grusha) + ", 0), " +
                        "('G', " + String.valueOf(R.drawable.galstuk) + ", 0), " +
                        "('D', " + String.valueOf(R.drawable.drova) + ", 0), " +
                        "('D', " + String.valueOf(R.drawable.dyatel) + ", 0), " +
                        "('E', " + String.valueOf(R.drawable.elka) + ", 0), " +
                        "('E', " + String.valueOf(R.drawable.esch) + ", 0), " +
                        "('Ey', " + String.valueOf(R.drawable.esch) + ", 0), " +
                        "('Ey', " + String.valueOf(R.drawable.elka) + ", 0), " +
                        "('Zh', " + String.valueOf(R.drawable.zhuk) + ", 0), " +
                        "('Zh', " + String.valueOf(R.drawable.zhemchug) + ", 0), " +
                        "('Z', " + String.valueOf(R.drawable.zebra) + ", 0), " +
                        "('Z', " + String.valueOf(R.drawable.zont) + ", 0), " +
                        "('I', " + String.valueOf(R.drawable.ikra) + ", 0), " +
                        "('I', " + String.valueOf(R.drawable.izum) + ", 0), " +
                        "('Iy', " + String.valueOf(R.drawable.yogurt) + ", 0), " +
                        "('Iy', " + String.valueOf(R.drawable.yod) + ", 0), " +
                        "('K', " + String.valueOf(R.drawable.kastrula) + ", 0), " +
                        "('K', " + String.valueOf(R.drawable.kolokol) + ", 0), " +
                        "('L', " + String.valueOf(R.drawable.lime) + ", 0), " +
                        "('L', " + String.valueOf(R.drawable.lodka) + ", 0), " +
                        "('M', " + String.valueOf(R.drawable.mylo) + ", 0), " +
                        "('M', " + String.valueOf(R.drawable.auto) + ", 0), " +
                        "('N', " + String.valueOf(R.drawable.noschnizy) + ", 0), " +
                        "('N', " + String.valueOf(R.drawable.nebo) + ", 0), " +
                        "('O', " + String.valueOf(R.drawable.ogurez) + ", 0), " +
                        "('O', " + String.valueOf(R.drawable.window) + ", 0), " +
                        "('P', " + String.valueOf(R.drawable.peper) + ", 0), " +
                        "('P', " + String.valueOf(R.drawable.pylesos) + ", 0), " +
                        "('R', " + String.valueOf(R.drawable.fish) + ", 0), " +
                        "('R', " + String.valueOf(R.drawable.raduga) + ", 0), " +
                        "('S', " + String.valueOf(R.drawable.desk) + ", 0), " +
                        "('S', " + String.valueOf(R.drawable.slon) + ", 0), " +
                        "('T', " + String.valueOf(R.drawable.tort) + ", 0), " +
                        "('T', " + String.valueOf(R.drawable.phone) + ", 0), " +
                        "('U', " + String.valueOf(R.drawable.utug) + ", 0), " +
                        "('U', " + String.valueOf(R.drawable.usy) + ", 0), " +
                        "('F', " + String.valueOf(R.drawable.photo) + ", 0), " +
                        "('F', " + String.valueOf(R.drawable.fonar) + ", 0), " +
                        "('H', " + String.valueOf(R.drawable.brot) + ", 0), " +
                        "('H', " + String.valueOf(R.drawable.kholodilnik) + ", 0), " +
                        "('C', " + String.valueOf(R.drawable.zvetok) + ", 0), " +
                        "('C', " + String.valueOf(R.drawable.zep) + ", 0), " +
                        "('Ch', " + String.valueOf(R.drawable.chesnok) + ", 0), " +
                        "('Ch', " + String.valueOf(R.drawable.tasse) + ", 0), " +
                        "('Sh', " + String.valueOf(R.drawable.shishki) + ", 0), " +
                        "('Sh', " + String.valueOf(R.drawable.shashki) + ", 0), " +
                        "('Shy', " + String.valueOf(R.drawable.shetka) + ", 0), " +
                        "('Shy', " + String.valueOf(R.drawable.shenok) + ", 0), " +
                        "('Zt', " + String.valueOf(R.drawable.zt_button) + ", 200), " +
                        "('Yy', " + String.valueOf(R.drawable.yy_button) + ", 200), " +
                        "('Zm', " + String.valueOf(R.drawable.zm_button) + ", 200), " +
                        "('Ee', " + String.valueOf(R.drawable.ee_button) + ", 200), " +
                        "('Uy', " + String.valueOf(R.drawable.ula) + ", 0), " +
                        "('Uy', " + String.valueOf(R.drawable.ubka) + ", 0), " +
                        "('Ya', " + String.valueOf(R.drawable.apple) + ", 0), " +
                        "('Ya', " + String.valueOf(R.drawable.yakor) + ", 0)");

        db.execSQL("CREATE TABLE " + Character.TABLE_NAME + " ("
                + Character.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Character.COLUMN_LETTER_IMAGE + " INTEGER NOT NULL,"
                + Character.COLUMN_LETTER_BEEP + " INTEGER NOT NULL);");

      //  db.execSQL("INSERT INTO "+Character.COLUMN_LETTER_IMAGE+"VALUES"+R.string.values);
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
        int idv;

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
                db.update(Variant.TABLE_NAME, values, "_id = ? AND Count != ?", args);
            }
            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();
        }
        return idv;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
