package com.example.android.miwok;

/**
 * Created by Michaela on 13.03.2018.
 */

public class Word {
 private   String mDefaultTranslation; //English word
private String mMiwokTranslation;       //Miwok translation
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mSoundResourceId;


public Word(String defaultTranslation, String miwokTranslation, int soundResourceId){  //Constructor
    mDefaultTranslation = defaultTranslation;
    mMiwokTranslation = miwokTranslation;
    mSoundResourceId = soundResourceId;
}

public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId){
    mDefaultTranslation = defaultTranslation;
    mMiwokTranslation = miwokTranslation;
    mImageResourceId = imageResourceId;
    mSoundResourceId = soundResourceId;
}

 public String getDefaultTranslation(){   // getDefaultTranslation
    return mDefaultTranslation;
    }
public void setDefaultTranslation(String defaultTranslation) {
     mDefaultTranslation= defaultTranslation;
}

    public String getMiwokTranslation (){    // getMiwokTranslation
        return mMiwokTranslation;
    }
    public void setMiwokTranslation (String miwokTranslation){
        mMiwokTranslation = miwokTranslation;
    }

    public int getImageResourceId (){return mImageResourceId;}
    public boolean hasImage() {
           return mImageResourceId != NO_IMAGE_PROVIDED;
           }

           public int getmSoundResourceId() {return mSoundResourceId;}

}
