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

public class lessons_activity extends AppCompatActivity {
    String[] name = {"Project Structure", "UI Widgets", "View,Layout & Resource ", "Application Components", "Containers", "Activity & Intents", "Fragments", "Data Storage", "Json Parsing", "Firebase"

    };
    int[] imag = {R.drawable.projectstructure_manifest, R.drawable.widgets, R.drawable.layout_types, R.drawable.example_gridview,
            R.drawable.container, R.drawable.activity_intent_activity, R.drawable.fragment, R.drawable.datastorage_icon, R.drawable.jsoon, R.drawable.firebase,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Tutorial");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listView = findViewById(R.id.introduction_listview);
        lessons_activity.CustomAdapter customAdapter = new lessons_activity.CustomAdapter(getApplicationContext(), imag, name);
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
                            Intent intent = new Intent(lessons_activity.this, project_STRUCTURE.class);
                            startActivity(intent);
                            break;
                        case 1:
                            Intent intent5 = new Intent(lessons_activity.this, ui_widgets_in_LESSON.class);
                            startActivity(intent5);
                            break;
                        case 2:
                            Intent intent2 = new Intent(lessons_activity.this, view_layout_in_LESSON.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(lessons_activity.this, components_in_LESSONS.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(lessons_activity.this, containers_in_LESSONS.class);
                            startActivity(intent4);
                            break;

                        case 5:
                            Intent intent9 = new Intent(lessons_activity.this, activity_and_INTENT_in_LESSON.class);
                            startActivity(intent9);
                            break;
                        case 6:
                            Intent intent6 = new Intent(lessons_activity.this, intents_AND_fragments_in_LESSONS.class);
                            startActivity(intent6);
                            break;
                        case 7:

                            Intent intent7 = new Intent(lessons_activity.this, data_storage_IN_LESSONS.class);
                            startActivity(intent7);
                            break;
                        case 8:
                            Intent intent8 = new Intent(lessons_activity.this, json_parsing_IN_LESSONS.class);
                            startActivity(intent8);
                            break;

                        case 9:
                            Intent intent10 = new Intent(lessons_activity.this, firebase_IN_LESSONS.class);
                            startActivity(intent10);
                            break;

                    }
                }
            });

            return view;
        }
    }
}