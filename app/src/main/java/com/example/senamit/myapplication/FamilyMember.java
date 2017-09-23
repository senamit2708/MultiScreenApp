package com.example.senamit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMember extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);


        ListView listView = (ListView)findViewById(R.id.listview_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","Papa", R.drawable.family_father));
        words.add(new Word("Mother","Maa",R.drawable.family_mother));
        words.add(new Word("Sister","Bahan",R.drawable.family_older_sister));
        words.add(new Word("grand Father","Dada", R.drawable.family_grandfather));
        words.add(new Word("grand Mother","Dadi",R.drawable.family_grandmother));
        words.add(new Word("younger Brother","Chotha Bhai",R.drawable.family_younger_brother));
        words.add(new Word("younger Sister","Chotha Bahan",R.drawable.family_younger_sister));
        words.add(new Word("son","Beta",R.drawable.family_son));
        words.add(new Word("daughter","beti",R.drawable.family_daughter));





        WordAdapter wordAdapter = new WordAdapter(this,words );

        listView.setAdapter(wordAdapter);


    }
}
