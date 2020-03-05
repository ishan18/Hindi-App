package com.example.android.hindiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int tabIcon[]={R.drawable.father,R.drawable.blue,R.drawable.one,R.drawable.tiger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PageAdapter pageAdapter=new PageAdapter(getSupportFragmentManager());
        ViewPager viewPager=(ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(pageAdapter);

        TabLayout tabLayout=(TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        for(int i=0;i< tabIcon.length;i++)
            tabLayout.getTabAt(i).setIcon(tabIcon[i]);
    }
}
