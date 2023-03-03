package com.example.learnandroid;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class json_parsing_IN_LESSONS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_parsing_in_lessons);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Json Parsing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String t1="Android JSON Parsing JSON stands for JavaScript Object Notation. It is an independent data exchange format and is the best alternative for XML. In summary, JSON is:<br>" +
                "• A data=interchange format.<br>" +
                "• A mean to encode JavaScript objects as strings.<br>" +
                "• Limited to text and numeric values. Binary values are explicitly not permitted. JSON has no CDATA equivalent.<br>" +
                "• More economical than XML in terms of data size, at the expense of readability.<br>" +
                "• Increasingly available as an option from API providers such as Twitter.<br>" +
                "<br>" +
                "Android provides four different classes to manipulate JSON data. These classes are JSONArray, JSONObject, JSONStringer and JSONTokenizer. Following is a JSON Array:<br>" +
                "<br>" +


                "1.   &nbsp;&nbsp; [<br> 2.  &nbsp;&nbsp;&nbsp;&nbsp;      {<br> 3.    &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;      “colours”:<br> 4.     &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;         {<br> 5.     &nbsp;&nbsp;&nbsp;&nbsp;   &nbsp;&nbsp;&nbsp;&nbsp;            “black”: “#000000”<br> 6.      &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;            “white”: “#ffffff”<br>7.       &nbsp;&nbsp;&nbsp;&nbsp;    &nbsp;&nbsp;&nbsp;&nbsp;     }<br>8.   &nbsp;&nbsp; &nbsp;&nbsp;    }<br>9.   &nbsp;&nbsp; <br>" +
                "<br>" +
                "<b>JSON Components</b><br>" +
                "<br><font color='#FF5733'>1. Array ( [ )</font><br>" +
                "In a JSON file, square bracket ([) represents a JSON array.<br>" +
                "<font color='#FF5733'>2. Objects ( { )</font><br>" +
                "In a JSON file, curly bracket ({) represents a JSON object.<br>" +
                "<font color='#FF5733'>3. Key</font><br>" +
                "A JSON object contains a key that is just a string. Pairs of key/value make up a JSON object.<br>" +
                "<font color='#FF5733'>4. Value</font><br>" +
                "Each key has a value that could be string, integer or double etc.<br>" +
                "<b><br>JSON Parsing</b><br><br>" +
                "For parsing a JSON object, create an object of class JSONObject and specify a string containing JSON data to it.<br>" +
                "<br>" +
                "1. String string;<br>" +
                "2. JSONObject read = new JSONObject(string);<br>" +
                "<br>" +
                "<br>" +
                "<b>Parse the JSON:</b><br><br>" +
                "1. JSONObject color = read.getJSONObject(“colours”);<br>" +
                "<br>" +
                "2. textcolour = color.getString(“black”);<br>" +
                "<br>" +
                "<br>" +
                "The method getJSONObject return =s the JSON object. The method getString returns the string value of the specified key. There are other methods provided by this class for better parsing JSON files:<br>" +
                "<br>" +
                "<font color='#FF5733'>1. get(String name)</font><br>" +
                "<br>" +
                "This method just Returns the value but in the form of Object type.<br>" +
                "<br>" +

                "<font color='#FF5733'>2. getBoolean(String name)</font><br>" +
                "<br>" +
                "This method returns the Boolean value specified by the key.<br>" +
                "<br>" +

                "<font color='#FF5733'>3. getDouble(String name)</font><br>" +
                "<br>" +
                "This method returns the double value specified by the key.<br>" +
                "<br>" +
                "<font color='#FF5733'>4. getInt(String name)</font><br>" +
                "<br>" +
                "This method returns the integer value specified by the key.<br>" +
                "<br>" +
                "<font color='#FF5733'>5. getLong(String name)</font><br>" +
                "<br>" +
                "This method returns the long value specified by the key.<br>" +
                "<br>" +
                "<font color='#FF5733'>6. length()</font><br>" +
                "<br>" +
                "This method returns the number of name/value specified by the key.<br>" +
                "<br>" +
                "<font color='#FF5733'>7. name()</font><br><br>This method returns an array containing the string names in this object.";


        TextView textView1 = (TextView) findViewById(R.id.text1);
//        SpannableString spannableString = new SpannableString(t1);
//
//        int startIndex = t1.indexOf("AndroidManifest.xml:");
//        int endIndex = startIndex + "AndroidManifest.xml:".length();
//        StyleSpan styleSpan1 = new StyleSpan(Typeface.BOLD);
//
//
//        spannableString.setSpan(styleSpan1, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView1.setText(Html.fromHtml(t1));

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