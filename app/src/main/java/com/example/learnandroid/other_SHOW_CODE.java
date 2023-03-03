package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class other_SHOW_CODE extends Fragment {
    String data;
    String other_heading;
    TextView text;
    TextView heading;

    public other_SHOW_CODE() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            data = getArguments().getString("other");
            other_heading = getArguments().getString("other_heading");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_other__s_h_o_w__c_o_d_e, container, false);
        text = v. findViewById(R.id.othercode);
        heading = v. findViewById(R.id.heading);
        heading.setText(other_heading);
        text.setText(data);


        return v;
    }
}