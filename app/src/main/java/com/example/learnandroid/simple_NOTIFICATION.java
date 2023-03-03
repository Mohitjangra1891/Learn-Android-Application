package com.example.learnandroid;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class simple_NOTIFICATION extends AppCompatActivity {
    private final String CHANNEL_ID = "Notification";
    private final int NOTIFICATION_ID = 01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_notification);

        String Javacode="import android.app.NotificationChannel;\n" +
                "import android.app.NotificationManager;\n" +
                "import android.graphics.BitmapFactory;\n" +
                "import android.os.Build;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.core.app.NotificationCompat;\n" +
                "import androidx.core.app.NotificationManagerCompat;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private final String CHANNEL_ID = \"Notification\";\n" +
                "\n" +
                "    private final int NOTIFICATION_ID = 01;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        Button button = findViewById(R.id.button);\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                createNotificationChannel();\n" +
                "\n" +
                "                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)\n" +
                "                        .setSmallIcon(R.drawable.notification)\n" +
                "                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.app_icon_foreground))\n" +
                "                        .setContentTitle(\"Android Studio Tutorials\")\n" +
                "                        .setContentText(\"This is a Simple Notification\")\n" +
                "                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);\n" +
                "\n" +
                "                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(getApplicationContext());\n" +
                "\n" +
                "                //notificationId is a unique int for each notification that you must define\n" +
                "                notificationManager.notify(NOTIFICATION_ID, builder.build());\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    //create notification channel for android 8.0 or higher to deliver notification\n" +
                "    private void createNotificationChannel() {\n" +
                "\n" +
                "        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {\n" +
                "\n" +
                "            CharSequence name = \"Notification\";\n" +
                "            String description = \"Simple Notification\";\n" +
                "            int importance = NotificationManager.IMPORTANCE_DEFAULT;\n" +
                "\n" +
                "            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, importance);\n" +
                "            notificationChannel.setDescription(description);\n" +
                "\n" +
                "            NotificationManager notificationManager = getSystemService(NotificationManager.class);\n" +
                "            notificationManager.createNotificationChannel(notificationChannel);\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Click Here\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.5\" />\n" +
                "\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>";

        String other = "<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "        </activity>";
        String other_heading = "Manifest";

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Simple Notification");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                createNotificationChannel();

                NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                        .setSmallIcon(R.drawable.notification)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.notification))
                        .setContentTitle("Android Studio Tutorials")
                        .setContentText("This is a Simple Notification")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(getApplicationContext());

                //notificationId is a unique int for each notification that you must define
                notificationManager.notify(NOTIFICATION_ID, builder.build());

            }
        });
    }
    //create notification channel for android 8.0 or higher to deliver notification
    private void createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            CharSequence name = "Notification";
            String description = "Inbox Style Notification";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, importance);
            notificationChannel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);

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