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


public class Tab_Advance extends Fragment implements IUnityAdsInitializationListener {
    private String unityGameID = "5167775";
    private Boolean testMode = false;


    public Tab_Advance() {
        // Required empty public constructor
    }

    String[] maintitle = {"Services","Clipboard Manager","Phone Call", "Send SMS and Email","Animation",
            "Text-To-Speech",
            "Recording App", "Music Player", "SQLite Database"
    };
    int[] images = {
            R.drawable.service_and,
            R.drawable.autotext,
            R.drawable.call,
            R.drawable.smssend,
            R.drawable.animate,
            R.drawable.img,
            R.drawable.record,
            R.drawable.multimedia,
            R.drawable.updatedatabase,
    };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_tab__advance, container, false);
        ListView list = view.findViewById(R.id.listview_Advance_tab);
        UnityAds.initialize(getApplicationContext(), unityGameID, testMode,this);
        tab_Advance_listview_Adapter adapter = new tab_Advance_listview_Adapter(requireContext(), maintitle, images,requireActivity());
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
}