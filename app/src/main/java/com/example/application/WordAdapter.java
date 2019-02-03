package com.example.application;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, int resource, ArrayList<Word> wordsList) {
        super(context, resource, wordsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        boolean b = false;
        return super.getView(position, convertView, parent);
    }
}
