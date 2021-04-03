package com.example.multiple_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btFunction(View view) {
        Fragment myFragment;

        if(view.getId() == R.id.bdFrId){
            myFragment = new BdFragment();
        }
        else{
            myFragment = new InFragment();
        }

        FragmentManager fn = getSupportFragmentManager();
        FragmentTransaction ft = fn.beginTransaction();
        ft.replace(R.id.myFragId,myFragment);
        ft.commit();
    }
}