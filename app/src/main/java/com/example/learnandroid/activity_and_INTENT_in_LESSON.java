package com.example.learnandroid;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class activity_and_INTENT_in_LESSON extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and_intent_in_lesson);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Activity & Intents");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String t1="One of the core building block of Android app development is an Activity. It is represents a single screen with user interface(UI). ContextThemeWrapper is the super class of an activity. Activity is the main entry point of an Android app just like main method of a program written in Java or C++. An activity interacts with user so it creates a window to place UI elements. An Android application can contain several activities means many different screens represents that can interact with each other and independently with the user.<br> " +
                "<br> " +
                "<br> " +
                "<b>Android Activity Lifecycle</b><br> " +
                "<br> " +
                "Android activity has its own life cycle during its life it can perform many operations. Android activities are stored and managed in a stack called activity stack. New activity comes at the top of stack and becomes running, while previous remains below to the new activity in stack. When the top activity in the stack exits, the lower to the top becomes active.<br> " +
                "<br> " +
                "<b>States of Android activity</b><br> " +
                "An activity has four states-<br> " +
                "<br> " +
                "<b>Running:</b> An activity is in running state whenan acitivity at the top of the stack is in running or active state means it is at the foreground of the screen.<br> " +
                "<br> " +
                "<b>Paused:</b> An activity is paused state when an activity is alive but it is not focused in the paused state. (This is as a pop-up message shown on the activity).<br> " +
                "<br> " +
                "<b>Resumed:</b> An activity is resumed state When a paused activity becomes active it is refreshed and started again.<br> " +
                "<b><br>Stopped:</b> An activity is stopped state when an activity is no longer visible on the screen to the user is in the stopped state.<br> " +
                "<br> " +
                "<b>Android activity call back methods</b><br> " +
                "<br> " +
                "An activity implements following call back methods-<br> " +
                "<br> " +
                "<b>OnCreate() —</b> This is first call back method of an android activity. It is called when an activity is created. This is where all you set all stuffs like Button, Views,     Checkbox, TextView etc.<br> " +
                "<br> " +
                "<b>OnStart() — </b>It is second call back nethod. It is called when the activity is visible on the screen to the user.<br> " +
                "<br> " +
                "<b>OnResume() —</b> This is called after OnStart() method if the activity comes to foreground. This is when user starts interacting with the activity.<br> " +
                "<br> " +
                "<b>OnPause() — </b>This is followed by OnResume(). This method is called when a previous activity is resumed.<br> " +
                "<br> " +
                "<b>OnStop() —</b> It is called when another activity is resumed then this activity is no longer visible to user. It becomes hidden.<br> " +
                "<b><br>OnDestroy() — </b>This is the final call back method when the activity is finished.<br> " +
                "<br> " +
                "<b>OnRestart()—</b>It is called when an activity restarts.<br> " +
                "<br> " +
                "The following diagram shows complete life cycle of an Android activity.";
        String t2="<b>Android Intent</b> is the message that is passed between components such as activities, content providers, broadcast receivers, services etc.<br> " +
                "<br> " +
                "It is generally used with <b>startActivity()</b> method to invoke activity, broadcast receivers etc.<br> " +
                "<br> " +
                "The <b>dictionary meaning</b> of intent is intention or purpose. So, it can be described as the intention to do action.<br> " +
                "<br> " +
                "The LabeledIntent is the subclass of android.content.Intent class.<br> " +
                "<br> " +
                "Android intents are mainly used to:<br> " +
                "<br> " +
                "    •Start the service<br> " +
                "<br>    •Launch an activity<br> " +
                "<br>    •Display a web page<br> " +
                "<br>    •Display a list of contacts<br> " +
                "<br>    •Broadcast a message<br> " +
                "<br>    •Dial a phone call etc.<br> " +
                "<br>    <b>Types of Android Intents</b><br> " +
                "<br>There are two types of intents in android: implicit and explicit.<br> " +
                "<br> " +
                "<b>1) Implicit Intent</b><br> " +
                "<br>Implicit Intent doesn't specifiy the component. In such case, intent provides information of available components provided by the system that is to be invoked.<br> " +
                "<br> " +
                "For example, you may write the following code to view the webpage.<br> " +
                "<br> <br>" +
                "<i>Intent intent=new Intent(Intent.ACTION_VIEW);</i>  <br> " +
                "<i>intent.setData(Uri.parse(\"http://www.javatpoint.com\")); </i> <br> " +
                "<i>startActivity(intent); </i> <br><br> " +
                "<br><b>2) Explicit Intent</b><br> " +
                "<br>Explicit Intent specifies the component. In such case, intent provides the external class to be invoked.<br> " +
                "<br><br> " +
                "<i>Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  </i><br> " +
                "<i>startActivity(i); </i> <br> ";
        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        textView1.setText(Html.fromHtml(t1));
        textView2.setText(Html.fromHtml(t2));

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