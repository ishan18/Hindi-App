package com.example.android.hindiapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Family extends Fragment {

    WordAdapter itemsAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.activity_colours,container,false);

        final ArrayList<Word> family=new ArrayList<>();
        family.add(new Word("Father","Papa",R.drawable.father,R.raw.family_father));
        family.add(new Word("Mother","Maa",R.drawable.mother,R.raw.family_mother));
        family.add(new Word("Brother","Bhai",R.drawable.brother,R.raw.family_older_brother));
        family.add(new Word("Sister","Behen",R.drawable.sister,R.raw.family_younger_sister));
        family.add(new Word("Son","Beta",R.drawable.son,R.raw.family_son));
        family.add(new Word("Daughter","Beti",R.drawable.daughter,R.raw.family_daughter));
        family.add(new Word("Grand Father","Dada",R.drawable.grandfather,R.raw.family_grandfather));
        family.add(new Word("Grand Mother","Dadi",R.drawable.grandmother,R.raw.family_grandmother));

        itemsAdapter = new WordAdapter(getActivity(),family,R.color.Blue);

        ListView listView =(ListView)rootView.findViewById(R.id.list);
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
