package com.redwood2magnet.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdepter;
    private RecyclerView.LayoutManager mlayoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 7","Line 8"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 9","Line 10"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 11","Line 12"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 13","Line 14"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 15","Line 16"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 17","Line 18"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 19","Line 20"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 21","Line 22"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 23","Line 24"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 25","Line 26"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 27","Line 28"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 29","Line 30"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 31","Line 32"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 33","Line 34"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 35","Line 36"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 37","Line 38"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 39","Line 40"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 41","Line 42"));
        exampleList.add(new ExampleItem(R.drawable.a1,"Line 43","Line 44"));
        exampleList.add(new ExampleItem(R.drawable.a2,"Line 45","Line 46"));
        exampleList.add(new ExampleItem(R.drawable.a3,"Line 47","Line 48"));

        mRecyclerView= findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mlayoutmanager= new LinearLayoutManager(this);
        mAdepter = new ExampleAdepter(exampleList);

        mRecyclerView.setLayoutManager(mlayoutmanager);
        mRecyclerView.setAdapter(mAdepter);

    }
}
