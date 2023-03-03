package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class two_Fragment extends Fragment {
    String text;

    public two_Fragment(String text) {
        this.text = text;
    }

    public two_Fragment() {

        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_two_, container, false);
        TextView tv= (TextView)v.findViewById(R.id.textView);
        tv.setText(text);
        return v;
    }
}