package com.webacademy.androidprojectteam;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

/**
 * Created by vitaly on 17.12.15.
 */
public class Variant implements Parcelable{

    public String Letter;
    public int Img;
    public int Count;

    public int incVariantCount(int maxCount){

        this.Count++;
        if(this.Count > maxCount)    this.Count = 0;

        return Count;
    }

    public Variant(){

    }

    public Variant(String letter, int img, int count){
        this.Letter = letter;
        this.Img = img;
        this.Count = count;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Letter);
        dest.writeInt(this.Img);
        dest.writeInt(this.Count);
    }

    protected Variant(Parcel in) {
        this.Letter = in.readString();
        this.Img = in.readInt();
        this.Count = in.readInt();
    }

    public static final Creator<Variant> CREATOR = new Creator<Variant>() {
        public Variant createFromParcel(Parcel source) {
            return new Variant(source);
        }

        public Variant[] newArray(int size) {
            return new Variant[size];
        }
    };
}
