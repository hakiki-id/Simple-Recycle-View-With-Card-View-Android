package com.hakiki95.ricycleviewcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RecycleLayout;
    private RecyclerView.LayoutManager ActorManager;
    private RecyclerView.Adapter ActorAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecycleLayout = (RecyclerView) findViewById(R.id.recycleView);

        ArrayList<Actors> listItem = new ArrayList<Actors>();
        listItem.add(new Actors(R.drawable.eart,"Bumi","3000"));
        listItem.add(new Actors(R.drawable.kamera,"Kamera DSLR","10000"));
        listItem.add(new Actors(R.drawable.kantor,"Kantor Camat","3400"));
        listItem.add(new Actors(R.drawable.kue,"Kue Ulang Tahun","4000"));
        listItem.add(new Actors(R.drawable.lencana,"Lencana Desa","8900"));
        listItem.add(new Actors(R.drawable.topi,"Topi Sarjana","6000"));

        ActorManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        RecycleLayout.setLayoutManager(ActorManager);

        ActorAdapter = new ActorsAdapter(listItem);

        RecycleLayout.setAdapter(ActorAdapter);

    }
}
