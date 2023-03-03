package com.example.learnandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;

import java.util.Objects;

public class Toast_activity extends AppCompatActivity implements IUnityAdsInitializationListener {
    private String unityGameID = "5167775";
    private String Interstitial_AD_ID = "Interstitial_Android";
    private Boolean testMode = false;

    String[] name = {"Simple Toast","Custom Toast","Positional Toast"
    };
    int[] imag = {
            R.drawable.toast,
            R.drawable.ctoast,
            R.drawable.toast,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Toast");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        UnityAds.initialize(getApplicationContext(), unityGameID, testMode, this);

        ListView listView = findViewById(R.id.toast_listview);

        Toast_activity.ListViewAdapter adapter = new Toast_activity.ListViewAdapter(getApplicationContext(), name, imag);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView<?> adapterView, View view, int position, long id) -> {

            if (click_count.clicked >= 12) {
                click_count.clicked=1;
                DisplayInterstitialAd();
            } else {
                Log.e("TAG", "count error");
//                Toast.makeText(getApplicationContext(), "Clicked"+  click_count.clicked, Toast.LENGTH_SHORT).show();
                click_count.clicked += 1;

            }
            switch (position) {
                case 0:
                    Intent intent = new Intent(getApplicationContext(), simple_TOAST.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(getApplicationContext(), custom_TOAST.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent3 = new Intent(getApplicationContext(), positional_TOAST.class);
                    startActivity(intent3);
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
//        // add event for back button pressed
//        Intent intent = new Intent(this, MainActivity.class);
//        finish();
//        startActivity(intent);
        return true;
    }
    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
        @Override
        public void onUnityAdsAdLoaded(String placementId) {
            UnityAds.show(Toast_activity.this, Interstitial_AD_ID, new UnityAdsShowOptions(), showListener);
        }

        @Override
        public void onUnityAdsFailedToLoad(String placementId, UnityAds.UnityAdsLoadError error, String message) {
            Log.e("UnityAdsExample", "Unity Ads failed to load ad for " + placementId + " with error: [" + error + "] " + message);
        }
    };

    private IUnityAdsShowListener showListener = new IUnityAdsShowListener() {
        @Override
        public void onUnityAdsShowFailure(String placementId, UnityAds.UnityAdsShowError error, String message) {
            Log.e("UnityAdsExample", "Unity Ads failed to show ad for " + placementId + " with error: [" + error + "] " + message);
        }

        @Override
        public void onUnityAdsShowStart(String placementId) {
            Log.v("UnityAdsExample", "onUnityAdsShowStart: " + placementId);
        }

        @Override
        public void onUnityAdsShowClick(String placementId) {
            Log.v("UnityAdsExample", "onUnityAdsShowClick: " + placementId);
        }

        @Override
        public void onUnityAdsShowComplete(String placementId, UnityAds.UnityAdsShowCompletionState state) {
            Log.v("UnityAdsExample", "onUnityAdsShowComplete: " + placementId);
        }
    };
    @Override
    public void onInitializationComplete() {
//        DisplayInterstitialAd();
    }

    @Override
    public void onInitializationFailed(UnityAds.UnityAdsInitializationError error, String message) {
        Log.e("UnityAdsExample", "Unity Ads initialization failed with error: [" + error + "] " + message);
    }
    //
    // Implement a function to load an interstitial ad. The ad will start to show after the ad has been loaded.
    public void DisplayInterstitialAd () {
        UnityAds.load(Interstitial_AD_ID, loadListener);
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