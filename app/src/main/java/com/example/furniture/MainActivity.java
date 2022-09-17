package com.example.furniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.furniture.adapter.FunitureAdapter;
import com.example.furniture.model.Funiture;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView furnitureI;
    private ImageView imageView5;
    private SearchView search;
    private ImageView imageView6;
    private RecyclerView rcView;
    RecyclerView recyclerView;
    List<Funiture> list = new ArrayList<>();
    FunitureAdapter funitureAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcView = findViewById(R.id.rcView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcView.setLayoutManager(gridLayoutManager);

        funitureAdapter = new FunitureAdapter(this,getListUser());
//        list = addData();
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        funitureAdapter = new FunitureAdapter(this,list);
        rcView.setAdapter(funitureAdapter);
//        furnitureI = (TextView) findViewById(R.id.furniture_i);
//        imageView5 = (ImageView) findViewById(R.id.imageView5);
//        search = (SearchView) findViewById(R.id.search);
//        imageView6 = (ImageView) findViewById(R.id.imageView6);
//        rcView = (RecyclerView) findViewById(R.id.rcView);
//
//        rcView.setLayoutManager(new GridLayoutManager(this,2));


    }

    private List<Funiture> getListUser() {

        List<Funiture> list = new ArrayList<>();
        list.add(new Funiture(R.drawable.rectangle3, "Minimilistic  design sofa set"));
        list.add(new Funiture(R.drawable.rectangle4, "Minimilistic  design sofa set"));
        list.add(new Funiture(R.drawable.rectangle5, "Minimilistic  design sofa set"));
        list.add(new Funiture(R.drawable.rectangle6, "Minimilistic  design sofa set"));
        list.add(new Funiture(R.drawable.rectangle7, "Minimilistic  design sofa set"));
        list.add(new Funiture(R.drawable.rectangle8, "Minimilistic  design sofa set"));
        return list;
    }

//    private List<Funiture> addData(){
//        list.add(new Funiture(R.drawable.rectangle3, "Minimilistic  design sofa set"));
//        list.add(new Funiture(R.drawable.rectangle4, "Minimilistic  design sofa set"));
//        list.add(new Funiture(R.drawable.rectangle5, "Minimilistic  design sofa set"));
//        list.add(new Funiture(R.drawable.rectangle6, "Minimilistic  design sofa set"));
//        list.add(new Funiture(R.drawable.rectangle7, "Minimilistic  design sofa set"));
//        list.add(new Funiture(R.drawable.rectangle8, "Minimilistic  design sofa set"));
//
//        return list;
//}
    }