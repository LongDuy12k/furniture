package com.example.furniture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.furniture.model.Funiture;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if (bundle == null){
            return;
        }
        Funiture funiture = (Funiture) bundle.get("");
        TextView Texxx = findViewById(R.id.Texxx);
        Texxx.setText(funiture.getUsefu());

    }
}