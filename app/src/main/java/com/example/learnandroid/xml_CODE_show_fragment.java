package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class xml_CODE_show_fragment extends Fragment {

    String data;
    TextView text;
    public xml_CODE_show_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            data = getArguments().getString("xmlcode");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v=inflater.inflate(R.layout.fragment_xml__c_o_d_e_show_fragment, container, false);

        text = v. findViewById(R.id.xmlcode);
        text.setText(data);


        return v;
    }
}