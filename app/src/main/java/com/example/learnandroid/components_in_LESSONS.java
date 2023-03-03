package com.example.learnandroid;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class components_in_LESSONS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components_in_lessons);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Components");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        String t1 = "<b>The android application components or core building blocks</b> are the basic building blocks of an android application and these components will allow system or user to access our app. <br>" +
                "<br>" +
                "The followings are the basic core building blocks of android application components that can be used in Android application: <br>" +
                "<br>" +
                "•Activities<br>" +
                "•Intents<br>" +
                "•Services<br>" +
                "•Broadcast Receivers<br>" +
                "•Content Providers<br><br><br>" +
                "<b>Activities</b><br><br>" +
                "<b>Activity</b> represents a single screen with a user interface (UI) and it is act as a entry point for users to interact with app.  <br>" +
                "<br>" +
                "<b>For example</b>, a contacts app which has multiple activities like displaying a list of contacts, add new contact and another activity shows to search for the contacts in the contacts list of an app. All activities of a contacts app are independent to each other but these activities work together to provide a better user experience.<br>" +
                "<br>" +
                "<b>Intents</b><br><br>" +
                "An <b>intent</b> is a messaging object which is used to request an action from another component. <br>" +
                "<br>" +
                "It is mainly used to perform following things: <br>" +
                "<br>" +
                "•Start an Activity<br>" +
                "•Start a Service<br>" +
                "•Deliver a Broadcast<br>" +
                "•Display a Webpage etc.<br><br>" +
                "There are two types of intents in android as follows:<br>" +
                "<br>" +
                "1.Implicit Intents<br>" +
                "2.Explicit Intents<br><br>" +
                "<b>Services</b><br><br>" +
                "<b>Service</b> is a component which is a background process to perform long running operations based on our requirements. <b>Service</b> have not any user interface(UI) and it can run the apps in background for a long time like play music in background when the user in different app. <br>" +
                "<br>" +
                "We have two types of services available in android as follows: <br>" +
                "<br>" +
                "•Local Services<br>" +
                "•Remote Services<br><br>" +
                "<b>Local service</b> is a service which is accessed from within the application whereas <b>Remote service</b> is a service which is accessed remotely from other applications running on the same device.<br>" +
                "<br>" +
                "<b>Broadcast Receivers</b><br><br>" +
                "<b>Broadcast Receivers</b> is a component which allows a system to deliver events to the app like listening for Incoming call, sms, sending a low battery message to the app etc. The apps can also initiate broadcasts to let other apps know that required data available in a device to use it.It is used to handle communication between Android operating system and applications. <br>" +
                "<br>" +
                "Generally, we use Intents to deliver broadcast events to other applications and Broadcast Receivers use status bar notifications to let user know that broadcast event occurs. <br>" +
                "<br>" +
                "<b>Content Providers</b><br><br>" +
                "<b>Content Providers</b> are used to exchange the data between the applications based on the requests. The Content Providers can share the app data that store in the file system, SQLite Database, on the web or any other storage location that our application can access. <br>" +
                "<br>" +
                "By using Content Providers, other applications can query or modify the data of our application based on the permissions provided by content providers. For example, android provides a Content Provider (ContactsContract.Data) to manage contacts information, by using proper permissions any app can query the content provider to perform 'read' and 'write' operations on contacts information.";

        TextView textView1 = (TextView) findViewById(R.id.text1);


        textView1.setText(Html.fromHtml(t1));
//        textView1.setText(spannableString);

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