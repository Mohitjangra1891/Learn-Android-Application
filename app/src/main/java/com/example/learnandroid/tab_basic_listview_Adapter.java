package com.example.learnandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;

public class tab_basic_listview_Adapter extends BaseAdapter implements IUnityAdsInitializationListener {

    Context context;
    int[] images;
    String[] texts;
    LayoutInflater inflater;
    private Activity mActivity;
    public tab_basic_listview_Adapter(Context context, String[] texts, int[] images,Activity activity) {
        this.context = context;
        this.images = images;
        this.texts = texts;
        mActivity=activity;
        inflater = (LayoutInflater.from(context.getApplicationContext()));
    }

    private String unityGameID = "5167775";
    private String Interstitial_AD_ID = "Interstitial_Android";
    //    private String Banner_ID = "Banner_Android";
    private Boolean testMode = false;

    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
        @Override
        public void onUnityAdsAdLoaded(String placementId) {

            UnityAds.show(mActivity, Interstitial_AD_ID, new UnityAdsShowOptions(), showListener);
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


    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_listview_layout, null);

        ImageView imageView = view.findViewById(R.id.image_custom_listview_item);
        TextView textView = view.findViewById(R.id.name_custom_listview_item);

        imageView.setImageResource(images[position]);

        textView.setText(texts[position]);

        view.setOnClickListener(v -> {
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
                    Intent intent = new Intent(context, UI_widgets_Activity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    Intent intent2 = new Intent(context, Menu_activity.class);
                    context.startActivity(intent2);
                    break;
                case 2:
                    Intent intent3 = new Intent(context, date_and_time_activity.class);
                    context.startActivity(intent3);
                    break;
                case 3:
                    Intent intent4 = new Intent(context, Toast_activity.class);
                    context.startActivity(intent4);
                    break;
                case 4:
                    Intent intent5 = new Intent(context, container_activity.class);
                    context.startActivity(intent5);
                    break;
                case 5:
                    Intent intent6= new Intent(context, Intent_and_activity.class);
                    context.startActivity(intent6);
                    break;
                case 6:
                    Intent intent7 = new Intent(context, Fragment_activity.class);
                    context.startActivity(intent7);
                    break;
                case 7:
                    Intent intent8 = new Intent(context, notification_activity.class);
                    context.startActivity(intent8);
                    break;
                case 8:
                    Intent intent9= new Intent(context, Datastorage_activtiy.class);
                    context.startActivity(intent9);
                    break;
                case 9:
                    Intent intent11 = new Intent(context, device_and_Sensors.class);
                    context.startActivity(intent11);
                    break;
                case 10:
                    Intent intent10 = new Intent(context, MaterialDesign_activity.class);
                    context.startActivity(intent10);

                    break;


            }
        });

        return view;
    }
}