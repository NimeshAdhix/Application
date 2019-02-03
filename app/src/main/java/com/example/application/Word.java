package com.example.application;

public class Word {
    private String mEnglishTranslation;
    private String mNepaliTranslation;

    public Word(String mEnglishTranslation, String mNepaliTranslation) {
        this.mEnglishTranslation = mEnglishTranslation;
        this.mNepaliTranslation = mNepaliTranslation;
    }

    public String getmEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getmNepaliTranslation() {
        return mNepaliTranslation;
    }
}
