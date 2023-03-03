package com.example.learnandroid;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class environment_SETUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environment_setup);
        String text1="To install Android Studio on Windows, proceed as" +
                "follows:\n\n" +
                "1. If you downloaded an .exe file (recommended)," +
                "double-click to launch it.\n\n" +
                "  ~lf you downloaded a .zip file, unpack the ZIP copy" +
                "android-studio folder into your Program Files" +
                "folder, and then open the android-studio > bin folder" +
                "and launch studio64.exe (for 64-bit machines) or" +
                "studio.exe (for 32-bit machines).\n\n" +
                "2. Follow the setup wizard in Android Studio and" +
                "install any SDK packages that it recommends.\n";


        String text = "Android Studio is available for computers running" +
                "Windows or Linux, and for Macs running macoS. The" +
                "OpenJDK (Java Development Kit) is bundled with" +
                "Android Studio.\n\n" +
                "The installation is similar for all platforms. Any" +
                "differences are noted below.\n\n" +
                "1. Navigate to the Android Studio download page and" +
                "follow the instructions to download and install Android" +
                "Studio.\n" +
                "2. Accept the default configurations for all steps," +
                "and ensure that all components are selected for" +
                "installation.\n" +
                "3. After the install is complete, the setup wizard" +
                "downloads and installs additional components," +
                "including the Android SDK. Be patient, because this" +
                "process might take some time, depending on your" +
                "internet speed.\n" +
                "4. When the installation completes, Android Studio" +
                "starts, and you are ready to create your first project.\n";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Environment Setup");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView textView1 = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text2);
        TextView textView3 = findViewById(R.id.text8);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = findViewById(R.id.text9);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        textView1.setText(text);
        textView2.setText(text1);
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