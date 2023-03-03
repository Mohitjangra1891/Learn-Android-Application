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

public class custom_LIST_VIEW extends AppCompatActivity {
    String[] name = {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6"
    };
    int[] imag = {
            R.drawable.optionmenu,
            R.drawable.webview,
            R.drawable.search,
            R.drawable.scrollview,
            R.drawable.autotext,
            R.drawable.checkbox,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        String Javacode="import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.widget.AdapterView;\n" +
                "import android.widget.ListView;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "    String[] item;\n" +
                "    int[] image;\n" +
                "    ListView listview;\n" +
                "    ListViewAdpter adpter;\n" +
                "    \n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\titem = new String[] {\"Item 1\",\"Item 2\",\"Item 3\",\"Item 4\",\"Item 5\"};\n" +
                "\t\t\t\t\timage=new int[]{R.drawable.one,R.drawable.two, R.drawable.three,R.drawable.four,R.drawable.five};\n" +
                "\t\t\t\t\tlistview = (ListView)findViewById(R.id.listViewdemo);\n" +
                "\n" +
                "\t\t\t\t\t// Pass results to ListViewAdapter Class\n" +
                "\t\t\t\t\tadpter = new  ListViewAdpter(MainActivity.this, image, item);\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t// Binds the Adapter to the ListView\n" +
                "\t\t\t\t\tlistview.setAdapter(adpter);\n" +
                "\t\t\t\t\tlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {\n" +
                "\t\t\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\t\t\tpublic void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {\n" +
                "\t\t\t\t\t\t\t\t\t\t// TODO Auto-generated method stub\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\tToast.makeText(getApplicationContext(),\"clicked\",Toast.LENGTH_SHORT).show();\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\t});\n" +
                "\t\t\t\t\t\t}\n" +
                "\t}";


        String xmlcode ="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\n" +
                "    <ListView\n" +
                "        android:id=\"@+id/listViewdemo\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:layout_margin=\"10dp\"\n" +
                "        />\n" +
                "\t\t\n" +
                "</LinearLayout>";

        String other = "//It's java class ListViewAdpter\n" +
                "//for layout you have to create XML file(listviewlayout.xml)\n" +
                "//inside XMl file create 1 ImageView and 1 TextView\n" +
                "\n" +
                "import android.content.Context;\n" +
                "import android.view.LayoutInflater;\n" +
                "import android.view.View;\n" +
                "import android.view.ViewGroup;\n" +
                "import android.widget.BaseAdapter;\n" +
                "import android.widget.ImageView;\n" +
                "import android.widget.TextView;\n" +
                "\n" +
                "public class ListViewAdpter extends BaseAdapter {\n" +
                "    Context context;\n" +
                "    String[] item;\n" +
                "    int[] image;\n" +
                "    LayoutInflater inflater;\n" +
                "\n" +
                "    public ListViewAdpter(Context context,int[] image, String[] item) {\n" +
                "        this.context = context;\n" +
                "        this.item = item;\n" +
                "        this.image = image;\n" +
                "    }\n" +
                "\n" +
                "    public int getCount() {\n" +
                "        return item.length;\n" +
                "    }\n" +
                "    public Object getItem(int position) {\n" +
                "        return null;\n" +
                "    }\n" +
                "    public long getItemId(int position) {\n" +
                "        return 0;\n" +
                "    }\n" +
                "    public View getView(int position, View convertView, ViewGroup parent) {\n" +
                "\n" +
                "                    TextView txtemp;\n" +
                "                    ImageView imgflag;\n" +
                "                    inflater = (LayoutInflater) context\n" +
                "                            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);\n" +
                "                    View itemView = inflater.inflate(R.layout.listviewlayout, parent, false);\n" +
                "\n" +
                "                    // Locate the TextViews in listviewlayout.xml\n" +
                "                    txtemp = (TextView) itemView.findViewById(R.id.text);\n" +
                "\n" +
                "                    // Locate the ImageView in listviewlayout.xml\n" +
                "                    imgflag = (ImageView) itemView.findViewById(R.id.image);\n" +
                "\n" +
                "                    // Capture position and set to the TextViews\n" +
                "                    txtemp.setText(item[position]);\n" +
                "\n" +
                "                    // Capture position and set to the ImageView\n" +
                "                    imgflag.setImageResource(image[position]);\n" +
                "\n" +
                "                    return itemView;\n" +
                "    }\n" +
                "}";
        String other_heading = "ListViewAdapter.java";

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Custom ListView");
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

        ListView listView = findViewById(R.id.listViewdemo);

        custom_LIST_VIEW.ListViewAdapter adapter = new custom_LIST_VIEW.ListViewAdapter(getApplicationContext(), name, imag);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView<?> adapterView, View view, int position, long id) -> {

            switch (position) {
                case 0:
                    Toast.makeText(getApplicationContext(),"Item1",Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Toast.makeText(getApplicationContext(),"Item2",Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(getApplicationContext(),"Item3",Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(getApplicationContext(),"Item4",Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(getApplicationContext(),"Item5",Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(getApplicationContext(),"Item6",Toast.LENGTH_SHORT).show();
                    break;
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
            View row = inflater.inflate(R.layout.example_custom_listview_layout, parent, false);

            ImageView mimage = row.findViewById(R.id.item_image);
            TextView mtext = row.findViewById(R.id.item_name);
            mtext.setText(names[position]);
            mimage.setImageResource((image[position]));
            return row;
        }
    }
}