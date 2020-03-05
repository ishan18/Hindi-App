package com.example.android.hindiapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends Fragment {

    WordAdapter itemsAdapter;

    @Override
    public void onStop() {
        super.onStop();
        itemsAdapter.releaseMediaPlayer();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.activity_colours,container,false);

        final ArrayList<Word> num=new ArrayList<>();
        num.add(new Word("One","Ek",R.drawable.one,R.raw.number_one));
        num.add(new Word("Two","Do",R.drawable.two,R.raw.number_one));
        num.add(new Word("Three","Teen",R.drawable.three,R.raw.number_one));
        num.add(new Word("Four","Chaar",R.drawable.four,R.raw.number_one));
        num.add(new Word("Five","Paanch",R.drawable.five,R.raw.number_one));
        num.add(new Word("Six","Che",R.drawable.six,R.raw.number_one));
        num.add(new Word("Seven","Saat",R.drawable.seven,R.raw.number_one));
        num.add(new Word("Eight","Aanth",R.drawable.eight,R.raw.number_one));
        num.add(new Word("Nine","Naw",R.drawable.nine,R.raw.number_one));
        num.add(new Word("Ten","Dus",R.drawable.ten,R.raw.number_one));

        itemsAdapter = new WordAdapter(getActivity(),num,R.color.Green);

        final ListView listView =rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

    @Override
    public void onPause(){
        super.onPause();
        itemsAdapter.releaseMediaPlayer();
    }
}
