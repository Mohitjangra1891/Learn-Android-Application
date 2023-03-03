package com.example.learnandroid;

import static com.unity3d.services.core.properties.ClientProperties.getApplicationContext;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

public class Tab_Basic extends Fragment implements IUnityAdsInitializationListener {
    private String unityGameID = "5167775";
    private String Interstitial_AD_ID = "Interstitial_Android";
    //    private String Banner_ID = "Banner_Android";
    private Boolean testMode = false;
//    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
//        @Override
//        public void onUnityAdsAdLoaded(String placementId) {
//            UnityAds.show(getActivity(), Interstitial_AD_ID, new UnityAdsShowOptions(), showListener);
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

    public Tab_Basic() {
    }

    String[] maintitle = {
            "UI Widgets", "Menu",
            "Date and Time", "Toast",
            "Containers", "Activity and Intent",
            "Fragment", "Notifications", "Data Storage",
            "Device & Sensors",
            "Material Design"
    };
    int[] images = {
            R.drawable.widgets,
            R.drawable.menu,
            R.drawable.datetime,
            R.drawable.toast,
            R.drawable.container,

            R.drawable.intent,
            R.drawable.fragment,
            R.drawable.notification,
            R.drawable.datastorage,
            R.drawable.sensor,
            R.drawable.materialdesign,

    };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_tab__basic, container, false);
        ListView list = view.findViewById(R.id.listview_basic_tab);
        UnityAds.initialize(getApplicationContext(), unityGameID, testMode, this);
//        UnityAds.load("interstitial_ad");
        tab_basic_listview_Adapter adapter = new tab_basic_listview_Adapter(requireContext(), maintitle, images,requireActivity());
        list.setAdapter(adapter);
        return view;
    }



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
//    public void DisplayInterstitialAd () {
//        UnityAds.load(Interstitial_AD_ID, loadListener);
//    }
}