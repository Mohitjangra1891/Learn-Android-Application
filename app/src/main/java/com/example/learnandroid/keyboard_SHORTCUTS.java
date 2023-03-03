package com.example.learnandroid;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class keyboard_SHORTCUTS extends AppCompatActivity {
    String[] n = {"Search everywhere", "Search for command", "Choose content to paste"
            , "Move between tabs", "Close current tab", "Hide all windows", "Auto indent a line", "Format code"
            , "Recently opened files", "Generate code", "Open a class", "Open any file", "Find"
            , "Find and replace", "Smart code completion", "Implements methods", "Quick Documentation", "Collapse/expand code blocks", "Move hardcoded strings to resources"
            , "Build and run"};
    String[] w = {"double  shift", "ctrl+shift+a",
            "ctrl+shift+v", "alt+ \'←\' | \'→\'", "ctrl+ F4", "ctrl+shift+F12", "ctrl+alt+i"
            , "ctrl+alt+l", "ctrl+e", "alt+Ins"
            , "ctrl+n", "ctrl+shift+n", "ctrl+f"
            , "ctrl+r", "ctrl+shift+space", "ctrl+i"
            ,"ctrl+q","ctrl+ \'.\'","alt+enter","shift+F10"

    };
    String[] m = {"double  shift", "cmd+shift+a"
            , "cmd+shift +v", "cmd+shift+ ]|[", "cmd+w", "cmd+shift +EF12", "ctrl+option+i"
            , "cmd+option+l", "cmd+e", "cmd+n"
            , "cmd+o", "cmd+shift+o", "cmd+f"
            , "cmd+r", "control+shift+space"
            , "control+i", "cmd+j"
            , "cmd+ \'.\'", "option+return"
            , "control+r"};
    String[] d = {"Search Android assets, navigate to the Gradle files, image resources, layouts, colors.xml and much more"
            , "Enter a keyword and Android Studio will display the" +
            "command you are looking for. For example, you want" +
            "to increase or decrease font size of text editor, you" +
            "just type \"font\" and you will get \"increase font\" and\n" +
            "\"decrease font\" actions."

            , "t shows you your last 5 copied items to clipboard and lets you chose one to paste."
            , " "
            , " "
            , " "
            , " "
            , "The android studio will reformat all the code for you."
            , "Gives you an option where you can browse the most" +
            "recently opened files on the go"
            , "It will list out all the options that are available such" +
            "as override methods, implement interfaces, toString" +
            "implementation etc.."
            , "Lets you search for a class in your project. Use this to" +
            "quickly find a class if you have lots of it."
            , "Search any file. E.g. class, layout, string, drawable, etc."
            , " "
            , "You can perform this shortcut to find and replace a" +
            "word in whole class. You can use this to find a word" +
            "occurrence and replace al occurrence at once"
            , "Filters list of methods and variables by expected type"
            , " "
            , "Lets yoou view the documentation of a particular" +
            "method, including the class it extends from and some" +
            "links to more details"
            , "Lets yoou view the documentation of a particular" +
            "method, including the class it extends from and some" +
            "links to more details"
            ," "," "

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard_shortcuts);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Keyboard shortcuts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ListView listView = findViewById(R.id.listview);

        keyboard_SHORTCUTS.ListViewAdapter adapter = new keyboard_SHORTCUTS.ListViewAdapter(getApplicationContext(), n, w, m, d);
        listView.setAdapter(adapter);
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

        String[] shortcut_name;
        String[] window_short;
        String[] mac_short;
        String[] description;


        public ListViewAdapter(Context context, String[] shortcut_name, String[] window_short, String[] mac_short, String[] description) {
            super(context, R.layout.cardview_for_keyboard_shortcut, R.id.shortcut_name, shortcut_name);
            this.shortcut_name = shortcut_name;
            this.window_short = window_short;
            this.mac_short = mac_short;
            this.description = description;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.cardview_for_keyboard_shortcut, parent, false);


            TextView name = row.findViewById(R.id.shortcut_name);
            TextView win_s = row.findViewById(R.id.window_shortcut_key);
            TextView mac_s = row.findViewById(R.id.mac_shortcut_key);
            TextView des = row.findViewById(R.id.description);
            name.setText(shortcut_name[position]);
            win_s.setText(window_short[position]);
            mac_s.setText(mac_short[position]);
            des.setText(description[position]);
            return row;
        }
    }
}