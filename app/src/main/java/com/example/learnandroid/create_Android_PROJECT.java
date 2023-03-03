package com.example.learnandroid;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class create_Android_PROJECT extends AppCompatActivity {
    String t1="If you have a project already opened, select File > New" +
            "> New Project.\n\n" +
            "In the Select a Project Template window, select Empty" +
            "Activity and click Next.\n\n";
    String t2="In the Configure your project window, complete the" +
            "following:\n\n" +
            "·Enter \"HelloWorldApp\" in the Name field.\n" +
            "•Enter \"com.tutorial.helloworldapp\" in the Package" +
            "name field.\n" +
            "• If you'd like to place the project in a different folder," +
            "change its Save location.\n" +
            "• Select either Java or Kotlin from the Language" +
            "drop-down menu.\n" +
            "•Select the lowest version of Android your app will" +
            "support in the Minimum SDK field.\n" +
            "• If your app will require legacy library support, mark" +
            "the Use legacy android.support libraries checkbox.\n" +
            "•Leave the other options as they are.\n\n";
    String t3="Now take a moment to review the most important" +
            "files.\n\n" +
            "First, be sure the Project window is open (select View" +
            ">Tool Windows > Project) and the Android view is" +
            "selected from the drop-down list at the top of that" +
            "window. You can then see the following files:\n\n\n" +"app > java > com.tutorial.helloworldapp >" +
            "MainActivity\n\n" +
            "This is the main activity. It's the entry point for your" +
            "app. When you build and run your app, the system" +
            "launches an instance of this Activity and loads its" +
            "layout.\n\n\n" +
            "app > res> layout > activity_main.xml\n\n" +
            "This XML file defines the layout for the activity's user" +
            "interface (UI). It contains a TextView element with the" +
            "text \"Hello, World!\"\n\n\n" +
            "app > manifests > AndroidManifest.xml\n\n" +
            "The manifest file describes the fundamental" +
            "characteristics of the app and defines each of its" +
            "components.\n\n\n" +
            "Gradle Scripts > build.gradle\n\n" +
            "There are two files with this name: one for the project," +
            "Project: Hello WorldApp, and one for the app module," +
            "Module: app. Each module has its own build. gra dle" +
            "file, but this project currently has just one module. Use" +
            "each module's build. file to control how the Gradle plugin" +
            "builds your app. For more information about this file," +
            "see Configure your build.";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_android_project);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Project");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

//        ImageView imageView = findViewById(R.id.image1);
////        Picasso.get().load("http://codensi.com/wp-content/uploads/2019/10/pic1.png").into(imageView);
//        ImageView imageView2 = findViewById(R.id.image2);
////        Picasso.get().load("http://codensi.com/wp-content/uploads/2019/10/pic2.png").into(imageView2);
//        ImageView imageView3 = findViewById(R.id.image3);
////        Picasso.get().load("http://codensi.com/wp-content/uploads/2019/10/pic3.png").into(imageView3);
//        ImageView imageView4 = findViewById(R.id.image4);
////        Picasso.get().load("http://codensi.com/wp-content/uploads/2019/10/pic6.png").into(imageView4);


//
//        Glide.with(this)
//                .load("http://codensi.com/wp-content/uploads/2019/10/pic1.png")
//                .into(imageView);
//
//
//        Glide.with(this)
//                .load("http://codensi.com/wp-content/uploads/2019/10/pic2.png")
//                .into(imageView2);
//
//        Glide.with(this)
//                .load("http://codensi.com/wp-content/uploads/2019/10/pic3.png")
//                .into(imageView3);
//
//        Glide.with(this)
//                .load("http://codensi.com/wp-content/uploads/2019/10/pic6.png")
//                .into(imageView4);



        TextView textView1 = findViewById(R.id.text2);
        TextView textView2 = findViewById(R.id.text3);
        TextView textView3 = findViewById(R.id.text5);
        TextView textView4 = findViewById(R.id.text8);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        textView1.setText(t1);
        textView2.setText(t2);
        textView3.setText(t3);

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