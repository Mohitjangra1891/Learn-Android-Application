package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class image_SWITCHER extends AppCompatActivity {

    private ImageSwitcher mImageSwitcher;
    private int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);

        String Javacode="import android.app.ActionBar;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.ImageSwitcher;\n" +
                "import android.widget.ImageView;\n" +
                "import android.widget.TextView;\n" +
                "import android.widget.ViewSwitcher;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private ImageSwitcher mImageSwitcher;\n" +
                "    private int position = -1;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        mImageSwitcher = findViewById(R.id.imageSwitcher);\n" +
                "        Button buttonPrevious = findViewById(R.id.button3);\n" +
                "        Button buttonNext = findViewById(R.id.button);\n" +
                "\n" +
                "        int[] images = {R.drawable.image_one, R.drawable.image_two, R.drawable.image_three,\n" +
                "                R.drawable.image_four, R.drawable.image_five};\n" +
                "\n" +
                "        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {\n" +
                "            @Override\n" +
                "            public View makeView() {\n" +
                "\n" +
                "                ImageView imageView = new ImageView(getApplicationContext());\n" +
                "                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);\n" +
                "                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,\n" +
                "                        ActionBar.LayoutParams.WRAP_CONTENT));\n" +
                "\n" +
                "\n" +
                "                return imageView;\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonNext.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                if (position < images.length - 1) {\n" +
                "                    position += 1; //position = position + 1;\n" +
                "                    mImageSwitcher.setImageResource(images[position]);\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonPrevious.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                if (position > 0) {\n" +
                "                    position -= 1; // position = position - 1;\n" +
                "                    mImageSwitcher.setImageResource(images[position]);\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "   }\n" +
                "\n" +
                "}";
        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "\n" +
                "    <ImageSwitcher\n" +
                "        android:id=\"@+id/imageSwitcher\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"24dp\"\n" +
                "        android:layout_marginLeft=\"24dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:layout_marginEnd=\"24dp\"\n" +
                "        android:layout_marginRight=\"24dp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/button3\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "     <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"8dp\"\n" +
                "        android:layout_marginEnd=\"16dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:background=\"@drawable/button_custom\"\n" +
                "        android:text=\"Next\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/button3\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button3\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginEnd=\"8dp\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:background=\"@drawable/button_custom\"\n" +
                "        android:text=\"Previous\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toStartOf=\"@+id/button\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
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
        Objects.requireNonNull(getSupportActionBar()).setTitle("Image Switcher");
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

        mImageSwitcher = findViewById(R.id.imageSwitcher);
        Button buttonPrevious = findViewById(R.id.button3);
        Button buttonNext = findViewById(R.id.button);

        int[] images = {R.drawable.simpleclock, R.drawable.notification, R.drawable.webview,
                R.drawable.datastorage, R.drawable.toggle};

        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT));


                return imageView;
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position < images.length - 1) {
                    position += 1; //position = position + 1;
                    mImageSwitcher.setImageResource(images[position]);
                }


            }
        });

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position > 0) {
                    position -= 1; // position = position - 1;
                    mImageSwitcher.setImageResource(images[position]);
                }


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