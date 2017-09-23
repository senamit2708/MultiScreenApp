package com.example.senamit.myapplication;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senamit on 17/9/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

//    public WordAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Word> objects) {
//        super(context, resource, objects);
//    }

    public WordAdapter(Context context, ArrayList<Word> word){
        super(context, 0,   word);


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Word word = getItem(position);

        TextView txtEnglish = (TextView)listItemView.findViewById(R.id.txtEnglish);
        txtEnglish.setText(word.getmDefaultTranslation());

        TextView txtMiswop = (TextView)listItemView.findViewById(R.id.txtMiswop);
        txtMiswop.setText(word.getmMiswapTranslation());


        ImageView images = (ImageView)listItemView.findViewById(R.id.image);
        images.setImageResource(word.getmImage());


        return listItemView;
    }
}
