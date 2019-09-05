package com.example.fragmentapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity {
    Button buttonFirstFragment, buttonSecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonFirstFragment = findViewById(R.id.firstFragment);
        buttonSecondFragment = findViewById(R.id.secondFragment);
        //perform setOnClickListner event on buttonFirstFragment
        buttonFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Main2Activity.this, " Chalti kya", Toast.LENGTH_SHORT).show();
                loadFragment(new FirstFragment());
            }
        });
        buttonSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());
            }
        });
    }


    private void loadFragment(Fragment fragment) {
        //create a FragmentManager
        FragmentManager fragmentManager = getFragmentManager();
        //create a

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
