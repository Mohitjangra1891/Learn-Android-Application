package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class recylerView_MATERIAL_DESIGN extends AppCompatActivity {
    Context context;
    String[] name = {"Facebook","Google+","Whatsapp", "Instagram","Twitter"
    };
    int[] imag = {
            R.drawable.example_facebook,
            R.drawable.example_googleplus,
            R.drawable.example_whatsapp,
            R.drawable.insta,
            R.drawable.twitter,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_view_material_design);
        String Javacode="\n" +
                "import ...\n" +
                "\n" +
                "public class RecycleDemo extends AppCompatActivity {\n" +
                "\n" +
                "    RecyclerView recyclerView;\n" +
                "    Context context;\n" +
                "    private List clubs;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_recycle_demo);\n" +
                "\n" +
                "        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);\n" +
                "        recyclerView.setHasFixedSize(true);\n" +
                "\n" +
                "        LinearLayoutManager layoutManager=new LinearLayoutManager(context);\n" +
                "        recyclerView.setLayoutManager(layoutManager);\n" +
                "\n" +
                "        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs);\n" +
                "        initilizeData();\n" +
                "        initializeAdapter();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    private void initializeAdapter() {\n" +
                "        RecyclerViewAdapter adapter = new RecyclerViewAdapter(clubs);\n" +
                "        recyclerView.setAdapter(adapter);\n" +
                "    }\n" +
                "\n" +
                "    private void initilizeData() {\n" +
                "        clubs = new ArrayList<>();\n" +
                "        clubs.add(new Club(\"Facebook\",R.drawable.fb));\n" +
                "        clubs.add(new Club(\"Google+\",R.drawable.google));\n" +
                "        clubs.add(new Club(\"Whatsapp\",R.drawable.w));\n" +
                "        clubs.add(new Club(\"Playstore\",R.drawable.p));\n" +
                "        clubs.add(new Club(\"Instagram\",R.drawable.insta));\n" +
                "    }\n" +
                "\n" +
                "    class Club {\n" +
                "\n" +
                "        String name;\n" +
                "        int logoId;\n" +
                "\n" +
                "        Club(String name, int logoId) {\n" +
                "            this.name = name;\n" +
                "            this.logoId = logoId;\n" +
                "        }\n" +
                "    }\n" +
                "}";

        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "    <ListView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:divider=\"@null\"\n" +
                "        android:layout_marginTop=\"20dp\"\n" +
                "        android:dividerHeight=\"0dp\"\n" +
                "        android:id=\"@+id/recyclerview\"/>\n" +
                "</RelativeLayout>\n\n\n" +
                "//Create new xml file ... customlayout.xml for custom layout of RecyclerView\n" +
                "\n" +
                "app >> res >> layout >> Layout resource file\n" +
                "\n" +

                "\n" +
                "<android.support.v7.widget.CardView \n" +
                "    xmlns:android=\"android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    xmlns:card_view=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:id=\"@+id/cardview\"\n" +
                "    card_view:cardCornerRadius=\"6dp\"\n" +
                "    card_view:cardElevation=\"3dp\"\n" +
                "    card_view:cardUseCompatPadding=\"true\">\n" +
                "\n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_margin=\"5dp\"\n" +
                "        android:orientation=\"horizontal\"\n" +
                "        android:padding=\"5dp\"\n" +
                "        android:gravity=\"center\">\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:layout_width=\"60dp\"\n" +
                "            android:layout_height=\"60dp\"\n" +
                "            android:id=\"@+id/logo\"/>\n" +
                "\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:textColor=\"#000000\"\n" +
                "            android:textStyle=\"bold\"\n" +
                "            android:textSize=\"15sp\"\n" +
                "            android:layout_marginLeft=\"10dp\"\n" +
                "            android:id=\"@+id/club_name\"/>\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "\n" +
                "</android.support.v7.widget.CardView>";

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
        Objects.requireNonNull(getSupportActionBar()).setTitle("RecyclerView with CardView");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        FloatingActionButton show_code_button=findViewById(R.id.code_button);
        show_code_button.setOnClickListener(view -> {
            Intent inte= new Intent(getApplicationContext(), source_CODE_Activity.class);
            inte.putExtra("javacode",Javacode);
            inte.putExtra("xmlcode",xmlcode);
            inte.putExtra("other", other);
            inte.putExtra("other_heading", other_heading);
            startActivity(inte);
        });



        ListView listView = findViewById(R.id.recyclerview);

        recylerView_MATERIAL_DESIGN.ListViewAdapter adapter = new recylerView_MATERIAL_DESIGN.ListViewAdapter(getApplicationContext(), name, imag);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView<?> adapterView, View view, int position, long id) -> {

            switch (position) {

                case 0:
                    Toast.makeText(getApplicationContext(),"Facebook",Toast.LENGTH_SHORT).show();
                    break;

                case 1:
                    Toast.makeText(getApplicationContext(),"Google",Toast.LENGTH_SHORT).show();

                    break;
                case 2:
                    Toast.makeText(getApplicationContext(),"Whatsapp",Toast.LENGTH_SHORT).show();

                    break;
                case 3:
                    Toast.makeText(getApplicationContext(),"Instagram",Toast.LENGTH_SHORT).show();

                    break;
                case 4:
                    Toast.makeText(getApplicationContext(),"Twitter",Toast.LENGTH_SHORT).show();
                    break;

            }
        });

    }


    class ListViewAdapter extends ArrayAdapter {

        String[] names;
        int[] image;

        public ListViewAdapter(Context context, String[] names, int[] images) {
            super(context, R.layout.example_custom_listview_layout, R.id.item_name, names);
            this.names = names;
            this.image = images;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.custom_listview_layout, parent, false);

            ImageView mimage = row.findViewById(R.id.image_custom_listview_item);
            TextView mtext = row.findViewById(R.id.name_custom_listview_item);
            mtext.setText(names[position]);
            mimage.setImageResource((image[position]));
            return row;
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