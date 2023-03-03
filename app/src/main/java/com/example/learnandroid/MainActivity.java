package com.example.learnandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.facebook.ads.AdView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private String unityGameID = "5167775";
    private String Interstitial_AD_ID = "Interstitial_Android";
    private String Banner_ID = "Banner_Android";
    private Boolean testMode = false;

    private AdView adView;

    Toolbar toolbar;
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    private DrawerLayout drawerLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);

        UnityAds.initialize(getApplicationContext(), unityGameID, testMode, new IUnityAdsInitializationListener() {
            @Override
            public void onInitializationComplete() {
//                DisplayInterstitialAd();

            }

            @Override
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String s) {
                Log.e("UnityAdsExample", "Unity Ads initialization failed with error: ");

            }
        });


        NavigationView navigationView = findViewById(R.id.navigation_drawer);

        navigationView.setNavigationItemSelectedListener(item -> {

            // Navigation drawer item click listener
            switch (item.getItemId()) {
                case R.id.android:

                    //Replace your own action here
//                    Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.mail:
                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                    emailIntent.setData(Uri.parse("mailto:"));
//                    emailIntent.setType("plain/text");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"jangramohit18912@gmail.com"});
//                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
//                    emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    //Replace your own action here
//                    Toast.makeText(MainActivity.this, "Mail", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.share:
                    Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");
                    String app_url = " https://www.instagram.com/_mohitjangra_19/";
                    shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
                    startActivity(Intent.createChooser(shareIntent, "Share via"));
                    //Replace your own action here
//                    Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.rate:

                    //Replace your own action here
//                    Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show();

            }

            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
        drawerLayout = findViewById(R.id.drawer_layout);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Learn Android");

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.TabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }

//    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
//        @Override
//        public void onUnityAdsAdLoaded(String placementId) {
//            UnityAds.show(MainActivity.this, Interstitial_AD_ID, new UnityAdsShowOptions(), showListener);
//        }
//
//        @Override
//        public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
//            Log.e("UnityAdsExample", "Unity Ads failed to load ad for " + placementId + " with error: [" + error + "] " + message);
//        }
//    };
//
//    private IUnityAdsShowListener showListener = new IUnityAdsShowListener() {
//        @Override
//        public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
//            Log.e("UnityAdsExample", "Unity Ads failed to show ad for " + placementId + " with error: [" + error + "] " + message);
//        }
//
//        @Override
//        public void onUnityAdsShowStart(String placementId) {
//            Log.v("UnityAdsExample", "onUnityAdsShowStart: " + placementId);
//        }
//
//        @Override
//        public void onUnityAdsShowClick(String placementId) {
//            Log.v("UnityAdsExample", "onUnityAdsShowClick: " + placementId);
//        }
//
//        @Override
//        public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
//            Log.v("UnityAdsExample", "onUnityAdsShowComplete: " + placementId);
//        }
//    };
//    // Implement a function to load an interstitial ad. The ad will start to show after the ad has been loaded.
//    public void DisplayInterstitialAd () {
//        UnityAds.load(Interstitial_AD_ID, loadListener);
//    }

    @Override
    public void onBackPressed() {
        if (adView != null) {
            adView.destroy();
        }

        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }



    }

    public class MyAdapter extends FragmentStatePagerAdapter {


        public MyAdapter(FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }


        // Return Fragment to display for that page
        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new TabLearn();
                case 1:
                    return new Tab_Basic();
                case 2:
                    return new Tab_Advance();
                default:
                    return null;
            }
        }


        // will be displayed as the tab's label
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Learn";
                case 1:
                    return "Basic";
                case 2:
                    return "Advance";
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.share__:
                // Add your click event handling code here
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");
                String app_url = " https://www.instagram.com/_mohitjangra_19/";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}