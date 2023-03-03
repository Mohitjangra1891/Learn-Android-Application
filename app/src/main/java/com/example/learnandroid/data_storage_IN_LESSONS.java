package com.example.learnandroid;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class data_storage_IN_LESSONS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_storage_in_lessons);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Data Storage");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String t1="Android provides several options for you to save persistent app data. The solution you choose depends on your specific needs, such as whether the data should be private to your application or accessible to other applications and how much space your data requires.<br>" +
                "<br>" +
                "There are basically 5 different ways to store data in android app are the following:<br>" +
                "<br>" +
                "<b>1. Shared Preferences</b><br>" +
                "     It stores private primitive data in key-value     pairs.<br>" +
                "<b>2. Internal Storage</b><br>" +
                "     It stores private data on the device memory.<br>" +
                "<b>3. External Storage</b><br>" +
                "     It stores public data on the shared external storage.<br>" +
                "<b>4. SQLite Databases</b><br>" +
                "     It stores structured data in a private database.<br>" +
                "<b>5. Network Connection</b><br>" +
                "     It stores data on the web with your own     network server.<br><br>" +
                "<b>1. Shared Preferences</b><br>" +
                "<br>" +
                "The SharedPreferences is a class that provides a general framework which allows you to save and retrieve persistent key-value pairs of primitive data types. You can use SharedPreferences to save any primitive data types: booleans, floats, ints, longs, and strings. This data will persist across user sessions (even if your android application is killed).<br>" +
                "<br>" +
                "<b>User Preferences</b><br><br>" +
                "Shared preferences are not strictly for saving \"user preferences\", such as what ringtone a user has chosen. If you are interested in creating user preferences for your app see PreferenceActivity which provides an Activity framework for you to create user preferences, which will be automatically persisted.<br>" +
                "<br>" +
                "To get a SharedPreferences object for your android application, use one of two methods:<br>" +
                "<br>" +
                "    <b>•getSharedPreferences()</b> - Using this method if you need multiple preferences files identified by name, which you specify with the first parameter.<br>" +
                "    <b>•getPreferences()</b> – Using this method if you need only one preferences file for your Activity in your application. Because this will be the only preferences file for your Activity, you don't supply a name.<br>" +
                "<br>To write values:<br>" +
                "<br>" +
                "  <b>1.</b>Call edit() to get a <br>SharedPreferences.Editor.<br>" +
                "  <b>2.</b>Add values with methods such as putBoolean() method and putString() method.<br>" +
                "  <b>3.</b>Commit the new values with commit().<br><br>" +
                "To read values, <br>use SharedPreferences() methods such as getBoolean() method and getString() method.<br>" +
                "<br>" +
                "<b>2. Internal Storage</b><br><br>" +
                "In internal storage, you can save files directly on the device's internal storage. By default, all the files of your application saved to the internal storage are private to your application and other applications can't access them (nor can the user). When the user uninstalls your android application, these files are removed automatically from youe internal storage.<br>" +
                "<br>" +
                "To create and write a private file to the internal storage:-<br>" +
                "<br>" +
                "  <b>1.</b>Call openFileOutput() with the name of the file and the operating mode. This returns a FileOutputStream.<br>" +
                "  <b>2.</b>Write to the file with write().<br>" +
                "  <b>3.</b>Close the stream with close().<br><br>" +
                "<b>Modes of Internal Storage</b><br><br>" +
                "<b>MODE_PRIVATE —</b> In private mode, the data stored earlier is always overridden by the current data i.e every time you try to commit a new write to a file which removes or override the previous content.<br>" +
                "<b>MODE_APPEND — </b>In this mode, the data is append to the existing content i.e keep adding data.<br>" +
                "<br>" +
                "<b>3. External Storage</b><br><br>" +
                "In android External storage such as SD card can also store application data, there is no security enforced upon files you save to the external storage.This can be a removable storage media (such as an SD card). Files saved to the external storage are world readable and can be modified by the user when they enable USB mass storage to transfer files on a computer.<br>" +
                "<br>" +
                "There are two types of External Storage:<br>" +
                "<br>" +
                "    <b>•Primary External Storage:</b> In built shared storage which is accessible by the user by plugging in a USB cable and mounting it as a drive on a host computer. Example: When we can say Nexus 5 32 GB.<br>" +
                "    <b>•Secondary External Storage:</b> It is removable storage. Example: SD Card.<br>" +
                "<br>I<b>n Android Methods to Store Data:</b><br>" +
                "<br>" +
                "    <b>•getExternalStorageDirectory() – </b>It is older way to access external storage in API Level less than 7. It is absolute now and not recommended. It directly get the reference to the root directory of your external storage.<br>" +
                "    <b>•getExternalFilesDir(String type) – </b>It is recommended way to enable us to create private files specific to android app and files are removed as android app is uninstalled. Example: app private data.<br>" +
                "    <b>•getExternalStoragePublicDirectory()-</b> This is current recommended way that enable us to keep files public and are not deleted with the android app uninstallation. Example: images clicked by the camera exists even we uninstall the camera app.<br>" +
                "<br><b>4. SQLite Databases</b><br><br>" +
                "In android, SQLite is a Structure query base database, open source, light weight, no network access and standalone database. It supports embedded relational database features.Whenever an application needs to store large amount of data then using SQLite database is more preferable than other repository system like SharedPreferences or saving data in files.<br>" +
                "<br>" +
                "To create a new SQLite database is to create a subclass of <b>SQLiteOpenHelper</b> and override the <b>onCreate()</b> method, in which you can execute a SQLite command to create tables in the SQLite database.Then get an instance of your <b>SQLiteOpenHelper</b> implementation using the constructor you have defined. To write and to read from the database, call <b>getWritableDatabase()</b> and <b>getReadableDatabase()</b> respectively. These both return a <b>SQLiteDatabase</b> object that represents the database and provides methods for SQLite operations.<br>" +
                "<br>" +
                "We do recommend including an auto increment value key field that can be used as a unique ID to quickly find a record from the database. This is not required for private data, but if you implement a content provider, you must include a unique ID using the BaseColumns.ID constant.<br>" +
                "<br>" +
                "You can execute SQLite queries using the SQLiteDatabaseQuery() methods, which accept various query parameters, such as the table to query, the projection, selection, columns, grouping, and others. For complex queries, such as those that require column aliases, you should use SQLiteQueryBuilder, which provides several convienent methods for building queries.<br>" +
                "<br>" +
                "In SQLite every query will return a Cursor that points to all the rows found by the query. The Cursor is always the mechanism with which you can navigate results from a database query and read rows and columns.<br>" +
                "<br>" +
                "<b>5. Using a Network Connection</b><br><br>" +
                "You can use the network (when it is available) to store and retrieve data on your own web-based services. To do network operations, use classes in the following packages:<br>" +
                "<br>" +
                " &nbsp;&nbsp;&nbsp;&nbsp;   •java.net.*<br>" +
                "   &nbsp;&nbsp;&nbsp;&nbsp; •android.net.*";

        TextView textView1 = (TextView) findViewById(R.id.text1);
      
        textView1.setText(Html.fromHtml(t1));



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