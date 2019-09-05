package com.example.fragmentapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FirstFragment extends Fragment {
    View view;
    Button firstButtonOne;


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        //Inflate the layout for this  fragment
        view=inflater.inflate(R.layout.fragment_simple_first,container,false);
        // get the reference of button
        firstButtonOne=view.findViewById(R.id.textView2);
        //perform setonclicklistner on first button
        firstButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a message by using a toast
                Toast.makeText(getActivity(), "Fragment,s First", Toast.LENGTH_SHORT).show();

            }

        });
        return  view;
    }
}
