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

public class tab_Advance_listview_Adapter extends BaseAdapter implements IUnityAdsInitializationListener {
    private String Interstitial_AD_ID = "intersitial_in_advance";
    private int clickCount = 0;

    Context context;
    int[] images;
    String[] texts;
    LayoutInflater inflater;
    private Activity mActivity;
    public tab_Advance_listview_Adapter(Context context, String[] texts, int[] images,Activity activity) {
        this.context = context;
        this.images = images;
        this.texts = texts;
        mActivity = activity;

        inflater = (LayoutInflater.from(context.getApplicationContext()));
    }
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

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount >= 5) {
                    clickCount = 0;
                    DisplayInterstitialAd();
                } else {
                    Log.e("TAG_Ad", "count error");
                    clickCount += 1;

                }
                switch (position) {
                    case 0:
                        Intent intent14 = new Intent(context, sevice_IN_ADVANCE.class);
                        context.startActivity(intent14);
                        break;
                    case 1:
                        Intent intent18 = new Intent(context, clipboard_MANAGER.class);
                        context.startActivity(intent18);
                        break;
                    case 2:
                        Intent intent = new Intent(context, phoneCall_Activity.class);
                        context.startActivity(intent);
                        break;
                    case 3:
                        Intent intent2 = new Intent(context, sendSMS_Activity.class);
                        context.startActivity(intent2);
                        break;
                    case 4:
                        Intent intent3 = new Intent(context, animation_Activity.class);
                        context.startActivity(intent3);
                        break;
                    case 5:
                        Intent intent4 = new Intent(context, text_To_speech_Activity.class);
                        context.startActivity(intent4);
                        break;
                    case 6:
                        Intent intent5 = new Intent(context, recordingApp_Activity.class);
                        context.startActivity(intent5);
                        break;
                    case 7:
                        Intent intent6 = new Intent(context, mediaPlayer_Activity.class);
                        context.startActivity(intent6);
                        break;
                    case 8:
                        Intent intent7 = new Intent(context, sqLite_Database_Activity.class);
                        context.startActivity(intent7);
                        break;

                }
            }
        });

        return view;
    }

}
