package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mydemo.adp.adp;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycler;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mManager;

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
