package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class list_FRAGMENT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fragment);
        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.app.FragmentManager;\n" +
                "import android.app.FragmentTransaction;\n" +
                "import android.app.ListFragment;\n" +
                "import android.graphics.Color;\n" +
                "import android.os.Bundle;\n" +
                "import android.view.LayoutInflater;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\tFragmentManager fm = getFragmentManager();\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\tif (fm.findFragmentById(android.R.id.content) == null) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tSimpleListFragment list = new SimpleListFragment();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tfm.beginTransaction().add(android.R.id.content, list).commit();\n" +
                "\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\tpublic static class SimpleListFragment extends ListFragment\n" +
                "\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\tString[] AndroidOS = new String[] { \"Cupcake\",\"Donut\",\"Eclair\",\"Froyo\",\"Gingerbread\",\"Honeycomb\",\"Ice Cream SandWich\",\"Jelly Bean\",\"KitKat\",\"LolliPop\",\"MarshMallow\",\"Nougat\",\"Oreo\"};\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\tpublic void onListItemClick(ListView l, View v, int position, long id) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(getActivity(),\"AndroidOS:-\"+AndroidOS[position],Toast.LENGTH_SHORT).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tgetListView().setSelector(R.color.Gray);\n" +
                "\t\t\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\tpublic View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\tArrayAdapter<String> adapter = new ArrayAdapter<String>(\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tinflater.getContext(), android.R.layout.simple_list_item_1,\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tAndroidOS);\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tsetListAdapter(adapter);\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\treturn super.onCreateView(inflater, container, savedInstanceState);\n" +
                "\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t}\n" +
                "  }";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"horizontal\"\n" +
                "    android:gravity=\"center\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "    <TextView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"TextView\"\n" +
                "        android:id=\"@+id/txtdisp\"\n" +
                "        android:textColor=\"@color/Black\"\n" +
                "        android:textSize=\"20dp\"\n" +
                "        android:gravity=\"center\"/>\n" +
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
        String other_heading = "Manifest";
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("List Fragment");
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
        ListView listViewDemo;
        String[] listItemDemo={"Java", "Kotlin ", "Python", "Javascript",
                "C#", "C/C++", "Swift", "PHP",
                "Objective-C", "Ruby",
                "Html", "CSS", "SQL", "Scala", "Swift","R", "PHP", "Rust" };

        listViewDemo=(ListView)findViewById(R.id.listViewdemo);
        final ArrayAdapter<String> adapterDemo = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItemDemo);
        listViewDemo.setAdapter(adapterDemo);

        listViewDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value=adapterDemo.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

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