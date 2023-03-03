package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class rating_Bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        String Javacode = "import android.widget.Button;\n" +
                "import android.widget.RatingBar;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "RatingBar ratingDemo;\n" +
                "Button ratingsubmitButton;\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\tratingDemo=(RatingBar)findViewById(R.id.ratingdemo);\n" +
                "\t\t\t\t\tratingsubmitButton=(Button)findViewById(R.id.ratingsubmitButton);\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\tratingsubmitButton.setOnClickListener(new View.OnClickListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\t\tpublic void onClick(View view) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tfloat rvalue=ratingDemo.getRating();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"Rating:-\"+rvalue,Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t});\n" +
                "\t\t\t\t}\n" +
                "    \n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t\t\t<RatingBar\n" +
                "\t\t\t\t\t\tandroid:id=\"@+id/ratingdemo\"\n" +
                "\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\t\tandroid:layout_marginTop=\"60dp\"\n" +
                "\t\t\t\t\t\tandroid:stepSize=\"0.25\"\n" +
                "\t\t\t\t\t\tandroid:numStars=\"5\"\n" +
                "\t\t\t\t\t\tandroid:rating=\"2.5\" />\n" +
                "\n" +
                "\t\t\t\t\t<Button\n" +
                "\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\tandroid:id=\"@+id/ratingsubmitButton\"\n" +
                "\t\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\t\tandroid:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\t\tandroid:padding=\"10dp\"\n" +
                "\t\t\t\t\t\tandroid:text=\"Submit\"\n" +
                "\t\t\t\t\t\tandroid:textColor=\"#fff\"\n" +
                "\t\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\t\tandroid:textStyle=\"bold\" />\n" +
                "\n" +
                "</LinearLayout>";

        String other = "<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "        </activity>";
        String other_heading = "Manifest";        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("RatingBar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode",xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        TextView textView = findViewById(R.id.textView);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                textView.setText("Rating value :  " + rating);
            }
        });
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