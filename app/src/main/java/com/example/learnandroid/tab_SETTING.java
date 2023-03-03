package com.example.learnandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class tab_SETTING extends Fragment {

    public tab_SETTING() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V= inflater.inflate(R.layout.fragment_tab__s_e_t_t_i_n_g, container, false);
        Button b= (Button) V.findViewById(R.id.butt);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"This is Setting",Toast.LENGTH_SHORT).show();
            }
        });
        return V;
    }
}