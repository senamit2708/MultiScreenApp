package com.example.senamit.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    ListView listView;
//    String[] words={"one","two","three","four"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


//        ArrayList words = new ArrayList<String>( ); //might be some changes needed here
//
//        words.add("one");
//        words.add("two");
//        words.add("four");


//    listView = (ListView)findViewById(R.id.listView_number);
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//
//       listView.setAdapter(arrayAdapter);

        //using custom class object instead of any specific datatype....because we r going to insert here two strings

        ArrayList<Word> words = new ArrayList<Word>();

//        Word w = new Word("One", "Ek");
//        words.add(w);

        words.add(new Word("one","ek", R.drawable.number_one));
        words.add(new Word("two","do",R.drawable.number_two));
        words.add(new Word("three","tin",R.drawable.number_three));
        words.add(new Word("four","char",R.drawable.number_four));

        //now we r going to use our own layout for list item

        listView = (ListView)findViewById(R.id.listView_number);

//        ArrayAdapter<Word> arrayAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
        WordAdapter wordAdapter = new WordAdapter(this, words);

        listView.setAdapter(wordAdapter);
    }
}
