
package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Objects;

public class search_VIEW extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    Toast toast;

ArrayList<String> containersearchlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.ArrayAdapter;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.SearchView;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    SearchView containersearchView;\n" +
                "    ListView containerSearchListView;\n" +
                "    ArrayList<String> containersearchlist;\n" +
                "    ArrayAdapter<String > searchadapter;\n" +
                "\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\t\t\tcontainersearchView = (SearchView) findViewById(R.id.containersearchView);\n" +
                "\t\t\t\t\t\t\tcontainerSearchListView = (ListView) findViewById(R.id.containerSearchList);\n" +
                "\n" +
                "\t\t\t\t\t\t\t//Add Item to the Arraylist\n" +
                "\t\t\t\t\t\t\tcontainersearchlist = new ArrayList<>();\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Abhishek\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Ashok\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Anurag\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Bindiya\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Bunny\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Dhruva\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Kriva\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Krisha\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Milan\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Mohit\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Kishan\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"kaushik\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Payal\");\n" +
                "\t\t\t\t\t\t\tcontainersearchlist.add(\"Sneha\");\n" +
                "\n" +
                "\n" +
                "\t\t\t\t\t\t\tsearchadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,containersearchlist);\n" +
                "\t\t\t\t\t\t\tcontainerSearchListView.setAdapter(searchadapter);\n" +
                "\n" +
                "\t\t\t\t\t\t\tcontainersearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {\n" +
                "\t\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\t\tpublic boolean onQueryTextSubmit(String query) {\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tif(containersearchlist.contains(query)){\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsearchadapter.getFilter().filter(query);\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t}else{\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tToast.makeText(MainActivity.this, \"No Match found\",Toast.LENGTH_LONG).show();\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn false;\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\tpublic boolean onQueryTextChange(String newText) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\tsearchadapter.getFilter().filter(newText);\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn false;\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t});\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t\n" +
                "}";


        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "\t\t\t\t<SearchView\n" +
                "\t\t\t\t\tandroid:id=\"@+id/containersearchView\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"wrap_content\"\n" +
                "\t\t\t\t\tandroid:queryHint=\"Search Here\"\n" +
                "\t\t\t\t\tandroid:iconifiedByDefault=\"false\"\n" +
                "\t\t\t\t   android:layout_margin=\"20dp\"\n" +
                "\t\t\t\t\t/>\n" +
                "\t\t\t\t<ListView\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:id=\"@+id/containerSearchList\"\n" +
                "\t\t\t\t\tandroid:divider=\"#ad5\"\n" +
                "\t\t\t\t\tandroid:dividerHeight=\"2dp\"/>\n" +
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

        ListView listView = findViewById(R.id.listview);
        SearchView searchView = findViewById(R.id.searchview);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("SearchView");
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
        containersearchlist = new ArrayList<>();
        containersearchlist.add("Abhishek");
        containersearchlist.add("Ashok");
        containersearchlist.add("Anurag");
        containersearchlist.add("Bindiya");
        containersearchlist.add("Bunny");
        containersearchlist.add("Dhruva");
        containersearchlist.add("Kriva");
        containersearchlist.add("Krisha");
        containersearchlist.add("Milan");
        containersearchlist.add("Mohit");
        containersearchlist.add("Kishan");
        containersearchlist.add("kaushik");
        containersearchlist.add("Payal");
        containersearchlist.add("Sneha");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, containersearchlist);

        listView.setAdapter(adapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(containersearchlist.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(getApplicationContext(), "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
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