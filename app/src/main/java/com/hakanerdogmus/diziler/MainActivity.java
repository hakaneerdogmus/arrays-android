package com.hakanerdogmus.diziler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//diziler

        String[] myStringArray = new String[3];

        myStringArray[0] = "Hakan";
        myStringArray[1] = "Erdoğmuş";
        myStringArray[2] = "Emine";

        int[] myIntegreArray = new int[3];
        myIntegreArray[0] = 23;
        myIntegreArray[1] = 25;
        myIntegreArray[2] = 22;

        System.out.println(myStringArray[0] + " " + myIntegreArray[0]);
        System.out.println(myStringArray[1] + " " + myIntegreArray[1]);
        System.out.println(myStringArray[2] + " " + myIntegreArray[2]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8,9,};
        System.out.println(myNumberArray[2] );


    }
}