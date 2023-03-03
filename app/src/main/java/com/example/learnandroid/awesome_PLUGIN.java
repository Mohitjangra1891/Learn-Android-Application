package com.example.learnandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class awesome_PLUGIN extends AppCompatActivity {
    String []n={"CodeGlance","Rainbow Brackets"
            ,"ADB Idea","ADB WIFI"
            ,"Material UI Theme","Material Design Icon Generator"
            ,"SQLScout","FCM Push Sender"
            ,"SQLDelight","Codota"
            ,"Name That Color","String Manipulation"
            ,"Nyan Progress","Android Drawable Importer"
            ,"Android DPI Calculator"};


    int []i={R.drawable.codeglance, R.drawable.rainbow, R.drawable.adbidea, R.drawable.adbwifi
            ,R.drawable.materialthemeui,R.drawable.icon_generator,R.drawable.sql_scout
            ,R.drawable.fms_push_sender,R.drawable.sq,R.drawable.codota,R.drawable.name_that_color
            ,R.drawable.stringmanipulation,R.drawable.nyan_progress,R.drawable.drawable_importer
            ,R.drawable.dpicalc
    };

    String []d={"Similar to Sublime or Xcode, this plugin embeds a code minimap in your editor. The scrollbar gets a little bigger too."
            ,"This plugin adds lovely rainbow colors to your code for round, square, and curly braces."
            ,"ADB Idea provides single click shortcut commands for start, uninstall, kill the app, revoke permissions, and to clear application data."
            ,"Simply install the ADB Wifi plugin, ensure your host machine and phone are connected on the same network, and go to Tools → android → ADB WIFI → ADB USB to WIFI to start the connection — now you can run apps without the need for a USB connection."
            ," This plugin has an impressive palette of themes that offer beautiful color schemes with support for a vast majority of languages, along with material icons, paddings, and a bunch of customizations."
            ,"This plugin helps you add material design icons in your android application. Importing assets, specify color, size, and density is incredibly easy."
            ,"Here’s a first-class SQLite support for Android Studio and IntelliJ IDEA that lets you manage databases in real-time. This makes it easy to execute SQL queries live for updating tables while debugging your apps.It also has support for a room persistence library as well."
            ,"By setting the Firebase Registration ID, we can directly send push notifications from Android studio using this plugin. The plugin also has an ability to automatically search the Firebase Registration ID token in-app shared preferences using a Stetho dumpapp plugin."
            ,"SQLDelight is a well known Kotlin multiplatform database library. It generates Kotlin APIs from SQL, taking care of creating the database from the schema itself."
            ,"Codota is an AI-based code completion plugin that uses machine learning to suggest code-completions from millions of code snippets (Java, Javascript, Python, etc.) based on your context."
            ,"Forget about naming colors like ‘red1’, ‘red4’, ‘redorpink’. This little gem will propose a closest matching color name or generate one if you're really creative with Hex/RGB values."
            ,"Just a bunch of handy string helpers for text manipulation. Simply press Alt-M and save some precious time."
            ,"Now, this is a neat plugin! It shows a lovely Nyan Cat instead of a boring progress bar. I only wish it could play “Nyanyanyanyanyanyanya!” song while compiling…"
            ,"Another powerhouse for adding images to your project. You can easily import an icon from Material Icons or Android Icons, set a format, size, color and multiple dimensions. You can also import a regular image and automatically resize it for target densities."
            ,"As an Android dev sometimes you just have to calculate some sizes for different densities. I know, it’s crazy but this is just part of the job."
    };

    String []l={"","https://plugins.jetbrains.com/plugin/10080-rainbow-brackets/"
            ,"https://plugins.jetbrains.com/plugin/7380-adb-idea/","https://plugins.jetbrains.com/plugin/7380-adb-idea/"
            ,"https://plugins.jetbrains.com/plugin/8006-material-theme-ui","https://plugins.jetbrains.com/plugin/7647-android-material-design-icon-generator"
            ,"https://plugins.jetbrains.com/plugin/8322-sqlscout-sqlite-support-","https://plugins.jetbrains.com/plugin/12104-fcm-push-sender"
            ,"https://plugins.jetbrains.com/plugin/8191-sqldelight"
            ,"https://plugins.jetbrains.com/plugin/7638-codota-ai-autocomplete-for-java-and-javascript"
                ,"https://plugins.jetbrains.com/plugin/10422-name-that-color"
            ,"https://plugins.jetbrains.com/plugin/2162-string-manipulation/","https://plugins.jetbrains.com/plugin/8575-nyan-progress-bar"
            ,"https://plugins.jetbrains.com/plugin/7658-android-drawable-importer/","https://plugins.jetbrains.com/plugin/7832-android-dpi-calculator/"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awesome_plugin);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Useful Plugins");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listView = findViewById(R.id.listview);
        awesome_PLUGIN.ListViewAdapter adapter = new awesome_PLUGIN.ListViewAdapter(getApplicationContext(), n,i,d,l);
        listView.setAdapter(adapter);
    }


    class ListViewAdapter extends ArrayAdapter {

        String[] p_name;
        String[] p_link;
        String[] p_des;
        int[] p_image;

        public ListViewAdapter(Context context, String[] names, int[] images,String[] descrip,String[] link) {
            super(context, R.layout.cardview_for_awesome_plugin, R.id.plugin_name, names);
            this.p_name = names;
            this.p_link = link;
            this.p_des = descrip;
            this.p_image = images;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.cardview_for_awesome_plugin, parent, false);

            ImageView p_img = row.findViewById(R.id.plugin_image);
            TextView p_text = row.findViewById(R.id.plugin_name);
            TextView p_d = row.findViewById(R.id.plugin_description);
            TextView p_lk = row.findViewById(R.id.plugin_link);
            p_text.setText(p_name[position]);
            p_lk.setText(p_link[position]);
            p_d.setText(p_des[position]);
            p_img.setImageResource((p_image[position]));
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