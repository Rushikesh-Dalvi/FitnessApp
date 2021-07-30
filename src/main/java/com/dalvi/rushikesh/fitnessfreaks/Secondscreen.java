package com.dalvi.rushikesh.fitnessfreaks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Secondscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstFragment firstFragment=new FirstFragment();
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.fl,firstFragment).commit();

        SecondFragment sf=new SecondFragment();
        fm.beginTransaction().add(R.id.fl,sf).
                setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right)
                .commit();
    }

}
