package com.example.project.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.R;
import com.example.project.constants.Crown;
import com.example.project.entity.SearchPlant;

public class CrownChoice extends AppCompatActivity  {

    private SearchPlant plantForSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crown_choice);

        Bundle bundleIntent = getIntent().getExtras();

        plantForSearch = (SearchPlant) bundleIntent.getSerializable(SearchPlant.class.getSimpleName());


    }

    public void nextActivityLeafChoiceOval(View view){

        Intent intent = new Intent(CrownChoice.this, LeafChoice.class);
        plantForSearch.setCrown(Crown.Овальная);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityLeafChoiceConus(View view){

        Intent intent = new Intent(CrownChoice.this, LeafChoice.class);
        plantForSearch.setCrown(Crown.Конусная);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityLeafChoiceRaskidostay(View view){

        Intent intent = new Intent(CrownChoice.this, LeafChoice.class);
        plantForSearch.setCrown(Crown.Раскидастая);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityLeafChoiceNone(View view){

        Intent intent = new Intent(CrownChoice.this, LeafChoice.class);
        plantForSearch.setCrown(Crown.Нету);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }
}