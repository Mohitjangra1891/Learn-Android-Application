package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Objects;

public class web_VIEW extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String Javacode = "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.os.Bundle;\n" +
                "import android.webkit.WebView;\n" +
                "import android.webkit.WebViewClient;\n" +
                "import android.widget.Toast;\n" +
                "\n" +
                "public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "\t\t\t\t@Override\n" +
                "\t\t\t\tprotected void onCreate(Bundle savedInstanceState) {\n" +
                "\t\t\t\t\tsuper.onCreate(savedInstanceState);\n" +
                "\t\t\t\t\tsetContentView(R.layout.activity_main);\n" +
                "\t\t\t\t\tWebView containerWebview = (WebView) findViewById(R.id.containerWebView);\n" +
                "\t\t\t\t\tcontainerWebview.setWebViewClient(new MyWebViewClient());\n" +
                "\t\t\t\t\tString url = \"http://www.google.com\";\n" +
                "\t\t\t\t\tcontainerWebview.getSettings().setJavaScriptEnabled(true);\n" +
                "\t\t\t\t\tcontainerWebview.loadUrl(url); // load a web page in a web view\n" +
                "\t\t\t\t  \n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t\n" +
                "\t\t\t\tprivate class MyWebViewClient extends WebViewClient {\n" +
                "\t\t\t\t\t\t\t@Override\n" +
                "\t\t\t\t\t\t\tpublic boolean shouldOverrideUrlLoading(WebView view, String url) {\n" +
                "\t\t\t\t\t\t\t\t\t\t\tview.loadUrl(url);\n" +
                "\t\t\t\t\t\t\t\t\t\t\treturn true;\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "    \n" +
                "}";


        String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\t\n" +
                "\t\t\t\t<WebView\n" +
                "\t\t\t\t\tandroid:id=\"@+id/containerWebView\"\n" +
                "\t\t\t\t\tandroid:layout_width=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_height=\"match_parent\"\n" +
                "\t\t\t\t\tandroid:layout_margin=\"30dp\"\n" +
                "\t\t\t\t\tandroid:scrollbars=\"none\"/>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t\n" +
                "</LinearLayout>";

        String other = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    package=\".androidexample\">\n" +
                "\t\n" +
                "\t<uses-permission android:name=\"android.permission.INTERNET\" />\n" +
                "\t\n" +
                "\t<activity\n" +
                "\t\t\t\t\t\tandroid:name=\".MainActivity\"\n" +
                "\t\t\t\t\t\tandroid:label=\"MainActivity\"\n" +
                "\t\t\t\t\t\t<intent-filter>\n" +
                "\t\t\t\t\t\t\t<action android:name=\"android.intent.action.MAIN\" />\n" +
                "\n" +
                "\t\t\t\t\t\t\t<category android:name=\"android.intent.category.LAUNCHER\" />\n" +
                "\t\t\t\t\t\t</intent-filter>\n" +
                "     </activity>\n" +
                "</manifest>";
        String other_heading = "Manifest";

        webView = (WebView) findViewById(R.id.webview);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("WebView");
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
        webView.setWebViewClient(new MyWebViewClient());
        String url = "http://www.google.com";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url); // load a web page in a web view

    }

    static class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
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