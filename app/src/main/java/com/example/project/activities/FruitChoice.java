package com.example.project.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.R;
import com.example.project.constants.Fruit;
import com.example.project.entity.SearchPlant;

public class FruitChoice extends AppCompatActivity {

        private ImageButton sheludi;
        private ImageButton apples;
        private ImageButton manyoreshek;
        private ImageButton none;

        private SearchPlant plantForSearch;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_choice);

        sheludi = findViewById(R.id.oval);
        apples = findViewById(R.id.bukov);
        manyoreshek = findViewById(R.id.fern);
        none = findViewById(R.id.none2);

        Bundle bundleIntent = getIntent().getExtras();

        plantForSearch = (SearchPlant) bundleIntent.getSerializable(SearchPlant.class.getSimpleName());
    }

    public void nextActivityEndChoiceSheludi(View v){

        Intent intent = new Intent(FruitChoice.this, EndChoice.class);
        plantForSearch.setFruit(Fruit.Жёлудь);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityEndChoiceApples(View v){

        Intent intent = new Intent(FruitChoice.this, EndChoice.class);
        plantForSearch.setFruit(Fruit.Яблоко);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityEndChoiceManyoreshek(View v){

        Intent intent = new Intent(FruitChoice.this, EndChoice.class);
        plantForSearch.setFruit(Fruit.Многоорешек);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }

    public void nextActivityEndChoiceNone(View v){

        Intent intent = new Intent(FruitChoice.this, EndChoice.class);
        plantForSearch.setFruit(Fruit.Нету);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }
}