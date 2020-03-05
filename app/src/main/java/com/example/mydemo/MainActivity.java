package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mydemo.adp.adp;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<adp>myList = new ArrayList<>();
        myList.add(new adp("Order no ","Order Date","Status" ));
        myList.add(new adp("Order no ","Order Date","Status" ));
        myList.add(new adp("Order no ","Order Date","Status" ));
    }
}
