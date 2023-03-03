package com.example.learnandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class TabLearn extends Fragment  {

    public TabLearn() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_tab_learn ,container, false);

        CardView introduction_card = (CardView) view.findViewById(R.id.cardview_introduction);
        CardView lesson_card = (CardView) view.findViewById(R.id.cardview_lesson);
        CardView interview_card = (CardView) view.findViewById(R.id.cardview_interview);
        CardView shoetcuts_card = (CardView) view.findViewById(R.id.cardview_quiz);
        CardView plugins_card = (CardView) view.findViewById(R.id.cardview_tips);
        CardView share_card = (CardView) view.findViewById(R.id.cardview_share);
        CardView contact_card = (CardView) view.findViewById(R.id.cardview_contact);
        CardView course_card = (CardView) view.findViewById(R.id.cardview_courses);


        introduction_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =   new Intent(getContext(),introduction.class);
                startActivity(intent);

            }
        });
        course_card.setOnClickListener(view1 -> {

            Intent intent =   new Intent(getContext(),course_codelab_in_LESSON.class);
            startActivity(intent);
        });
        lesson_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =   new Intent(getContext(),lessons_activity.class);
                startActivity(intent);

            }
        });
        interview_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =   new Intent(getContext(),interview_QA.class);
                startActivity(intent);

            }
        });
        shoetcuts_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =   new Intent(getContext(),keyboard_SHORTCUTS.class);
                startActivity(intent);

            }
        });
        plugins_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =   new Intent(getContext(),awesome_PLUGIN.class);
                startActivity(intent);

            }
        });
        share_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                String app_url = " https://www.instagram.com/_mohitjangra_19/";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
        contact_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String contact = "+918307251891"; // Replace with the desired number
                String url = "https://api.whatsapp.com/send?phone=" + contact;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        return view;
    }

}