package com.example.senamit.myapplication;

import android.widget.TextView;

/**
 * Created by senamit on 17/9/17.
 */

public class Word  {

   private String mDefaultTranslation;
    private String mMiswapTranslation;
    private int mImage;

    public Word(String mDefaultTranslation, String mMiswapTranslation){

        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiswapTranslation = mMiswapTranslation;

    }

    public Word(String mDefaultTranslation, String mMiswapTranslation, int mImage){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiswapTranslation = mMiswapTranslation;
        this.mImage = mImage;

    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiswapTranslation() {
        return mMiswapTranslation;
    }

    public int getmImage() {
        return mImage;
    }
}
