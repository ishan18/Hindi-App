package com.example.android.hindiapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Colours extends Fragment {

    ArrayList<Word> colour=new ArrayList<>();
    WordAdapter itemsAdapter;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.activity_colours,container,false);

        colour.add(new Word("Red","Laal",R.drawable.red,R.raw.color_red));
        colour.add(new Word("Blue","Neela",R.drawable.blue,R.raw.color_red));
        colour.add(new Word("Yellow","Peela",R.drawable.yellow,R.raw.color_red));
        colour.add(new Word("Green","Hara",R.drawable.green,R.raw.color_red));
        colour.add(new Word("Purple","Baingani",R.drawable.purple,R.raw.color_red));
        colour.add(new Word("Brown","Bhura",R.drawable.brown,R.raw.color_red));
        colour.add(new Word("Pink","Gulabi",R.drawable.pink,R.raw.color_red));
        colour.add(new Word("Orange","Narangi",R.drawable.orange,R.raw.color_red));
        colour.add(new Word("Black","Kala",R.drawable.black,R.raw.color_red));
        colour.add(new Word("White","Ujjla",R.drawable.white,R.raw.color_red));
        itemsAdapter= new WordAdapter(getActivity(),colour,R.color.Yellow);

        listView=rootView.findViewById(R.id.list);
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
