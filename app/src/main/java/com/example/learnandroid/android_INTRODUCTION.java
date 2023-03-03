package com.example.learnandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class android_INTRODUCTION extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_introduction);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Introduction");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        String text1 = "Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smart phones and tablets.\n";
        String text2 = "It was owned by Android, Inc - a company founded in" +
                "October, 2003 by Rich Miner, Nick Sears, Chris White," +
                "and Andy Rubin in Palo Alto, California. Andy Rubin" +
                "said that the Android 0S was originally meant as an" +
                "OS for digital cameras. But back then, the market for" +
                "stand-alone digital cameras was declining and the" +
                "company decided to venture towards using the 0S" +
                "for mobile phones. However, for a while Android, Inc" +
                "was close to shutting down. In January, 2005, Google" +
                "founders Larry page and Sergey Brin met with Android," +
                "Inc and was shown a prototype of their mobile 0S." +
                "Google offered $50 million to acquire Android.\n";
        String text3 = "On July 11, 2005, the Android team moved to Google's" +
                "campus in Mountain View, California and that day was" +
                "considered the official date of Google's acquisition of" +
                "Android\n";
        String text4 = "In November, 2005, Google formed the Open Handset" +
                "Alliance - a consortium of 84 firms to develop" +
                "open standards for mobile devices. Member firms" +
                "include HTC, Sony, Dell, Intel, Motorola, Qualcomm," +
                "Texas Instruments, Google, Samsung Electronics, LG" +
                "Electronics, T-Mobile, Sprint Corporation, Nvidia, and" +
                "Wind River Systems.\n";
        String text5 = "In September 2008, the very first Android smartphon" +
                "was announced, the T-Mobile G1, also known as the" +
                "HTC Dream.\n";



        TextView textView1 = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text2);
        TextView textView3 = findViewById(R.id.text3);
        TextView textView4 = findViewById(R.id.text4);
        TextView textView5 = findViewById(R.id.text5);

        textView1.setText(text1);
        textView2.setText(text2);
        textView3.setText(text3);
        textView4.setText(text4);
        textView5.setText(text5);

    }

    @Override
    public boolean onSupportNavigateUp() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
        return true;
    }
}