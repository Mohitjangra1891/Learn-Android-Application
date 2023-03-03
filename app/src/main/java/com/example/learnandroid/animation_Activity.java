package com.example.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class animation_Activity extends AppCompatActivity {
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;

    ImageView imageView;
    Button blink, slideUp, slideDown, rotate, zoomIn, zoomOut, crossFade, fadeIn, fadeOut, move, bounce, sequential, stop;
    FloatingActionButton show_code_button;

    String Javacode = "package com.example.learnandroid;\n" +
            "\n" +
            "import android.content.Intent;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.view.animation.Animation;\n" +
            "import android.view.animation.AnimationUtils;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ImageView;\n" +
            "import androidx.appcompat.app.AppCompatActivity;\n" +
            "import java.util.Objects;\n\n" +
            "public class animation_Activity extends AppCompatActivity {\n" +
            "    ImageView imageView;\n" +
            "    Button blink, slideUp, slideDown, rotate, zoomIn, zoomOut, crossFade, fadeIn, fadeOut, move, bounce, sequential, stop;\n" +
            "  @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_animation);\n" +
            "        imageView = findViewById(R.id.imageview);\n" +
            "\n" +
            "        blink = findViewById(R.id.blink);\n" +
            "        slideUp = findViewById(R.id.slide_up);\n" +
            "        slideDown = findViewById(R.id.slide_down);\n" +
            "        rotate = findViewById(R.id.rotate);\n" +
            "        zoomIn = findViewById(R.id.zoom_in);\n" +
            "        zoomOut = findViewById(R.id.zoom_out);\n" +
            "        crossFade = findViewById(R.id.cross_fade);\n" +
            "        fadeIn = findViewById(R.id.fade_in);\n" +
            "        fadeOut = findViewById(R.id.fade_out);\n" +
            "        move = findViewById(R.id.move);\n" +
            "        bounce = findViewById(R.id.bounce);\n" +
            "        sequential = findViewById(R.id.sequential);\n" +
            "        stop = findViewById(R.id.stop);\n" +
            "\n" +
            "        blink.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        slideUp.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideup_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        slideDown.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidedown_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        zoomIn.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        zoomOut.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomout_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        crossFade.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.crossfade_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        fadeOut.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        fadeIn.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        move.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        bounce.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        sequential.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        rotate.setOnClickListener(v -> {\n" +
            "            // To add blink animation\n" +
            "            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);\n" +
            "            imageView.startAnimation(animation);\n" +
            "        });\n" +
            "        stop.setOnClickListener(v -> imageView.clearAnimation());\n" +
            "\n" +
            "    }\n";


    String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".animation_Activity\">\n" +
            "\n" +

            "    <RelativeLayout\n" +
            "\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "\n" +
            "        >\n" +
            "\n" +
            "        <ImageView\n" +
            "            android:id=\"@+id/imageview\"\n" +
            "            android:layout_width=\"80dp\"\n" +
            "            android:layout_height=\"80dp\"\n" +
            "            android:layout_centerHorizontal=\"true\"\n" +
            "            android:layout_marginTop=\"40dp\"\n" +
            "            android:contentDescription=\"@string/app_name\"\n" +
            "            android:src=\"@drawable/progress\" />\n" +
            "\n" +
            "        <ScrollView\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:layout_below=\"@id/imageview\"\n" +
            "            android:layout_marginTop=\"10dp\"\n" +
            "            android:scrollbars=\"none\">\n" +
            "\n" +
            "\n" +
            "            <RelativeLayout\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "\n" +
            "                <LinearLayout\n" +
            "                    android:id=\"@+id/linear1\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_marginTop=\"20dp\"\n" +
            "                    android:orientation=\"horizontal\"\n" +
            "                    android:weightSum=\"3\">\n" +
            "                    <!--Blink animation of the image-->\n" +
            "\n" +
            "\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/blink\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"BLINK\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "\n" +
            "                    <!--Slide Up animation of the image-->\n" +
            "\n" +
            "\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/slide_up\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"SLIDE UP\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "\n" +
            "                    <!--Slide Down animation of the image-->\n" +
            "\n" +
            "\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/slide_down\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"SLIDE DOWN\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "\n" +
            "\n" +
            "                </LinearLayout>\n" +
            "\n" +
            "\n" +
            "                <LinearLayout\n" +
            "                    android:id=\"@+id/linear2\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_below=\"@id/linear1\"\n" +
            "                    android:layout_marginTop=\"8dp\"\n" +
            "                    android:orientation=\"horizontal\"\n" +
            "                    android:weightSum=\"3\">                  <!--Rotate animation of the image-->\n" +
            "\n" +
            "\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/rotate\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"ROTATE\"\n" +
            "                        android:textColor=\"#FFFFFF\" />    <!--Zoom In animation of the image-->\n" +
            "\n" +
            "\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/zoom_in\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"ZOOM IN\"\n" +
            "                        android:textColor=\"#FFFFFF\" />                <!--Zoom Out animation of the image-->\n" +
            "\n" +
            "\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/zoom_out\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"ZOOM OUT\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "                </LinearLayout>\n" +
            "\n" +
            "                <LinearLayout\n" +
            "                    android:id=\"@+id/linear3\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_below=\"@id/linear2\"\n" +
            "                    android:layout_marginTop=\"8dp\"\n" +
            "                    android:orientation=\"horizontal\"\n" +
            "                    android:weightSum=\"3\">                  <!--Cross Fade animation of the image-->\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/cross_fade\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"CROSS FADE\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "                    <!--Fade In animation of the image-->\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/fade_in\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"FADE IN\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "                    <!--Fade out animation of the image-->\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/fade_out\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"FADE OUT\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "                </LinearLayout>\n" +
            "\n" +
            "\n" +
            "                <LinearLayout\n" +
            "                    android:id=\"@+id/linear4\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_below=\"@id/linear3\"\n" +
            "                    android:layout_marginTop=\"8dp\"\n" +
            "                    android:orientation=\"horizontal\"\n" +
            "                    android:weightSum=\"3\">     <!--Move animation of the image-->\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/move\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"MOVE\"\n" +
            "                        android:textColor=\"#FFFFFF\" /> <!--Bounce animation of the image-->\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/bounce\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"BOUNCE\"\n" +
            "                        android:textColor=\"#FFFFFF\" />       <!--Sequential animation of the image-->\n" +
            "                    <Button\n" +
            "                        android:id=\"@+id/sequential\"\n" +
            "                        android:layout_width=\"0dp\"\n" +
            "                        android:layout_height=\"wrap_content\"\n" +
            "                        android:layout_margin=\"2dp\"\n" +
            "                        android:layout_weight=\"1\"\n" +
            "                        android:background=\"#311b92\"\n" +
            "                        android:text=\"SEQUENTIAL\"\n" +
            "                        android:textColor=\"#FFFFFF\" />\n" +
            "                </LinearLayout>\n" +
            "                <!--To stop the animation of the image-->\n" +
            "                <Button\n" +
            "                    android:id=\"@+id/stop\"\n" +
            "                    android:layout_width=\"match_parent\"\n" +
            "                    android:layout_height=\"wrap_content\"\n" +
            "                    android:layout_below=\"@id/linear4\"\n" +
            "                    android:layout_marginLeft=\"30dp\"\n" +
            "                    android:layout_marginTop=\"10dp\"\n" +
            "                    android:layout_marginRight=\"30dp\"\n" +
            "                    android:layout_marginBottom=\"70dp\"\n" +
            "                    android:background=\"#E65100\"\n" +
            "                    android:text=\"Stop\"\n" +
            "                    android:textColor=\"#000000\" />\n" +
            "            </RelativeLayout>\n" +
            "\n" +
            "        </ScrollView>\n" +
            "\n" +
            "    </RelativeLayout>\n" +
            "\n" +
            "\n" +
            "</LinearLayout>";

    String other = "//You have to create 9 animation resource file(1>fade_in.xml,2>fade_out.xml)\n" +
            "    //All files are inside (res/anim/....)\n" +
            "\n" +
            "    //blink.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "    <alpha\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromAlpha=\"0.0\"\n" +
            "        android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "        android:repeatCount=\"infinite\"\n" +
            "        android:repeatMode=\"reverse\"\n" +
            "        android:toAlpha=\"1.0\" />\n" +
            "</set>\n" +

            "\n\n" +
            "    //slide_up.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "    <translate\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromYDelta=\"0\"\n" +
            "        android:toYDelta=\"-100%\" />\n" +
            "</set>\n" +
            "\n\n" +
            "    //slide_down.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "    <translate\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromYDelta=\"0\"\n" +
            "        android:toYDelta=\"100%\" />\n" +
            "</set>\n"+
            "\n\n"+
            "    //rotate.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\"\n" +
            "    >\n" +
            "<rotate\n" +
            "    android:duration=\"1000\"\n" +
            "    android:fromDegrees=\"0\"\n" +
            "    android:pivotY=\"50%\"\n" +
            "    android:pivotX=\"50%\"\n" +
            "    android:toDegrees=\"180\"/>\n" +
            "    <rotate\n" +
            "        android:duration=\"1000\"\n" +
            "        android:fromDegrees=\"180\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:toDegrees=\"0\" />\n" +
            "</set>\n"+
            "\n\n"+
            "    //zoom_in.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\">\n" +
            "<scale\n" +
            "    android:duration=\"2500\"\n" +
            "    android:fromYScale=\"1.0\"\n" +
            "    android:fromXScale=\"1.0\"\n" +
            "    android:toXScale=\"3.0\"\n" +
            "    android:toYScale=\"3.0\"\n" +
            "    android:pivotY=\"50%\"\n" +
            "    android:pivotX=\"50%\"/>\n" +
            "</set>\n"+
            "\n\n"+
            "    //zoom_out.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\">\n" +
            "    <scale\n" +
            "        android:duration=\"2500\"\n" +
            "        android:fromYScale=\"1.0\"\n" +
            "        android:fromXScale=\"1.0\"\n" +
            "        android:toXScale=\"0.2\"\n" +
            "        android:toYScale=\"0.2\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:pivotX=\"80%\"/>\n" +
            "</set>\n"+

            "\n\n"+
            "    //cross_fade.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\">\n" +
            "    <alpha\n" +
            "        android:duration=\"800\"\n" +
            "        android:fromAlpha=\"0.0\"\n" +
            "        android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "        android:toAlpha=\"1.0\" />\n" +
            "\n" +
            "    <alpha\n" +
            "        android:duration=\"1100\"\n" +
            "        android:fromAlpha=\"1.0\"\n" +
            "        android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "        android:toAlpha=\"0.0\" />\n" +
            "</set>\n"+
            "\n\n"+
            "    //fade_in.xml\n" +
            "\n" +
            "            <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "            <set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "                <alpha\n" +
            "                    android:duration=\"3000\"\n" +
            "                    android:fromAlpha=\"0.0\"\n" +
            "                    android:toAlpha=\"1.0\" />\n" +
            "            </set>\n" +
            "\n\n" +
            "    //fade_out.xml\n" +
            "\n" +
            "            <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "            <set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "                <alpha\n" +
            "                    android:duration=\"3000\"\n" +
            "                    android:fromAlpha=\"1.0\"\n" +
            "                    android:toAlpha=\"0.0\" />\n" +
            "            </set>\n" +
            "\n\n"+
            "    //move.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:interpolator=\"@android:anim/linear_interpolator\"\n" +
            "    android:fillAfter=\"true\">\n" +
            "<translate\n" +
            "    android:fromXDelta=\"0%p\"\n" +
            "    android:toXDelta=\"75%p\"\n" +
            "    android:duration=\"800\"/>\n" +
            "</set>\n" +
            "\n\n"+
            "    //bounce.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:interpolator=\"@android:anim/linear_interpolator\"\n" +
            "     android:fillAfter=\"true\"\n" +
            "    >\n" +
            "<scale\n" +
            "    android:duration=\"1000\"\n" +
            "    android:fromXScale=\"1.0\"\n" +
            "    android:toXScale=\"1.0\"\n" +
            "    android:fromYScale=\"0.0\"\n" +
            "    android:toYScale=\"1.0\"\n" +
            "\n" +
            "    />\n" +
            "</set>\n" +
            "\n\n"+
            "    //sequential.xml\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:fillAfter=\"true\"\n" +
            "    android:interpolator=\"@android:anim/linear_interpolator\">\n" +
            "    <translate\n" +
            "        android:duration=\"700\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromXDelta=\"0%p\"\n" +
            "        android:startOffset=\"300\"\n" +
            "        android:toXDelta=\"75%p\" />\n" +
            "\n" +
            "\n" +
            "    <translate\n" +
            "        android:duration=\"700\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromYDelta=\"0%p\"\n" +
            "        android:startOffset=\"1100\"\n" +
            "        android:toYDelta=\"70%p\" />\n" +
            "    <translate\n" +
            "        android:duration=\"700\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromXDelta=\"0%p\"\n" +
            "        android:startOffset=\"1900\"\n" +
            "        android:toXDelta=\"-75%p\" />\n" +
            "    <translate\n" +
            "        android:duration=\"700\"\n" +
            "        android:fillAfter=\"true\"\n" +
            "        android:fromYDelta=\"0%p\"\n" +
            "        android:startOffset=\"2700\"\n" +
            "        android:toYDelta=\"-70%p\" />\n" +
            "    <!-- Rotate 360 degrees -->\n" +
            "    <rotate\n" +
            "        android:duration=\"900\"\n" +
            "        android:fromDegrees=\"0\"\n" +
            "        android:interpolator=\"@android:anim/cycle_interpolator\"\n" +
            "        android:pivotX=\"50%\"\n" +
            "        android:pivotY=\"50%\"\n" +
            "        android:repeatCount=\"infinite\"\n" +
            "        android:repeatMode=\"restart\"\n" +
            "        android:startOffset=\"3800\"\n" +
            "        android:toDegrees=\"360\" />\n" +
            "\n" +
            "</set>\n ";
    String other_heading = "Manifest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);

        show_code_button = findViewById(R.id.code_button);
        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(animation_Activity.this, source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("Animation");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        imageView = findViewById(R.id.imageview);

        blink = findViewById(R.id.blink);
        slideUp = findViewById(R.id.slide_up);
        slideDown = findViewById(R.id.slide_down);
        rotate = findViewById(R.id.rotate);
        zoomIn = findViewById(R.id.zoom_in);
        zoomOut = findViewById(R.id.zoom_out);
        crossFade = findViewById(R.id.cross_fade);
        fadeIn = findViewById(R.id.fade_in);
        fadeOut = findViewById(R.id.fade_out);
        move = findViewById(R.id.move);
        bounce = findViewById(R.id.bounce);
        sequential = findViewById(R.id.sequential);
        stop = findViewById(R.id.stop);

        blink.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
            imageView.startAnimation(animation);
        });
        slideUp.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideup_animation);
            imageView.startAnimation(animation);
        });
        slideDown.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slidedown_animation);
            imageView.startAnimation(animation);
        });
        zoomIn.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin_animation);
            imageView.startAnimation(animation);
        });
        zoomOut.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomout_animation);
            imageView.startAnimation(animation);
        });
        crossFade.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.crossfade_animation);
            imageView.startAnimation(animation);
        });
        fadeOut.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout_animation);
            imageView.startAnimation(animation);
        });
        fadeIn.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein_animation);
            imageView.startAnimation(animation);
        });
        move.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_animation);
            imageView.startAnimation(animation);
        });
        bounce.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);
            imageView.startAnimation(animation);
        });
        sequential.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_animation);
            imageView.startAnimation(animation);
        });
        rotate.setOnClickListener(v -> {
            // To add blink animation
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
            imageView.startAnimation(animation);
        });
        stop.setOnClickListener(v -> imageView.clearAnimation());

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
}