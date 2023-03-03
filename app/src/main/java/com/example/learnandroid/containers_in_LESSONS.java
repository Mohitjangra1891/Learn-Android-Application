package com.example.learnandroid;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class containers_in_LESSONS extends AppCompatActivity {
    String t1="Listview is a view group that displays a list of " +
            "scrollable items. The list items are automatically " +
            "inserted to the list using an Adapter that pulls " +
            "content from source such as an array or database " +
            "query and converts each item result into a view " +
            "that's placed into the list. A listView is a very " +
            "essential and basic element for UI Design. " +
            "ListView has further categories which are: \n\n" +
            "• Custom ListView: In a Custom ListView a Custom " +
            "ArrayAdapter class is build which binds the " +
            "content from a source to the layout design of your " +
            "choice for which you will have to create a layout " +
            "of your choice and the content will be placed " +
            "according to that layout according to your need.\n\n " +
            "•Expandable ListView: Expandable list view is used " +
            "to group list data by categories.It has the " +
            "capability of expanding and collapsing the groups " +
            "when user touches header. It differs from a " +
            "ListView by allowing two levels which are groups " +
            "that can be easily expanded and collapsed by " +
            "touching to view and their respective children " +
            "items.\n";
    String t2="\nGridView is a ViewGroup that displays items in a " +
            "two-dimensional, scrollable grid. The rid items are " +
            "inserted to " +
            "the " +
            "layout " +
            "using " +
            "automatically " +
            "ListAdapter\n\n.";
    String t3="A view that displays web pages. This class is the " +
            "basic upon which you can roll your own web " +
            "browser or simply display some online content " +
            "within your Activity. It uses the WebKit rendering " +
            "engine to display web pages and includes " +
            "methods to navigate forward and backward " +
            "through a history, zoom in and out, performs text " +
            "searches and more. In order for your Activity to " +
            "access the Internet and load web pages in a " +
            "WebView, you must add the INTERNET " +
            "permissions to your Android Manifest file:";
    String t4="A widget that provides a user interface for the " +
            "user to enter a search query and submit a request " +
            "to a search provider. Shows a list of query " +
            "suggestions or results, if available, and allows the " +
            "user to pick a suggestion or result to launch into. " +
            "When the SearchView is used in an ActionBar as " +
            "an action view for a collapsible menu item, it " +
            "needs to be set to iconified by default using " +
            "setlconified ByDefault(true). This is the default, so " +
            "nothing needs to be done. If you want the search " +
            "field " +
            "to " +
            "always be visible, " +
            "then " +
            "call"+ "seticonifiedByDefault(false).";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers_in_lessons);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Containers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


      ImageView imageView = findViewById(R.id.image1);
      ImageView imageView2 = findViewById(R.id.image2);
      ImageView imageView3 = findViewById(R.id.image3);
      ImageView imageView4 = findViewById(R.id.image4);
        // Adding the gif here using glide library
        Glide.with(this).load(R.drawable.list_example).into(imageView);
        Glide.with(this).load(R.drawable.gridvie_example).into(imageView2);
        Glide.with(this).load(R.drawable.webview_example).into(imageView3);
        Glide.with(this).load(R.drawable.search_example).into(imageView4);

        TextView   textView1 = (TextView) findViewById(R.id.text1);
        TextView   textView2 = (TextView) findViewById(R.id.text2);
        TextView   textView3 = (TextView) findViewById(R.id.text3);
        TextView   textView4 = (TextView) findViewById(R.id.text4);


        SpannableString spannableString = new SpannableString(t1);

        int startIndex = t1.indexOf("Custom ListView:");
        int endIndex = startIndex + "Custom ListView:".length();

        int startIndex1 = t1.indexOf("Expandable ListView:");
        int endIndex1 = startIndex1 + "Expandable ListView:".length();
        StyleSpan styleSpan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan2 = new StyleSpan(Typeface.BOLD);
        spannableString.setSpan(styleSpan1, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(styleSpan2, startIndex1, endIndex1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(spannableString);
        textView2.setText(t2);
        textView3.setText(t3);
        textView4.setText(t4);
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