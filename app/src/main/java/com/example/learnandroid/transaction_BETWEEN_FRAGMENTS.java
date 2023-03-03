package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class transaction_BETWEEN_FRAGMENTS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_between_fragments);
        String Javacode = "import android.os.Bundle;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}";

        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#3DDC84\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "\n" +
                "    <fragment\n" +
                "        android:id=\"@+id/fragment1\"\n" +
                "        android:name=\"YOUR_PACKAGE_NAME.FirstFragment\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"0dp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/fragment2\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        tools:layout=\"@layout/fragment_first\"/>\n" +
                "\n" +
                "    <fragment\n" +
                "        android:id=\"@+id/fragment2\"\n" +
                "        android:name=\"YOUR_PACKAGE_NAME.SecondFragment\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"0dp\"\n" +
                "        android:layout_marginTop=\"8dp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.5\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/fragment1\"\n" +
                "        tools:layout=\"@layout/fragment_second\"/>\n" +
                "\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                "////fragment_one.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#A5DBFC\"\n" +
                "    tools:context=\".FirstFragment\">\n" +
                "\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editText\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"24dp\"\n" +
                "        android:layout_marginEnd=\"24dp\"\n" +
                "        android:background=\"#FFFFFF\"\n" +
                "        android:gravity=\"start|top\"\n" +
                "        android:hint=\"Enter some text\"\n" +
                "        android:inputType=\"textMultiLine\"\n" +
                "        android:padding=\"8dp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>\n\n\n" +
                "////fragment_two.xml\n\n\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:background=\"#FFE55F\"\n" +
                "    tools:context=\".SecondFragment\">\n" +
                "\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"0dp\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginStart=\"24dp\"\n" +
                "        android:layout_marginEnd=\"24dp\"\n" +
                "        android:background=\"#FFFFFF\"\n" +
                "        android:textSize=\"18sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "</androidx.constraintlayout.widget.ConstraintLayout>";

        String other = "//you have to create two Fragement(1>Fragment_one 2>Fragment_two)\n" +
                "\n" +
                "//1)Fragment_one\n" +
                "//for this fragment you have to create layout file(fragment_one.xml)\n" +
                "//inside XML file there is one EditText only\n\n\n" +
                "\n" +
                "\n" +

                "import androidx.fragment.app.Fragment;\n" +
                "import androidx.fragment.app.FragmentManager;\n" +
                "import androidx.fragment.app.FragmentTransaction;\n" +
                "\n" +
                "public class FirstFragment extends Fragment {\n" +
                "\n" +
                "    public FirstFragment() {\n" +
                "        // Required empty public constructor\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                             Bundle savedInstanceState) {\n" +
                "\n" +
                "        View view = inflater.inflate(R.layout.fragment_first, container, false);\n" +
                "\n" +
                "        EditText editText = view.findViewById(R.id.editText);\n" +
                "\n" +
                "        editText.addTextChangedListener(new TextWatcher() {\n" +
                "            @Override\n" +
                "            public void beforeTextChanged(CharSequence s, int start, int count, int after) {\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void onTextChanged(CharSequence s, int start, int before, int count) {\n" +
                "\n" +
                "                Fragment fragment = new SecondFragment(String.valueOf(s));\n" +
                "                FragmentManager fm = getActivity().getSupportFragmentManager();\n" +
                "                FragmentTransaction fragmentTransaction = fm.beginTransaction();\n" +
                "                fragmentTransaction.replace(R.id.fragment2, fragment);\n" +
                "                fragmentTransaction.commit();\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void afterTextChanged(Editable s) {\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "        return view;\n" +
                "    }\n" +
                "}\n\n\n" +
                "//2)TextFragment\n" +
                "//for this fragment you have to create layout file(fragment_two.xml)\n" +
                "//inside XML file there is one TextView only" +
                "\n\n" +
                "\n" +
                "import androidx.fragment.app.Fragment;\n" +
                "public class SecondFragment extends Fragment {\n" +
                "\n" +
                "    String text;\n" +
                "\n" +
                "    public SecondFragment(String text) {\n" +
                "        this.text = text;\n" +
                "    }\n" +
                "\n" +
                "    public SecondFragment() {\n" +
                "        // Required empty public constructor\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                             Bundle savedInstanceState) {\n" +
                "\n" +
                "        View view = inflater.inflate(R.layout.fragment_second, container, false);\n" +
                "\n" +
                "        TextView textView = view.findViewById(R.id.textView);\n" +
                "        textView.setText(text);\n" +
                "\n" +
                "        return view;\n" +
                "    }\n" +
                "}"
                ;
        String other_heading = "Fragment";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Transaction b/w Fragments");
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