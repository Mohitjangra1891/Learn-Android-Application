package com.example.learnandroid;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class project_STRUCTURE extends AppCompatActivity {
        String t1="AndroidManifest.xml:\n\n" +
                "This is the Android definition file. It contains " +
                "information about the Android application such " +
                "as minimum Android version; permission to " +
                "access Android device capabilities such as " +
                "internet access permission, ability to use phone " +
                "permission, etc.\n\nJava:\n\n" +
                "Contains the java code files. " +
                "programming languages like Java mean that we " +
                "can write these instructions in an abstract " +
                "manner using words and symbols, and the " +
                "computer will take care of translating these " +
                "High level"+"computer will take care of translating these " +
                "instructions that we can understand all the way " +
                "down to electrical impulses that the processor " +
                "can understand.\n\n" +
                "Kotlin:\n\n" +
                "Kotlin is a great fit for developing Android " +
                "applications, bringing all of the advantages of a " +
                "modern language to the Android platform without " +
                "introducing any new restrictions. Kotlin is fully " +
                "compatible with JDK 6, ensuring that Kotlin " +
                "applications can run on older Android devices " +
                "with no issues. The Kotlin tooling is fully " +
                "supported in Android Studio and compatible with " +
                "the Android build system.\n\n" +
                "Res:\n\n" +
                "Here we can store resource files such as pictures, " +
                "XML files for defining layouts, and so forth. Within " +
                "this folder there are additional folders such as " +
                "Drawable, Layout, and Values.\n\n" +
                "Drawable:\n\n" +
                "For images and icons.\n\n" +
                "Layout:\n\n" +
                "For layout resource files.\n\n" +
                "Menu:\n\n" +
                "For menu items.\n\n" +
                "Mipmap: \n\n" +
                "For pre-calculated, optimized collections of app " +
                "icons used by the Launcher.\n\n" +
                "Values:\n\n" +
                "For colors, dimensions,strings and styles.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_structure);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Intro");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        TextView textView1 = findViewById(R.id.text1);

        SpannableString spannableString = new SpannableString(t1);

        int startIndex = t1.indexOf("AndroidManifest.xml:");
        int endIndex = startIndex + "AndroidManifest.xml:".length();

        int startIndex1 = t1.indexOf("Java:");
        int endIndex1 = startIndex1 + "Java:".length();

        int startIndex2 = t1.indexOf("Kotlin:");
        int endIndex2 = startIndex2 + "Kotlin:".length();

        int startIndex4 = t1.indexOf("Res:");
        int endIndex4 = startIndex4 + "Res:".length();

        int startIndex5 = t1.indexOf("Drawable:");
        int endIndex5 = startIndex5 + "Drawable:".length();

        int startIndex6 = t1.indexOf("Layout:");
        int endIndex6 = startIndex6 + "Layout:".length();

        int startIndex7 = t1.indexOf("Menu:");
        int endIndex7 = startIndex7 + "Menu:".length();

        int startIndex8 = t1.indexOf("Mipmap:");
        int endIndex8 = startIndex8 + "Mipmap:".length();

        int startIndex9 = t1.indexOf("Values:");
        int endIndex9 = startIndex9 + "Values:".length();
        StyleSpan styleSpan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan2 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan3 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan4 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan5 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan6 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan7 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan8 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan9 = new StyleSpan(Typeface.BOLD);

        spannableString.setSpan(styleSpan1, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan2, startIndex1, endIndex1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan3, startIndex2, endIndex2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan4, startIndex4, endIndex4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan5, startIndex5, endIndex5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan6, startIndex6, endIndex6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan7, startIndex7, endIndex7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan8, startIndex8, endIndex8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan9, startIndex9, endIndex9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView1.setText(spannableString);
//            textView1.setText(t1);

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
