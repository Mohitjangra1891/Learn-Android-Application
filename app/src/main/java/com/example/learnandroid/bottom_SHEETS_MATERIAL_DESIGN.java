package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class bottom_SHEETS_MATERIAL_DESIGN extends AppCompatActivity {
    Button button;
    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_material_design);
        String Javacode="import android.os.Bundle;\n" +
                "import android.view.View;\n" +
                "import android.widget.Button;\n" +
                "\n" +
                "import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "import com.google.android.material.bottomsheet.BottomSheetBehavior;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\n" +
                "    private BottomSheetBehavior<View> bottomSheetBehavior;\n" +
                "    private View bottomSheet;\n" +
                "\n" +
                "    private Button button;\n" +
                "    private boolean state;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                "\n" +
                "        bottomSheet = findViewById(R.id.design_bottom_sheet);\n" +
                "        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);\n" +
                "        button = findViewById(R.id.button);\n" +
                "\n" +
                "        state = true;\n" +
                "\n" +
                "        button.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                if (state) {\n" +
                "\n" +
                "                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);\n" +
                "\n" +
                "                    state = false;\n" +
                "                    button.setText(\"Collapse ButtonSheet\");\n" +
                "\n" +
                "                } else {\n" +
                "\n" +
                "                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);\n" +
                "\n" +
                "                    state = true;\n" +
                "                    button.setText(\"Expand ButtonSheet\");\n" +
                "                }\n" +
                "\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}";

                String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                        "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                        "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                        "    android:layout_width=\"match_parent\"\n" +
                        "    android:layout_height=\"match_parent\"\n" +
                        "    tools:context=\".MainActivity\">\n" +
                        "\n" +
                        "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"wrap_content\">\n" +
                        "\n" +
                        "        <Button\n" +
                        "            android:id=\"@+id/button\"\n" +
                        "            android:layout_width=\"0dp\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:layout_marginStart=\"32dp\"\n" +
                        "            android:layout_marginTop=\"16dp\"\n" +
                        "            android:layout_marginEnd=\"32dp\"\n" +
                        "            android:background=\"@drawable/custom_button\"\n" +
                        "            android:padding=\"20dp\"\n" +
                        "            android:text=\"Expand BottomSheet\"\n" +
                        "            android:textSize=\"18sp\"\n" +
                        "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                        "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                        "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                        "\n" +
                        "    </androidx.constraintlayout.widget.ConstraintLayout>\n" +
                        "\n" +
                        "    <RelativeLayout\n" +
                        "        android:id=\"@+id/design_bottom_sheet\"\n" +
                        "        android:layout_width=\"match_parent\"\n" +
                        "        android:layout_height=\"match_parent\"\n" +
                        "        android:background=\"#CC77F6\"\n" +
                        "        app:behavior_hideable=\"true\"\n" +
                        "        app:behavior_peekHeight=\"50dp\"\n" +
                        "        app:layout_behavior=\"@string/bottom_sheet_behavior\">\n" +
                        "\n" +
                        "        <TextView\n" +
                        "            android:layout_width=\"wrap_content\"\n" +
                        "            android:layout_height=\"wrap_content\"\n" +
                        "            android:text=\"This is a Example BottomSheet\"\n" +
                        "            android:textColor=\"#FFFFFF\"\n" +
                        "            android:textSize=\"20sp\"></TextView>\n" +
                        "\n" +
                        "    </RelativeLayout>\n" +
                        "\n" +
                        "\n" +
                        "</androidx.coordinatorlayout.widget.CoordinatorLayout>";

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
        Objects.requireNonNull(getSupportActionBar()).setTitle("BottomSheet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(getApplicationContext(), source_CODE_Activity.class);
                inte.putExtra("javacode",Javacode);
                startActivity(inte);
            }
        });
        View bottomsheet = findViewById(R.id.bottom_sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomsheet);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED){
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                    button.setText("Collapse Sheet");
                }else {
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    button.setText("Expand Sheet");
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