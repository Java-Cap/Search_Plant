package com.example.project.activities;

import static com.example.project.constants.Barrel.Крылатый;
import static com.example.project.constants.Barrel.Округлый;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.project.R;
import com.example.project.constants.Crown;
import com.example.project.constants.Flower;
import com.example.project.constants.Fruit;
import com.example.project.constants.Leaf;
import com.example.project.entity.Plant;
import com.example.project.entity.SearchPlant;

import java.util.ArrayList;
import java.util.List;

public class EndChoice extends AppCompatActivity {

    private SearchPlant plantForSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_choice);


        Bundle bundleIntent = getIntent().getExtras();

        plantForSearch = (SearchPlant) bundleIntent.getSerializable(SearchPlant.class.getSimpleName());
    }


    public void nextActivityDiscriptionConfirm(View v){

        Intent intent = new Intent(EndChoice.this, Description.class);

        intent.putExtra(SearchPlant.class.getSimpleName(), plantForSearch);

        startActivity(intent);
    }
}