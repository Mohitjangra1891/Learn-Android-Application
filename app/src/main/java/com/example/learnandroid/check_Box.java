package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class check_Box extends AppCompatActivity {
    CheckBox mbacheckbox,mcacheckbox;
    Button btncheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.Button;\n" +
                "import android.widget.CheckBox;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "CheckBox mbacheckbox,mcacheckbox;\n" +
                "Button btncheck;\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\tmbacheckbox=(CheckBox)findViewById(R.id.MbaCheckBox);\n" +
                "\t\t\t\t\t\t\t\tmcacheckbox=(CheckBox)findViewById(R.id.McaCheckBox);\n" +
                "\t\t\t\t\t\t\t\tbtncheck=(Button)findViewById(R.id.checkbutton);\n" +
                "\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\tbtncheck.setOnClickListener(new View.OnClickListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tpublic void onClick(View view) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tif(mcacheckbox.isChecked()&& mbacheckbox.isChecked()){\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this,\"Checked:-\"+mcacheckbox.getText().toString() +\"\\n\"  +\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   \"Checked:-\"+mbacheckbox.getText().toString(),Toast.LENGTH_LONG ).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\telse if(mcacheckbox.isChecked())\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this,\"Checked:-\"+mcacheckbox.getText().toString(),Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\telse if(mbacheckbox.isChecked())\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this,\"Checked:-\"+mbacheckbox.getText().toString(),Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\telse\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this,\"Please select any checkbox \",Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\t});\n" +
                "\n" +
                "\t\t\t\t}\n" +
                "    \n" +
                "}";


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
        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\t\t\t<TextView\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:text=\"Select Course:\"\n" +
                "\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\tandroid:textColor=\"@color/Black\"\n" +
                "\t\t\t\t\tandroid:textSize=\"20sp\"\n" +
                "\t\t\t\t\tandroid:textStyle=\"bold\" />\n" +
                "\n" +
                "\t\t\t\t<LinearLayout\n" +
                "\t\t\t\t\tandroid:id=\"@+id/checklinearLayout\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_marginTop=\"30dp\"\n" +
                "\t\t\t\t\tandroid:orientation=\"vertical\">\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<CheckBox\n" +
                "\t\t\t\t\t\t\t\t\tandroid:id=\"@+id/McaCheckBox\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:checked=\"false\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:padding=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:text=\"MCA\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textColor=\"@color/colorPrimary\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textStyle=\"bold|italic\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t<CheckBox\n" +
                "\t\t\t\t\t\t\t\t\tandroid:id=\"@+id/MbaCheckBox\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:checked=\"false\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:padding=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:text=\"MBA\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textColor=\"@color/colorPrimary\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textSize=\"20dp\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textStyle=\"bold|italic\" />\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t<Button\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:id=\"@+id/checkbutton\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:textColor=\"@color/White\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:text=\"Submit\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:layout_gravity=\"center\"\n" +
                "\t\t\t\t\t\t\t\t\tandroid:background=\"@drawable/buttonshap\"/>\n" +
                "\n" +
                "\t\t\t\t</LinearLayout>\n" +
                "</LinearLayout>";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("CheckBox");
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

        mbacheckbox=(CheckBox)findViewById(R.id.MbaCheckBox);
        mcacheckbox=(CheckBox)findViewById(R.id.McaCheckBox);
        btncheck=(Button)findViewById(R.id.checkbutton);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mcacheckbox.isChecked()&& mbacheckbox.isChecked()){
                    Toast.makeText(getApplicationContext(),"Checked:-"+mcacheckbox.getText().toString() +"\n"  +
                            "Checked:-"+mbacheckbox.getText().toString(),Toast.LENGTH_LONG ).show();
                }
                else if(mcacheckbox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Checked:-"+mcacheckbox.getText().toString(),Toast.LENGTH_LONG).show();
                }
                else if(mbacheckbox.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Checked:-"+mbacheckbox.getText().toString(),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please select any checkbox ",Toast.LENGTH_LONG).show();
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