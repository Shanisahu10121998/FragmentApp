package com.example.fragmentapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import androidx.annotation.Nullable;

public class SimpleFragment extends Fragment {
    View view;
    Button firstButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      //Inflate the layout for this  fragment
       view=inflater.inflate(R.layout.fragment_simple,container,false);
       // get the reference of button
        firstButton=view.findViewById(R.id.firstButton);
        //perform setonclicklistner on first button
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           // display a message by using a toast
                Toast.makeText(getActivity(), "Fragment,s Button", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }

        });
        return  view;
    }
}
