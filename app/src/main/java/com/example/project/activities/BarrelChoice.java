package com.example.project.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.R;
import com.example.project.constants.Barrel;
import com.example.project.entity.SearchPlant;

public class BarrelChoice extends AppCompatActivity {

    private SearchPlant plantForSearch = new SearchPlant();

    private ImageButton ball;
    private ImageButton rebristui;
    private ImageButton krulo;
    private ImageButton none;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrel_choice);

        ball = findViewById(R.id.kruglui);
        rebristui = findViewById(R.id.bukov);
        krulo = findViewById(R.id.fern);
        none = findViewById(R.id.none5);
    }

    public void nextActivityLeafChoiceBall(View v){

        Intent intent = new Intent(BarrelChoice.this, CrownChoice.class);

        plantForSearch.setBarrel(Barrel.Округлый);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityLeafChoiceRebristui(View v){

        Intent intent = new Intent(BarrelChoice.this, CrownChoice.class);

        plantForSearch.setBarrel(Barrel.Ребристый);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityLeafChoiceKrulo(View v){

        Intent intent = new Intent(BarrelChoice.this, CrownChoice.class);

        plantForSearch.setBarrel(Barrel.Крылатый);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityLeafChoiceNone(View v){

        Intent intent = new Intent(BarrelChoice.this, CrownChoice.class);

        plantForSearch.setBarrel(Barrel.Нету);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }
}