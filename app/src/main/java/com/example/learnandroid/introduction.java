package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class introduction extends AppCompatActivity {
    String[] name = {"Android Introduction", "Environment Setup", "Create Android Projects", "Run on Android Emulator", "Run on Real Device"
    };
    int[] imag = {
            R.drawable.introduction_introduction1,
            R.drawable.introduction_developer3,
            R.drawable.introduction_virtual_machine,
            R.drawable.introduction_installation,
            R.drawable.introduction_hello_world,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Intro");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listView = findViewById(R.id.introduction_listview);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), imag, name);
        listView.setAdapter(customAdapter);

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

    class CustomAdapter extends BaseAdapter {

        Context context;
        int[] images;
        String[] texts;
        LayoutInflater inflater;

        public CustomAdapter(Context context, int[] images, String[] texts) {
            this.context = context;
            this.images = images;
            this.texts = texts;
            inflater = (LayoutInflater.from(getApplicationContext()));
        }


        @Override
        public int getCount() {
            return texts.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            view = inflater.inflate(R.layout.custom_listview_layout, null);

            ImageView imageView = view.findViewById(R.id.image_custom_listview_item);
            TextView textView = view.findViewById(R.id.name_custom_listview_item);

            imageView.setImageResource(images[position]);

            textView.setText(texts[position]);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (position) {
                        case 0:
                            Intent intent = new Intent(introduction.this, android_INTRODUCTION.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent5 = new Intent(introduction.this, environment_SETUP.class);
                            startActivity(intent5);
                            break;
                        case 2:
                            Intent intent2 = new Intent(introduction.this, create_Android_PROJECT.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(introduction.this, run_on_android_EMULATOR.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(introduction.this, run_on_REAL_DEVICE.class);
                            startActivity(intent4);
                            break;
                    }
                }
            });

            return view;
        }
    }
}