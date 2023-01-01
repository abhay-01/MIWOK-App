package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResId;

    private Integer mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultTranslation, String mivokTranslation, int audioResId) {
        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = mivokTranslation;

        mAudioResId = audioResId;

    }

    public Word(String DefaultTranslation, String mivokTranslation, Integer ImageId, Integer AudioResId) {
        mDefaultTranslation = DefaultTranslation;

        mMiwokTranslation = mivokTranslation;

        mImageId = ImageId;

        mAudioResId = AudioResId;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    public Integer getImageId() {
        return mImageId;
    }


    public boolean hasImage() {

        return mImageId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResId() {
        return mAudioResId;
    }
}

