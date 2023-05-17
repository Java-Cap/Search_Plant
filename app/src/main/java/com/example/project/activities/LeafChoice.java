package com.example.project.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.R;
import com.example.project.constants.Leaf;
import com.example.project.entity.SearchPlant;

public class LeafChoice extends AppCompatActivity {

    private SearchPlant plantForSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaf_choice);

        Bundle bundleIntent = getIntent().getExtras();
        plantForSearch = (SearchPlant) bundleIntent.getSerializable(SearchPlant.class.getSimpleName());
    }

    public void nextActivityFlowerChoiceOval(View v){

        Intent intent = new Intent( LeafChoice.this, FlowerChoice.class);
        plantForSearch.setLeaf(Leaf.Овальный);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityFlowerChoiceBukov(View v){

        Intent intent = new Intent( LeafChoice.this, FlowerChoice.class);
        plantForSearch.setLeaf(Leaf.Буковый);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityFlowerChoiceFern(View v){

        Intent intent = new Intent( LeafChoice.this, FlowerChoice.class);
        plantForSearch.setLeaf(Leaf.Папоротниковый);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityFlowerChoiceNone(View v){

        Intent intent = new Intent( LeafChoice.this, FlowerChoice.class);
        plantForSearch.setLeaf(Leaf.Нету);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }
}