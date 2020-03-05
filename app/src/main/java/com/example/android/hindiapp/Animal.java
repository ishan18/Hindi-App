package com.example.android.hindiapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Animal extends Fragment {

    WordAdapter itemsAdapter;
    ArrayList<Word> animal;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.activity_colours,container,false);

        animal=new ArrayList<>();
        animal.add(new Word("Lion","Sher",R.drawable.lion,R.raw.color_white));
        animal.add(new Word("Horse","Ghora",R.drawable.horse,R.raw.color_white));
        animal.add(new Word("Cow","Guy",R.drawable.cow,R.raw.color_white));
        animal.add(new Word("Monkey","Bandar",R.drawable.monkey,R.raw.color_white));
        animal.add(new Word("Elephant","Haathi",R.drawable.elephant,R.raw.color_white));
        animal.add(new Word("Tiger","Baagh",R.drawable.tiger,R.raw.color_white));
        animal.add(new Word("Wolf","Bheriya",R.drawable.wolf,R.raw.color_white));
        animal.add(new Word("Dog","Kutta",R.drawable.dog,R.raw.color_white));
        animal.add(new Word("Fox","Lomri",R.drawable.fox,R.raw.color_white));
        animal.add(new Word("Cat","Billi",R.drawable.cat,R.raw.color_white));

        itemsAdapter = new WordAdapter(getActivity(),animal,R.color.Purple);

        ListView listView =(ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }


    @Override
    public void onStop() {
        super.onStop();
            itemsAdapter.releaseMediaPlayer();

    }

    @Override
    public void onPause(){
        super.onPause();
        itemsAdapter.releaseMediaPlayer();
    }
}