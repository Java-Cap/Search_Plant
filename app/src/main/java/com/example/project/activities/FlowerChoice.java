package com.example.project.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.R;
import com.example.project.constants.Flower;
import com.example.project.entity.SearchPlant;

public class FlowerChoice extends AppCompatActivity {

        private ImageButton dvoenoe;
        private ImageButton prostoe;
        private ImageButton razdelinoe;
        private ImageButton none;

        private SearchPlant plantForSearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_choice);

        dvoenoe = findViewById(R.id.oval);
        prostoe = findViewById(R.id.bukov);
        razdelinoe = findViewById(R.id.fern);
        none = findViewById(R.id.none3);

        Bundle bundleIntent = getIntent().getExtras();

        plantForSearch = (SearchPlant) bundleIntent.getSerializable(SearchPlant.class.getSimpleName());
    }


    public void nextActivityFruitChoiceDvoenoe(View v){

        Intent intent = new Intent(FlowerChoice.this, FruitChoice.class);
        plantForSearch.setFlower(Flower.ДвойнымОколцетвованием);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);

    }

    public void nextActivityFruitChoiceProstoe(View v){

        Intent intent = new Intent(FlowerChoice.this, FruitChoice.class);
        plantForSearch.setFlower(Flower.ПростымОколцетвованием);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);

    }

    public void nextActivityFruitChoiceRazdelinoe(View v){

        Intent intent = new Intent(FlowerChoice.this, FruitChoice.class);
        plantForSearch.setFlower(Flower.РаздельноПростымОколцетвованием);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);

    }

    public void nextActivityFruitChoiceNone(View v){

        Intent intent = new Intent(FlowerChoice.this, FruitChoice.class);
        plantForSearch.setFlower(Flower.Нету);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);

    }
}