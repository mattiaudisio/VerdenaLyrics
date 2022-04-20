package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class CanzoniActivity extends AppCompatActivity {

    ArrayList<Canzone> arrayCanzoni = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canzoni);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewCanzoni);
        CanzoniAdapter adapter = new CanzoniAdapter(this,arrayCanzoni);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1, RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    public void setArrayCanzoni(ArrayList<Canzone> arrayC){
        arrayCanzoni = arrayC;
    }
}