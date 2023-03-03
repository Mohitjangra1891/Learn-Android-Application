//package com.example.learnandroid;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class tab_learn_listview_Adapter extends BaseAdapter {
//
//    Context context;
//    int[] images;
//    String[] texts;
//    LayoutInflater inflater;
//
//    public tab_learn_listview_Adapter(Context context,  String[] texts,int[]images) {
//        this.context = context;
//        this.images = images;
//        this.texts = texts;
//        inflater = (LayoutInflater.from(context.getApplicationContext()));
//    }
//
//
//    @Override
//    public int getCount() {
//        return texts.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(final int position, View view, ViewGroup parent) {
//        view = inflater.inflate(R.layout.custom_listview_layout, null);
//
//        ImageView imageView = view.findViewById(R.id.image_custom_listview_item);
//        TextView textView = view.findViewById(R.id.name_custom_listview_item);
//
//        imageView.setImageResource(images[position]);
//
//        textView.setText(texts[position]);
////
////        view.setOnClickListener(v -> {
////
////            switch (position) {
////                case 0:
////                    Toast.makeText(context.getApplicationContext(), "Item One", Toast.LENGTH_SHORT).show();
////                    break;
////                case 1:
////                    Toast.makeText(context.getApplicationContext(), "Item two", Toast.LENGTH_SHORT).show();
////                    break;
////                case 2:
////                    Toast.makeText(context.getApplicationContext(), "Item Three", Toast.LENGTH_SHORT).show();
////                    break;
////                case 3:
////                    Toast.makeText(context.getApplicationContext(), "Item Four", Toast.LENGTH_SHORT).show();
////                    break;
////                case 4:
////                    Toast.makeText(context.getApplicationContext() ,"Item Five", Toast.LENGTH_SHORT).show();
////                    break;
////                case 5:
////                    Toast.makeText(context.getApplicationContext(), "Item Six", Toast.LENGTH_SHORT).show();
////
//
//                    /* Tip :-
//                     *
//                     * If you need to use Intent, Try this code.
//                     *
//                     * Intent intent = new Intent(context,Example.class);
//                     * context.startActivity(intent);
//                     * */
////            }
////        });
//
//        return view;
//    }
//}