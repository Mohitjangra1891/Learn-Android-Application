package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class change_FRAGMENT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_fragment);

        String Javacode = "import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "import androidx.fragment.app.FragmentManager;\n" +
                "import androidx.fragment.app.FragmentTransaction;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private Button buttonOne;\n" +
                "    private Button buttonTwo;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        buttonOne = findViewById(R.id.button);\n" +
                "        buttonTwo = findViewById(R.id.button2);\n" +
                "\n" +
                "        buttonOne.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Fragment fragment = new FragmentOne();\n" +
                "                FragmentManager fm = getSupportFragmentManager();\n" +
                "                FragmentTransaction fragmentTransaction = fm.beginTransaction();\n" +
                "                fragmentTransaction.replace(R.id.frame_layout, fragment);\n" +
                "                fragmentTransaction.commit();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        buttonTwo.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                Fragment fragment = new FragmentTwo();\n" +
                "                FragmentManager fm = getSupportFragmentManager();\n" +
                "                FragmentTransaction fragmentTransaction = fm.beginTransaction();\n" +
                "                fragmentTransaction.replace(R.id.frame_layout, fragment);\n" +
                "                fragmentTransaction.commit();\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "    }\n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginTop=\"8dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:background=\"@drawable/custom_button\"\n" +
                "        android:text=\"Fragment One\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"32dp\"\n" +
                "        android:layout_marginTop=\"16dp\"\n" +
                "        android:layout_marginEnd=\"32dp\"\n" +
                "        android:text=\"Fragment Two\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.34\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/button\" />\n" +
                "\n" +
                "    <FrameLayout\n" +
                "        android:id=\"@+id/frame_layout\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"0dp\"\n" +
                "        android:layout_marginStart=\"16dp\"\n" +
                "        android:layout_marginTop=\"24dp\"\n" +
                "        android:layout_marginEnd=\"16dp\"\n" +
                "        android:layout_marginBottom=\"24dp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/button2\" />\n" +
                "\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                "////fragment_one.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#88D1FE\"\n" +
                "    tools:context=\".FragmentOne\">\n" +
                "\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"This is a Fragment One\"\n" +
                "        android:textColor=\"#000000\"\n" +
                "        android:textSize=\"24sp\" />\n" +
                "</FrameLayout>\n\n\n" +
                "////fragment_two.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#F9E995\"\n" +
                "    tools:context=\".FragmentTwo\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"This is a Fragment Two\"\n" +
                "        android:textColor=\"#000000\"\n" +
                "        android:textSize=\"24sp\" />\n" +
                "\n" +
                "</FrameLayout>";

        String other = "//you have to create two Fragement(1>Fragment_one 2>Fragment_two)\n" +
                "\n" +
                "//1)Fragment_one\n" +
                "//for this fragment you have to create layout file(fragment_one.xml)\n" +
                "//inside XML file there is one Textview only\n\n\n" +
                "\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "public class FragmentOne extends Fragment {\n" +
                "\n" +
                "    public FragmentOne() {\n" +
                "        // Required empty public constructor\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                             Bundle savedInstanceState) {\n" +
                "        // Inflate the layout for this fragment\n" +
                "        return inflater.inflate(R.layout.fragment_one, container, false);\n" +
                "    }\n" +
                "}\n\n\n" +
                "//2)TextFragment\n" +
                "//for this fragment you have to create layout file(fragment_two.xml)\n" +
                "//inside XML file there is one TextView only" +
                "\n\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "public class FragmentTwo extends Fragment {\n" +
                "\n" +
                "    public FragmentTwo() {\n" +
                "        // Required empty public constructor\n" +
                "    }\n" +
                "    \n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                             Bundle savedInstanceState) {\n" +
                "        // Inflate the layout for this fragment\n" +
                "        return inflater.inflate(R.layout.fragment_two, container, false);\n" +
                "    }\n" +
                "}";
        String other_heading = "Fragment";

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Change Fragment");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });

        Button buttonOne = findViewById(R.id.button);
        Button buttonTwo = findViewById(R.id.button2);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new first_fragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment);
                fragmentTransaction.commit();

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new second_fragment();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, fragment);
                fragmentTransaction.commit();

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