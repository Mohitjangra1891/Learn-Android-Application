package com.example.learnandroid;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class run_on_android_EMULATOR extends AppCompatActivity {
    //    WebView webView;
//    ProgressBar pgbar;
    String t1="An Android Virtual Device (AVD) is a configuration that" +
            "defines the characteristics of an Android phone, tablet," +
            "Wear 0S, Android TV, or Automotive 0S device that" +
            "you want to simulate in the Android Emulator.\n\n" +
            "The emulator provides almost all of the capabilities" +
            "of a real Android device. You can simulate incoming" +
            "phone calls and text messages, specify the location" +
            "of the device, simulate different network speeds," +
            "simulate rotation and other hardware sensors, access" +
            "the Google Play Store, and much more.\n\n" +
            "Testing your app on the emulator is in some ways" +
            "faster and easier than doing so on a physical device." +
            "For example, you can transfer data faster to the" +
            "emulator than to a device connected over USB.\n\n" +
            "The AVD Manager is an interface you can launch from" +
            "Android Studio that helps you create and manage" +
            "AVDS.";
    String t2="The Android Emulator has additional requirements" +
            "beyond the basic system requirements for Android" +
            "Studio, which are described below:\n\n" +
            "•SDK Tools 26.1.1 or higher\n" +
            "• 64-bit processor\n" +
            "•Windows: CPU with UG (unrestricted guest) support\n" +
            "• HAXM 6.2.1 or later (HAXM 7.2.0 or later" +
            "recommended)"+"\n\nThe use of hardware acceleration has additional" +
            "requirements on Windows and Linux:\n\n" +
            "• Intel processor on Windows or Linux: Intel processor" +
            "with support for Intel VTx, Intel EM64T (Intel 64), and" +
            "Execute Disable (XD) Bit functionality\n" +
            "• AMD processor on Linux: AMD processor with" +
            "support for AMD Virtualization (AMD-V) and" +
            "Supplemental Streaming SIMD Extensions 3 (SSSE3)\n" +
            "• AMD processor on Windows: Android Studio 3.2" +
            "or higher and Windows 10 April 2018 release" +
            "higher for Windows Hypervisor Platform (WHPX)" +
            "functionality\n\n" +
            "To work with Android 8.1 (API level 27) and higher" +
            "system images, an attached webcam must have the" +
            "capability to capture 720p frames.";
    String t3="Open the AVD Manager by clicking Tools> AVD" +
            "Manager.";
    String t4="Click Create Virtual Device, at the bottom of the AVD" +
            "Manager dialog\n\n" +
            "The select Hardware page appears.";
    String t5="Notice that only some hardware profiles are indicated" +
            "to include Play Store. This indicates that these profiles" +
            "are fully CTS compliant and may use system images" +
            "that include the Play Store app.\n\n" +
            "Select a hardware profile and then click Next.\n\n" +
            "If you don't see the hardware profile you want, you can" +
            "create or import a hardware profile.\n\n" +
            "The System Image page appears.";
    String t6="Select the system image for a particular API level, and" +
            "then click Next.\n\n" +
            "• The Recommended tab lists recommended system" +
            "images. The other tabs include a more complete list." +
            "The right pane describes the selected system image." +
            "X86 images run the fastest in the emulator.\n\n" +
            "• If you see Download next to the system image, you" +
            "need to click it to download the system image. You" +
            "must be connected to the internet to download it.\n";
    String t7="Change AVD properties as needed, and then click" +
            "Finish The new AVD appears in the Your Virtual" +
            "Devices page or the Select Deployment Target dialog.";
    String t8="In the toolbar, select the AVD that you want to run your" +
            "app on from the target device drop-down menu.";
    String t9="If you receive an error or warning message at the top" +
            "of the dialog, click the link to correct the problem or to" +
            "get more information.\n\n" +
            "Some errors you must fix before you can continue," +
            "such as certain Hardware Accelerated Execution" +
            "Manager (Intel HAXM) errors.\n\n" +
            "For macOS, if you see a Warning: No DNS servers" +
            "found error when starting the emulator, check to" +
            "see whether you have an /etc/resolv. conf file. If you" +
            "don't have this file, enter the following command in a" +
            "terminal window:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_on_android_emulator);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Android Virtual Device");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        ImageView imageView = findViewById(R.id.image1);
//        ImageView imageView2 = findViewById(R.id.image2);
//        ImageView imageView3 = findViewById(R.id.image3);
//        ImageView imageView4 = findViewById(R.id.image4);
//        ImageView imageView5 = findViewById(R.id.image5);
//        ImageView imageView6 = findViewById(R.id.image6);
//
//        Glide.with(this)
//                .load("https://i0.wp.com/www.alphr.com/wp-content/uploads/2021/03/Screenshot_2-128.png?w=642&ssl=1")
//                .into(imageView);
//
//
//        Glide.with(this)
//                .load("https://i0.wp.com/www.alphr.com/wp-content/uploads/2021/03/Screenshot_3-115.png?w=794&ssl=1")
//                .into(imageView2);
//
//        Glide.with(this)
//                .load("https://i0.wp.com/www.alphr.com/wp-content/uploads/2021/03/Screenshot_4-107.png?w=794&ssl=1")
//                .into(imageView3);
//
//        Glide.with(this)
//                .load("https://i0.wp.com/www.alphr.com/wp-content/uploads/2021/03/Screenshot_5-105.png?w=794&ssl=1")
//                .into(imageView4);
//
//        Glide.with(this)
//                .load("https://i0.wp.com/www.alphr.com/wp-content/uploads/2021/03/Screenshot_6-83.png?w=640&ssl=1")
//                .into(imageView5);
//
//        Glide.with(this)
//                .load("https://i0.wp.com/www.alphr.com/wp-content/uploads/2021/04/10-4.png?w=529&ssl=1")
//                .into(imageView6);
//

        TextView textView1 = findViewById(R.id.text1);
        TextView textView3 = findViewById(R.id.text3);
        TextView textView5 = findViewById(R.id.text5);
        TextView textView6 = findViewById(R.id.text6);
        TextView textView7 = findViewById(R.id.text7);
        TextView textView8 = findViewById(R.id.text8);
        TextView textView9 = findViewById(R.id.text9);
        TextView textView10 = findViewById(R.id.text10);
        TextView textView11 = findViewById(R.id.text11);
        TextView textView4 = findViewById(R.id.text111);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        textView1.setText(t1);
        textView3.setText(t2);
        textView5.setText(t3);
        textView6.setText(t4);
        textView7.setText(t5);
        textView8.setText(t6);
        textView9.setText(t7);
        textView10.setText(t8);
        textView11.setText(t9);
//
//        pgbar=findViewById(R.id.progressbar);
//        webView = (WebView) findViewById(R.id.web);
//        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                return true;
//            }
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                pgbar.setVisibility(View.VISIBLE);
//                super.onPageStarted(view, url, favicon);
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                pgbar.setVisibility(View.GONE);
//                super.onPageFinished(view, url);
//            }
//        });
//        String url = "https://developer.android.com/codelabs/basic-android-kotlin-compose-emulator#2";
//        webView.getSettings().setDomStorageEnabled(true);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//        webView.setInitialScale(1);
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.getSettings().setUseWideViewPort(true);
//        webView.loadUrl(url); // load a web page in a web view
//
    }

//    @Override
//    public void onBackPressed() {
//        if (webView.canGoBack()) {
//            webView.goBack();
//        } else {
//            super.onBackPressed();
//        }
//    }

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