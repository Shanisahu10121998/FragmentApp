package com.example.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class SecondFragment extends Fragment {
    View view;
    Button secButton;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        //Inflate the layout for this  fragment
        view=inflater.inflate(R.layout.fragment_simple_sec,container,false);
        // get the reference of button
        secButton=view.findViewById(R.id.button);
        //perform setonclicklistner on first button
        secButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a message by using a toast
                Toast.makeText(getActivity(), "Fragment,s Second", Toast.LENGTH_SHORT).show();

            }

        });
        return  view;
    }

}
