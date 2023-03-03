package com.example.learnandroid;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class preXmlActivity extends PreferenceActivity {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);
    }
}
