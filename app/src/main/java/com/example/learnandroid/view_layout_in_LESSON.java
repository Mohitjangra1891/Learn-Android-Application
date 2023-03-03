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

public class view_layout_in_LESSON extends AppCompatActivity {
    String t1 = "The Ul consists of a hierarchy of objects called " +
            "views - every element of the screen is a view. The " +
            "View class represents the basic building block for " +
            "all Ul components, and the base class for classes " +
            "that provide interactive UI components such as " +
            "buttons, checkboxes, and text entry fields.";
    String t2 = "Views can be grouped together inside a view " +
            "group (ViewGroup), which acts as a container of " +
            "views. The relationship is parent-child, in which " +
            "the parent is view group, and the child is a view or " +
            "view group within the group. The following are " +
            "common view groups: \n\n" +
            "•ScrollView: \n" +
            "A group that contains one other child " +
            "enables scrolling the child view.\n\n " +
            "•RecyclerView:\n " +
            "A group that contains a list of other views or view " +
            "groups and enables scrolling them by adding and " +
            "removing views dynamically from the screen.";
    String t3 = "The views for a screen are organized in a " +
            "hierarchy. At the root of this hierarchy is a " +
            "ViewGroup that contains the layout of the entire " +
            "Screen.\n\n" +
            "• LinearLayout:\n" +
            "Layout results in a group of child views positioned " +
            "and aligned horizontally or vertically. \n\n" +
            "•RelativeLayout: \n" +
            "A group of child views in which each view is " +
            "positioned and aligned relative to other views " +
            "within the view group. In other Words, the " +
            "positions of the child views can be described in " +
            "relation to each other or to the parent view group. \n\n" +
            "•ConstraintLayout: \n" +
            "A group of child views using anchor points, edges, " +
            "and guidelines to control how views are " +
            "positioned relative to other elements in the layout. " +
            "ConstraintLayout was designed to make it easy to " +
            "frag and drop views in the layout editor. \n\n" +
            "TableLayout: \n" +
            "Layout arranges a group of child views into rows " +
            "and columns. \n\n" +
            "•FramesLayout:\n" +
            "FrameLayout is designed to block out an area on " +
            "the screen to display one view. Child views are " +
            "drawn in a stack, with the most recently added " +
            "child on top. The size of the FrameLayout is the " +
            "size of its largest child view. \n\n" +
            "•GridLayout: \n" +
            "Layout places its child screens in a rectangular " +
            "grid that can be scrolled.";
    String t4 = "Keeping values such as strings and colors in " +
            "separate resource files makes it easier to manage " +
            "them, especially if you use them more than once " +
            "in your layouts. For example, it is essential to keep " +
            "strings in a separate resource file for translating " +
            "and localizing your app, so that you can create a " +
            "string resource file for each language without " +
            "changing your code. Resource file for images, " +
            "colors, dimensions, and other attributes are handy " +
            "for developing an app for different device screen " +
            "sizes and orientations. \n\n" +
            "•Strings: \n" +
            "The strings.xml file is used to store the string " +
            "values to be used in your app. \n\n" +
            "•Colors: \n" +
            "The colors.xml file is used to define and store the " +
            "color values to be used in the app. \n\n" +
            "•Dimensions: \n" +
            "The Dimens.xml file is used to store the " +
            "dimension values to be used in the app for " +
            "padding, margins, size etc. for different views. \n\n" +
            "•Styles: \n" +
            "A style is a resource that specifies common " +
            "attributes such as height, padding, font color, " +
            "background color. Styles are meant for attributes " +
            "that modify the look of the view.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_layout_in_lesson);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("View,Layout & Resources");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        TextView textView3 = (TextView) findViewById(R.id.text3);
        TextView textView4 = (TextView) findViewById(R.id.text4);


        SpannableString spannableString2 = new SpannableString(t2);
        SpannableString spannableString3 = new SpannableString(t3);
        SpannableString spannableString4 = new SpannableString(t4);

        int startIndex = t2.indexOf("ScrollView:");
        int endIndex = startIndex + "ScrollView:".length();

        int startIndex1 = t2.indexOf("RecyclerView:");
        int endIndex1 = startIndex1 + "RecyclerView:".length();

        int startIndex2 = t3.indexOf("LinearLayout:");
        int endIndex2 = startIndex2 + "LinearLayout:".length();

        int startIndex4 = t3.indexOf("RelativeLayout:");
        int endIndex4 = startIndex4 + "RelativeLayout:".length();

        int startIndex5 = t3.indexOf("ConstraintLayout:");
        int endIndex5 = startIndex5 + "ConstraintLayout:".length();

        int startIndex6 = t3.indexOf("TableLayout:");
        int endIndex6 = startIndex6 + "TableLayout:".length();

        int startIndex7 = t3.indexOf("FramesLayout:");
        int endIndex7 = startIndex7 + "FramesLayout:".length();

        int startIndex8 = t3.indexOf("GridLayout:");
        int endIndex8 = startIndex8 + "GridLayout:".length();

        int startIndex9 = t4.indexOf("Strings:");
        int endIndex9 = startIndex9 + "Strings:".length();

        int startIndex10 = t4.indexOf("Colors:");
        int endIndex10 = startIndex10 + "Colors:".length();

        int startIndex11 = t4.indexOf("Dimensions:");
        int endIndex11 = startIndex11 + "Dimensions:".length();

        int startIndex12 = t4.indexOf("Styles:");
        int endIndex12 = startIndex12 + "Styles:".length();

        StyleSpan styleSpan1 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan2 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan3 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan4 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan5 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan6 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan7 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan8 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan9 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan10 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan11 = new StyleSpan(Typeface.BOLD);
        StyleSpan styleSpan12 = new StyleSpan(Typeface.BOLD);

        spannableString2.setSpan(styleSpan1, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString2.setSpan(styleSpan2, startIndex1, endIndex1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(styleSpan3, startIndex2, endIndex2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(styleSpan4, startIndex4, endIndex4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(styleSpan5, startIndex5, endIndex5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(styleSpan6, startIndex6, endIndex6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(styleSpan7, startIndex7, endIndex7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString3.setSpan(styleSpan8, startIndex8, endIndex8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString4.setSpan(styleSpan9, startIndex9, endIndex9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString4.setSpan(styleSpan10, startIndex10, endIndex10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString4.setSpan(styleSpan11, startIndex11, endIndex11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString4.setSpan(styleSpan12, startIndex12, endIndex12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        textView1.setText(t1);
        textView2.setText(spannableString2);
        textView3.setText(spannableString3);
        textView4.setText(spannableString4);
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