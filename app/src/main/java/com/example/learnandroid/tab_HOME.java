package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class tab_HOME extends Fragment {



    public tab_HOME() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V= inflater.inflate(R.layout.fragment_tab__h_o_m_e, container, false);
        Button b= (Button) V.findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"This is Home",Toast.LENGTH_SHORT).show();
            }
        });
        return V;
    }
}