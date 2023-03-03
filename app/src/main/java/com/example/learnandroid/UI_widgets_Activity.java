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

public class UI_widgets_Activity extends AppCompatActivity implements IUnityAdsInitializationListener {
    private String unityGameID = "5167775";
    private String Interstitial_AD_ID = "Interstitial_Android";
    private Boolean testMode = false;

//    Context context= getApplicationContext();

    String[] name = {"Textview", "EditText", "Button", "ToggleButton", "Switch", "ImageButton", "CheckBox", "RadioButton", "Spinner"
            , "RatingBar", "SeekBar", "ProgressBar", "AlertDialog", "Autocomplete TextView", "MultiAutocomplete TextView"
            , "ImageSwitcher", "TextSwitcher"

    };
    int[] images = {
            R.drawable.textview,
            R.drawable.edit,
            R.drawable.button,
            R.drawable.toggle,
            R.drawable.switchb,
            R.drawable.imgbtn,
            R.drawable.checkbox,
            R.drawable.radiobutton,
            R.drawable.spinner,
            R.drawable.rating,
            R.drawable.seekbar,
            R.drawable.progress,
            R.drawable.alertdialog,
            R.drawable.autotext,
            R.drawable.mautotext,
            R.drawable.imgswitcher,
            R.drawable.txtswitcher,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_widgets);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("UI Widgets");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        UnityAds.initialize(getApplicationContext(), unityGameID, testMode, this);

        ListView listView = findViewById(R.id.UI_widgets_Listview);
        ListViewAdapter adapter = new ListViewAdapter(getApplicationContext(), name, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView<?> adapterView, View view, int position, long id) -> {
            if (click_count.clicked >= 12) {
                click_count.clicked = 1;
                DisplayInterstitialAd();
            } else {
                Log.e("TAG", "count error");
//                Toast.makeText(getApplicationContext(), "Clicked"+  click_count.clicked, Toast.LENGTH_SHORT).show();
                click_count.clicked += 1;

            }
            switch (position) {
                case 0:
                    Intent intent = new Intent(getApplicationContext(), textView_activity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent1 = new Intent(getApplicationContext(), edit_text.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent3 = new Intent(getApplicationContext(), button.class);
                    startActivity(intent3);
                    break;
                case 3:
                    Intent intent4 = new Intent(getApplicationContext(), toggle_Button.class);
                    startActivity(intent4);
                    break;
                case 4:
                    Intent intent5 = new Intent(getApplicationContext(), switch_.class);
                    startActivity(intent5);
                    break;
                case 5:
                    Intent intent6 = new Intent(getApplicationContext(), image_Button.class);
                    startActivity(intent6);
                    break;
                case 6:
                    Intent intent7 = new Intent(getApplicationContext(), check_Box.class);
                    startActivity(intent7);
                    break;
                case 7:
                    Intent intent8 = new Intent(getApplicationContext(), radio_Button.class);
                    startActivity(intent8);
                    break;
                case 8:
                    Intent intent9 = new Intent(getApplicationContext(), spinner__.class);
                    startActivity(intent9);
                    break;
                case 9:
                    Intent intent10 = new Intent(getApplicationContext(), rating_Bar.class);
                    startActivity(intent10);
                    break;
                case 10:
                    Intent intent11 = new Intent(getApplicationContext(), seek_Bar.class);
                    startActivity(intent11);
                    break;
                case 11:
                    Intent intent12 = new Intent(getApplicationContext(), progress_BAR.class);
                    startActivity(intent12);
                    break;
                case 12:
                    Intent intent13 = new Intent(getApplicationContext(), alert_Dailog.class);
                    startActivity(intent13);
                    break;
                case 13:
                    Intent intent14 = new Intent(getApplicationContext(), autoComplete_Textview.class);
                    startActivity(intent14);
                    break;
                case 14:
                    Intent intent15 = new Intent(getApplicationContext(), multi_auto_complete_textview.class);
                    startActivity(intent15);
                    break;
                case 15:
                    Intent intent16 = new Intent(getApplicationContext(), image_SWITCHER.class);
                    startActivity(intent16);
                    break;
                case 16:
                    Intent intent17 = new Intent(getApplicationContext(), text_SWITCHER.class);
                    startActivity(intent17);
                    break;

            }
        });
    }

    private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
        @Override
        public void onUnityAdsAdLoaded(String placementId) {
            UnityAds.show(UI_widgets_Activity.this, Interstitial_AD_ID, new UnityAdsShowOptions(), showListener);
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
    public void DisplayInterstitialAd() {
        UnityAds.load(Interstitial_AD_ID, loadListener);
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

    public static class ListViewAdapter extends ArrayAdapter {

        String[] names;
        int[] imagess;

        public ListViewAdapter(Context context, String[] name, int[] images) {
            super(context, R.layout.example_custom_listview_layout, R.id.item_name, name);
            this.names = name;
            this.imagess = images;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.example_custom_listview_layout, parent, false);

            ImageView mimage = row.findViewById(R.id.item_image);
            TextView mtext = row.findViewById(R.id.item_name);
            mtext.setText(names[position]);
            mimage.setImageResource((imagess[position]));
            return row;
        }
    }
}