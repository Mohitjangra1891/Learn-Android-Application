package com.example.learnandroid;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class intents_AND_fragments_in_LESSONS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_and_fragments_in_lessons);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Fragments");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        String t1="An Android Fragment is a piece of an activity which enable more modular activity design. It will not be wrong if we can say that a fragment is a kind of sub-activity. In an Android Activity used for creating dynamic and flexible user interface(UI). An Android Fragment has its own life cycle but it always be embedded with an activity so that the android fragments life cycle is directly affected by the host activities life cycle and android fragments receives its own input events. In android application we can use multiple android fragments in a single activity of an application to create Multi-Pane user interface(UI) and also we can able to use a single fragment in multiple activities . Now, Fragment Manager is responsible for add or remove or replace fragments at run time in any where of an activity.when we add a fragment in an activity it lives in a ViewGroup in side the activities view hierarchy and fragment defines its own view layout by declaring the fragment in the activities layout file as a <fragment> element or from application code by adding it to an existing ViewGroup.<br>";

        String t2="There are some points about android fragments:<br>" +
                "<br>" +
                " <br>    •A fragment has its behaviour and its layout with its       lifecycle callbacks methods.<br>" +
                " <br>    •You can add or remove fragments in the activity.   When activity is running, which is in the resumed             lifecycle state.<br>" +
                "  <br>   •You can also combine multiple fragments in a       single activity to make a multi-pane user                    interface(UI).<br>" +
                "  <br>   •And it provides reusability of a fragment in multiple       activities.<br>" +
                "  <br>   •A fragment life cycle is very closely related to             the lifecycle of its host activity which means when       the activity is in the pause state, all the fragments    available in the activity will also stop.<br>" +
                "  <br>   •Fragments added to the Android API in Android       3.0 which API version 11 to support flexible user    interface(UI) on large screens devices.<br>" +
                "<br>Below are the subclasses of a Fragmnt Class-<br>" +
                "<br>" +
                "&nbsp;&nbsp; &nbsp;&nbsp;  •ListFragment<br>" +
                "&nbsp;&nbsp; &nbsp;&nbsp;  •DialogFragment<br>" +
                "&nbsp;&nbsp; &nbsp;&nbsp;  •WebViewFragment<br><br>" +
                "<b>ListFragment</b><br><br>" +
                "ListFragment is similar to ListActivity and contains a ListView by default. It purpose for displaying a list of items. We used ListFragment; see the Creating and managing fragments section for ListFragment.<br>" +
                "<br>" +
                "<b>DialogFragment</b><br><br>" +
                "A DialogFragment displays a dialog on top of its owner activity. We are create a fragment that has a Delete button. When the button is clicked, a DialogFragment dialog box will be displayed.<br>" +
                "<br>" +
                "<b>WebViewFragment</b><br><br>" +
                "<br>" +
                "WebView can also assist with common browsing metaphors, such as the list of visited URLs history to support backwards and forwards navigation. Still WebView comes with its own set of cons such as it's a much more expensive widget to use, in terms of like memory consumption than a TextView. The reason for memory increased is because WebView is powered by WebKit/Blink that are open source Web rendering engine to power content in browsers like Chrome.<br>" +
                "<br>" +
                "<b>Android Fragments Life Cycle</b><br><br>" +
                "The following are the Android Fragments Life Cycle";

        String t3="Below are the android fragments lifecycle calbacks-<br>" +
                "<br>" +
                "<b>onAttach()</b><br>" +
                "<br>" +
                "This method is called first even before onCreate() callback methods and after attaching fragment to the activity. if Android SDK Version(API Level<23) it takes an activity as a reference that will host the fragment else it takes Context as a reference. By using this reference we can obtain system services and initialize fragment interactive events etc.<br>" +
                "<br>" +
                "<b>onCreate()</b><br>" +
                "<br>" +
                "This method is called when creating the fragment and it takes Bundle as a reference which is used for initialize the necessary components and store its value that you want to retain when the fragment is paused or stopped state, then resumed.when the fragment is implemented for the first time in the activity Bundle object is null.<br>" +
                "<br>" +
                "<b>onCreateView()</b><br>" +
                "<br>" +
                "In this method when the fragment is added to an activity for the first time.you must return a view from this method that is the root of your fragment's layout. If the fragment does not provide a user interface(UI) the you can return null.<br>" +
                "<br>" +
                "<b>onActivityCreated()</b><br>" +
                "<br>" +
                "This method is called after Activity onCreate() callback has completed its execution. And this method is an indication for the activity has complete its execution before we try to access without any interruption and modify user interface(UI) elements of the activity.<br>" +
                "<br>" +
                "<b>onStart()</b><br>" +
                "<br>" +
                "This method is called once the android fragment gets visible in the activity after activity onStart() callback.<br>" +
                "<br>" +
                "<b>onResume()</b><br>" +
                "<br>" +
                "This method is called when the user interacting with the android fragments in the activity after activity onResume() callback.<br>" +
                "<br>" +
                "<b>If we are no longer being used a fragment, it goes through a reverse series of callbacks.</b><br>" +
                "<br>" +
                "<b>onPause()</b><br>" +
                "<br>" +
                "This method is called when the fragment is no longer being used to interact with the user either because its activity is being paused state or a fragment operation is modifying it in the activity.<br>" +
                "<br>" +
                "<b>onStop()</b><br>" +
                "<br>" +
                "This method is called when the fragment is no longer being used to interact with the user either because its activity is being stopped state or a fragment operation is modifying it in the activity.<br>" +
                "<br>" +
                "<b>onDestroyView()</b><br>" +
                "<br>" +
                "This method is called to allow the fragment to cleanup resources associated with its view in the activity.<br>" +
                "<br>" +
                "<b>onDestroy()</b><br>" +
                "<br>" +
                "This method is called to do final cleanup of the fragment's state.<br>" +
                "<br>" +
                "<b>onDetach()</b><br>" +
                "<br>" +
                "This method is called to the fragment no longer being associated with its activity.<br>" +
                "<br>" +
                "<b>Key Notes</b><br><br>" +
                "   •Normally, you should implement at least the following life cycle callbacks methods:-<br>" +
                "&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; onCreate()<br>" +
                "&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; onCreateView()<br>" +
                "&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; onPause()<br>" +
                "<br>" +
                "   •By the host activity we can save each Fragment Transaction to a Back Stack manged and the user allows to reverse a fragment transaction by this back stack.<br>" +
                " <br>  •In case if we have a method with the same name in both the activity and fragment during the creation phase the activity's method runs first and the fragment's method runs next.<br>" +
                "   <br>•<b>onSaveInstaceState():-</b><br>" +
                "This callback is called where you allowed to save some data about fragment events just before the app is paused state so that when the user comes back to the app they get the saved data. Here it takes Bundle reference so we can able to store data as (key,value) pairs.";

        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        TextView textView3 = (TextView) findViewById(R.id.text3);
        textView1.setText(Html.fromHtml(t1));
        textView2.setText(Html.fromHtml(t2));
        textView3.setText(Html.fromHtml(t3));

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