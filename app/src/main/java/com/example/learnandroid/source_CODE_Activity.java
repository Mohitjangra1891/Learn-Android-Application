package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class source_CODE_Activity extends AppCompatActivity {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    ViewPager viewPager;
    String javacode;
    String xmlcode;
    String othercode;
    String otherheading;
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_code);

//        TextView text = (TextView) findViewById(R.id.javacode)/;

        Intent intent = getIntent();
        javacode = intent.getStringExtra("javacode");
        xmlcode = intent.getStringExtra("xmlcode");
        othercode = intent.getStringExtra("other");
        otherheading = intent.getStringExtra("other_heading");
//        text.setText(code);

//        Bundle bundle = new Bundle();
//        bundle.putString("key", code);
//        javaCode_show_fragment javacode_fragment = new javaCode_show_fragment();
//        javacode_fragment.setArguments(bundle);
        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);
        UnityAds.initialize(getApplicationContext(), unityGameID, testMode);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Source Code");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.TabLayout);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onSupportNavigateUp() {


        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
//        // add event for back button pressed
//        Intent intent = new Intent(this, MainActivity.class);
//        finish();
//        startActivity(intent);
        return true;
    }


    @Override
    public void onBackPressed() {

        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }


    }


    class MyAdapter extends FragmentStatePagerAdapter {


        public MyAdapter(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }


        // Return Fragment to display for that page
        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    Bundle bundle_2 = new Bundle();
                    bundle_2.putString("xmlcode", xmlcode);
                    xml_CODE_show_fragment xmlcode_fragment = new xml_CODE_show_fragment();
                    xmlcode_fragment.setArguments(bundle_2);
                    return xmlcode_fragment;

                case 1:
                    Bundle bundle = new Bundle();
                    bundle.putString("javacode", javacode);
                    javaCode_show_fragment javacode_fragment = new javaCode_show_fragment();
                    javacode_fragment.setArguments(bundle);
                    return javacode_fragment;
                case 2:
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("other", othercode);
                    bundle3.putString("other_heading", otherheading);
                    other_SHOW_CODE other_show = new other_SHOW_CODE();
                    other_show.setArguments(bundle3);
                    return other_show;
                default:
                    return null;
            }
        }

        // will be displayed as the tab's label
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "XML ";
                case 1:
                    return "Java ";
                case 2:
                    return "OTHER";

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

    }
}