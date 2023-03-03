package com.example.learnandroid;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class run_on_REAL_DEVICE extends AppCompatActivity {

    String t1="On Android 4.1 and lower, the Developer options" +
            "screen is available by default. On Android 4.2 and" +
            "higher, you must enable this screen. To enable" +
            "developer options, tap the Build Number option 7" +
            "times. You can find this option in one of the following" +
            "locations, depending on your Android version:\n\n\n" +
           "• Android 9 (API level 28) and higher: Settings >About Phone > Build" +
            "Number\n" +
            "• Android 8.0.0 (APl level 26) and Android 8.1.0 (API" +
            "level 26): Settings > System > About Phone > Build" +
            "Number\n" +
            "• Android 7.1 (API level 25) and lower: Settings >" +
            "About Phone > Build Number\n\n" +
            "Before you can use the debugger and other tools, you" +
            "need to enable USB debugging, which allows Android" +
            "Studio and other SDK tools to recognize your device" +
            "when connected via USB. To enable USB debugging," +
            " toggle the USB debugging option in the Developer" +
            "Options menu. You can find this option in one of" +
            "the following locations, depending on your Android" +
            "version:\n\n\n\n" +
            "• Android 9 (API level 28) and higher:  Settings >" +
            "System > Advanced > Developer Options > USB" +
            "debugging\n" +
            "• Android 8.0.0 (API level 26) and Android 8.1.0 (API" +
            "level 26):  Settings > System > Developer Options >" +
            "USB debugging\n" +
            "• Android 7.1 (API Ilevel 25) and lower:  Settings  " +
            "Developer Options > USB debugging\n";
    String t2="• Chrome 0S: No additional configuration required.\n" +
            "• macoS: No additional configuration required.\n" +
            "• Ubuntu Linux: There are two things that need to" +
            "be set up correctly: each user that wants to use adb" +
            "needs to be in the plugdev group, and the system" +
            "needs to have udev rules installed that cover the" +
            "device.\n\n" +
            "plugdev group: If you see an error message that says" +
            "you're not in the plugdev group, you'll need to add" +
            "yourself to the plugdev group:\n\n" +
            "sudo usermod -aG plugdev $LOGNAME\n\n" +
            "Note that groups only get updated on login, so you'll" +
            "need to log out for this change to take effect. When" +
            "you log back in, you can use id to check that you're" +
            "now in the plugdev group.\n\n" +
            "udev rules:The android-sdk-platform-tools-common" +
            "package contains a community-maintained default set" +
            "of udev rules for Android devices. To install:\n\n" +
            "apt-get install android-sdk-platform-tools-common\n\n" +
            "• Windows: Install a USB driver for ADB.\n" +
            "You can download the Google USB Driver for Windows" +
            "using Android SDK Manager:\n\n\n" +
            "1. In Android Studio, click Tools > SDK Manager.\n" +
            "2. Click the SDK Tools tab.\n3. Select Google USB Driver and click OK.\n";
    String t3="4. Proceed to install the package. When" +
            "done, the driver files are downloaded into the" +
            "android-sdk\\extras \\google\\usb-driver directory.\n\n" +
            "Using the SDK Manager helps you keep the driver up" +
            "to date by notifying you when your current driver is out" +
            "of date.\n\n";
String t4="When you are set up and plugged in over USB, you can" +
        "click\n" +
        "Run\n" +
        "in Android Studio to build and run your app on the\n" +
        "device.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_on_real_device);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Debug on Real Device");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView textView1 = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text2);
        TextView textView3 = findViewById(R.id.text3);
        TextView textView4 = findViewById(R.id.text4);
        textView1.setText(t1);
        textView2.setText(t2);
        textView3.setText(t3);
        textView4.setText(t4);
        TextView textView5 = findViewById(R.id.text111);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());

//        ImageView imageView = findViewById(R.id.image1);
//        Glide.with(this)
//                .load("https://developer.android.com/static/studio/images/run/sdk-manager-google-usb-driver.png")
//                .into(imageView);
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