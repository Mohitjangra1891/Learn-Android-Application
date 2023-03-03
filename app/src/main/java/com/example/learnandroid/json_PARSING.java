package com.example.learnandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class json_PARSING extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_parsing);

//        String Javacode="import android.os.Bundle;\n" +
//                "import android.view.View;\n" +
//                "import android.widget.ArrayAdapter;\n" +
//                "import android.widget.Button;\n" +
//                "import android.widget.ListView;\n" +
//                "\n" +
//                "import androidx.appcompat.app.AppCompatActivity;\n" +
//                "\n" +
//                "import org.json.JSONArray;\n" +
//                "import org.json.JSONException;\n" +
//                "import org.json.JSONObject;\n" +
//                "\n" +
//                "import java.io.IOException;\n" +
//                "import java.io.InputStream;\n" +
//                "\n" +
//                "\n" +
//                "public class MainActivity extends AppCompatActivity {\n" +
//                "\n" +
//                "\n" +
//                "    private ArrayAdapter<String> adapter;\n" +
//                "    private ListView listView;\n" +
//                "\n" +
//                "\n" +
//                "    @Override\n" +
//                "    protected void onCreate(Bundle savedInstanceState) {\n" +
//                "        super.onCreate(savedInstanceState);\n" +
//                "        setContentView(R.layout.activity_main);\n" +
//                "\n" +
//                "\n" +
//                "        listView = findViewById(R.id.listView);\n" +
//                "\n" +
//                "        Button button = findViewById(R.id.button);\n" +
//                "\n" +
//                "        adapter = new ArrayAdapter<>(this, R.layout.list_itemss);\n" +
//                "\n" +
//                "        button.setOnClickListener(new View.OnClickListener() {\n" +
//                "            @Override\n" +
//                "            public void onClick(View v) {\n" +
//                "\n" +
//                "                // call the method\n" +
//                "                jsonParse();\n" +
//                "\n" +
//                "            }\n" +
//                "        });\n" +
//                "    }\n" +
//                "\n" +
//                "    public void jsonParse() {\n" +
//                "\n" +
//                "\n" +
//                "        try {\n" +
//                "\n" +
//                "            // load jsonObject\n" +
//                "            JSONObject object = new JSONObject(loadJson());\n" +
//                "\n" +
//                "            // The value mapped by name if it exists and is a JSONArray\n" +
//                "            JSONArray array = object.getJSONArray(\"data\");\n" +
//                "\n" +
//                "            for (int i = 0; i < array.length(); i++) {\n" +
//                "\n" +
//                "                JSONObject data = array.getJSONObject(i);\n" +
//                "\n" +
//                "                int id = data.getInt(\"Id\");\n" +
//                "                String name = data.getString(\"Name\");\n" +
//                "                String email = data.getString(\"Email\");\n" +
//                "\n" +
//                "                adapter.add(\"ID :- \" + id + \"\\n\" +\n" +
//                "                        \"Name :- \" + name + \"\\n\" +\n" +
//                "                        \"Email :- \" + email);\n" +
//                "\n" +
//                "            }\n" +
//                "\n" +
//                "            listView.setAdapter(adapter);\n" +
//                "\n" +
//                "\n" +
//                "        } catch (JSONException e) {\n" +
//                "            e.printStackTrace();\n" +
//                "        }\n" +
//                "    }\n" +
//                "\n" +
//                "    // load json file from the assets folder\n" +
//                "    public String loadJson() {\n" +
//                "\n" +
//                "        String json = null;\n" +
//                "        try {\n" +
//                "            InputStream stream = getAssets().open(\"example.json\"); // fileName\n" +
//                "            int size = stream.available();\n" +
//                "            byte[] buffer = new byte[size];\n" +
//                "            stream.read(buffer);\n" +
//                "            stream.close();\n" +
//                "\n" +
//                "            json = new String(buffer, \"UTF-8\");\n" +
//                "\n" +
//                "        } catch (IOException e) {\n" +
//                "            e.printStackTrace();\n" +
//                "            return null;\n" +
//                "        }\n" +
//                "        return json;\n" +
//                "    }\n" +
//                "\n" +
//                "\n" +
//                "}";
//        String xmlcode="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
//                "<androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
//                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
//                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
//                "    android:layout_width=\"match_parent\"\n" +
//                "    android:layout_height=\"match_parent\"\n" +
//                "    tools:context=\".MainActivity\">\n" +
//                "\n" +
//                "\n" +
//                "    <Button\n" +
//                "        android:id=\"@+id/button\"\n" +
//                "        android:layout_width=\"match_parent\"\n" +
//                "        android:layout_height=\"wrap_content\"\n" +
//                "        android:layout_marginStart=\"24dp\"\n" +
//                "        android:layout_marginTop=\"8dp\"\n" +
//                "        android:layout_marginEnd=\"24dp\"\n" +
//                "        android:text=\"Json Parsing\"\n" +
//                "        android:textSize=\"18sp\"\n" +
//                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
//                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
//                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
//                "\n" +
//                "\n" +
//                "    <ListView\n" +
//                "        android:id=\"@+id/listView\"\n" +
//                "        android:layout_width=\"match_parent\"\n" +
//                "        android:layout_height=\"0dp\"\n" +
//                "        android:layout_marginStart=\"8dp\"\n" +
//                "        android:layout_marginTop=\"8dp\"\n" +
//                "        android:layout_marginEnd=\"8dp\"\n" +
//                "        android:layout_marginBottom=\"8dp\"\n" +
//                "        android:divider=\"@android:color/transparent\"\n" +
//                "        android:dividerHeight=\"5dp\"\n" +
//                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
//                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
//                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
//                "        app:layout_constraintTop_toBottomOf=\"@+id/button\">\n" +
//                "\n" +
//                "    </ListView>\n" +
//                "\n" +
//                "</androidx.constraintlayout.widget.ConstraintLayout>";
//
//        String other = "<activity\n" +
//                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
//                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
//                "\t\t\t\t\t\t<intent-filter>\n" +
//                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
//                "\n" +
//                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
//                "\t\t\t\t\t\t</intent-filter>\n" +
//                "        </activity>";
//        String other_heading = "Manifest";
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        Objects.requireNonNull(getSupportActionBar()).setTitle("Json Parsing");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        FloatingActionButton show_code_button = findViewById(R.id.code_button);
//        show_code_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent inte = new Intent(getApplicationContext(), source_CODE_Activity.class);
//                inte.putExtra("javacode", Javacode);
//                inte.putExtra("xmlcode",xmlcode);
//                inte.putExtra("other", other);
//                inte.putExtra("other_heading", other_heading);
//                startActivity(inte);
//            }
//        });
//
//        listView = findViewById(R.id.listView);
//
//        Button button = findViewById(R.id.button);
//
//        adapter = new ArrayAdapter<>(this);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // call the method
//                jsonParse();
//
//            }
//        });
//    }
//    public void jsonParse() {
//
//
//        try {
//
//            // load jsonObject
//            JSONObject object = new JSONObject(loadJson());
//
//            // The value mapped by name if it exists and is a JSONArray
//            JSONArray array = object.getJSONArray("data");
//
//            for (int i = 0; i < array.length(); i++) {
//
//                JSONObject data = array.getJSONObject(i);
//
//                int id = data.getInt("Id");
//                String name = data.getString("Name");
//                String email = data.getString("Email");
//
//                adapter.add("ID :- " + id + "\n" +
//                        "Name :- " + name + "\n" +
//                        "Email :- " + email);
//
//            }
//
//            listView.setAdapter(adapter);
//
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // load json file from the assets folder
//    public String loadJson() {
//
//        String json = null;
//        try {
//            InputStream stream = getAssets().open("example.json"); // fileName
//            int size = stream.available();
//            byte[] buffer = new byte[size];
//            stream.read(buffer);
//            stream.close();
//
//            json = new String(buffer, "UTF-8");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//        return json;
//    }
//
//
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        if (getFragmentManager().getBackStackEntryCount() > 0) {
//            getFragmentManager().popBackStack();
//        } else {
//            super.onBackPressed();
//        }
//        return true;
    }
}