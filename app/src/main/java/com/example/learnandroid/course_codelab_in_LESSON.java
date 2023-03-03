package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class course_codelab_in_LESSON extends AppCompatActivity {
    String []n={
            "Android Mobile Application Development by SWAYAM","Android app using Kotlin by SWAYAM"
            ,"Android Application Development by  Great Learning."
            ,"UX Design for Mobile Developers by Google"
            ,"Firebase in a Weekend: Android  by Google"
            ,"Codelabs for Android Developer Fundamentals by Goggle"
            ,"Associate Android Developer Certification by Google"
            ,"ViewModel overview"
            ,"Data Binding overview"
                };


    String []d={"Android Mobile Application Development course is designed such that after successfully completed the course, the learner will be able to use the development tools in the Android development environment, use the major components of Android API to develop their own apps",
    "Kotlin is a new open source programming language built by JetBrains.The Spoken Tutorial effort for Android app using Kotlin has been contributed by, IIT Bombay."
    ,"Learn to build interactive Android Apps using Android Studio without much effort and hassle. Kickstart your journey in Android Application Development with our free Android course for beginners."
    ,"This is a design course made for developers. You'll learn UX design skills which will help you make 5-star mobile apps that your users will love."
            ,"This course will teach you when and why to choose Firebase as a backend for your Android application."

            ,"This page lists the practical codelabs that are included in the Android Developer Fundamentals course. For links to the concept chapters, slides, and apps that accompany these codelabs"
            ,"Topics\n" +
            "1.Android core\n" +
            "2.User interface\n" +
            "3.Data management\n" +
            "4.Debugging\n" +
            "5.Testing"
    ,"The ViewModel class is a business logic or screen level state holder. It exposes state to the UI and encapsulates related business logic. "
,"The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically."

    };

//    int []l={R.string.link,R.string.link2,R.string.link};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_codelab_in_lesson);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Courses & Codelabs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listView = findViewById(R.id.listview);
        course_codelab_in_LESSON.ListViewAdapter adapter = new course_codelab_in_LESSON.ListViewAdapter(getApplicationContext(), n, d);
        listView.setAdapter(adapter);
    }


    class ListViewAdapter extends ArrayAdapter {

        String[] p_name;
        String[] p_link;
        String[] p_des;
        private final Context context;


        public ListViewAdapter(Context context, String[] names,  String[] descrip) {
            super(context, R.layout.cardview_for_courses_codelabs, R.id.plugin_name, names);
            this.p_name = names;
            this.context = context;
            this.p_link = context.getResources().getStringArray(R.array.links);
            this.p_des = descrip;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.cardview_for_courses_codelabs, parent, false);

            TextView p_text = row.findViewById(R.id.plugin_name);
            TextView p_d = row.findViewById(R.id.plugin_description);
            TextView p_lk = row.findViewById(R.id.plugin_link);
            final String url = p_link[position];
            p_lk.setText(url);
            p_lk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (URLUtil.isValidUrl(url)) {
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(i);
                    } else {
                        // Show a message or do something else
                    }
                }
            });
            p_lk.setMovementMethod(LinkMovementMethod.getInstance());
            p_text.setText(p_name[position]);
            p_lk.setText(p_link[position]);
            p_d.setText(p_des[position]);
            return row;
        }
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