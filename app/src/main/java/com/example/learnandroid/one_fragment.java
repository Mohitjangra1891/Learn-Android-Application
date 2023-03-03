package com.example.learnandroid;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class one_fragment extends Fragment {

    public one_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_one_fragment, container, false);
        EditText editText= (EditText) v.findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Fragment fragment=new two_Fragment(String.valueOf(charSequence));
                FragmentManager manager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=manager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment2,fragment);
                fragmentTransaction.commit();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        return v;
    }
}