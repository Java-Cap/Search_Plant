package com.example.project.activities;

import static com.example.project.constants.Barrel.Крылатый;
import static com.example.project.constants.Barrel.Нету;
import static com.example.project.constants.Barrel.Округлый;
import static com.example.project.constants.Barrel.Ребристый;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project.R;
import com.example.project.constants.Barrel;
import com.example.project.constants.Crown;
import com.example.project.constants.Flower;
import com.example.project.constants.Fruit;
import com.example.project.constants.Leaf;
import com.example.project.entity.Plant;
import com.example.project.entity.SearchPlant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Description extends AppCompatActivity {

    private ImageView testDub;
    private ImageButton back;
    private String string;
    private TextView test;
    private TextView tests;
    private TextView badResul;
    private List <Plant>plants = new ArrayList();

    private SearchPlant plantForSearch;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        back = findViewById(R.id.back);
        test = findViewById(R.id.test);
        tests = findViewById(R.id.tests);
        badResul = findViewById(R.id.bad_resul);
        testDub = findViewById(R.id.testDub);

        Bundle bundleIntent = getIntent().getExtras();
        plantForSearch = (SearchPlant) bundleIntent.getSerializable(SearchPlant.class.getSimpleName());


        makeCollection();
        Plant plant = search(plantForSearch);

       if(plant == null){
           badResul.setText("По вашему описанию ничего не нашлось.");
           testDub.setBackgroundResource(R.drawable.thress_questions);
       } else {
           string = plant.getTitle();
           tests();
           test.setText(  plant.getDescription());
           tests.setText( plant.getTitle() );

       }

    }

    private void tests(){
       if(string.equals("Дуб"))             { testDub.setBackgroundResource(R.drawable.dub);                }
       if(string.equals("Яблоня"))          { testDub.setBackgroundResource(R.drawable.yablona);            }
       if(string.equals("Груша"))           { testDub.setBackgroundResource(R.drawable.grusha);             }
       if(string.equals("Земляника"))       { testDub.setBackgroundResource(R.drawable.zemlynika);          }
       if(string.equals("Сон трава"))       { testDub.setBackgroundResource(R.drawable.son_trava);          }
       if(string.equals("Кочедыжник"))      { testDub.setBackgroundResource(R.drawable.kochedrushnik);      }
       if(string.equals("Щитовник"))        { testDub.setBackgroundResource(R.drawable.shitovnik);          }
       if(string.equals("Рябина"))          { testDub.setBackgroundResource(R.drawable.rybina);             }
       if(string.equals("Берёза плакучая")) { testDub.setBackgroundResource(R.drawable.bereza_plakuchay);   }
       if(string.equals("Тюлпан"))          { testDub.setBackgroundResource(R.drawable.tulpan);             }
    }





    private void makeCollection(){
        plants.add(new Plant(1, "Дуб", Округлый, Leaf.Буковый, Flower.Нету, Fruit.Жёлудь, Crown.Овальная, "", "\n" + "Семейство Буковых." + "\n" + "Крупные, плотные деревья." + "\n" + "\n" + " Жёлуди раньше применяли для приготовления напитка (аналог кофе), Выпечки хлеба. Сейчас используется как корм для животных"));
        plants.add(new Plant(2, "Яблоня", Округлый, Leaf.Овальный, Flower.ДвойнымОколцетвованием, Fruit.Яблоко, Crown.Овальная, "", "\n" + "Семейство Розовые." + "\n" + "Деревья с развесистой кроной" + "\n \n" + "Яблоки применяються для приготовленния варенья, пастилы. Из кожуры яблок готовят чай со способностью снимать отеки, воспаления."));
        plants.add(new Plant(3, "Груша", Округлый, Leaf.Овальный, Flower.ПростымОколцетвованием, Fruit.Яблоко, Crown.Овальная, "", "\n" + "Семейство Розовые." + "\n" + "Деревья различного размера, порой крупные кустарники." + "\n \n" + "Груши применяються для приготовленния варенья, салатов, печенья. Груша полезна для работы легких."));
        plants.add(new Plant(4, "Земляника", Округлый, Leaf.Овальный, Flower.ПростымОколцетвованием, Fruit.Многоорешек, Crown.Нету, "", "\n" + "Семейство Розовые." + "\n" + "Ползучие растение способное к вегетативному размножению" + "\n \n" + "Землянику применяют для приготовленния варенья, джемы, желе. Земляника  расширяет кровеносные сосуды, регулирует обмен веществ."));
        plants.add(new Plant(5, "Сон трава", Крылатый, Leaf.Нету, Flower.ПростымОколцетвованием, Fruit.Многоорешек, Crown.Нету, "", "\n" + "Семейство Лютиковые." + "\n" + "Корневые листья на длинных, не густо волосистых черешках." + "\n \n" + "Сон траву применяют как успокаивающее и снотворное средство. Отвар травы пьют в малых дозах при кашле и женских заболеваниях."));
        plants.add(new Plant(5, "Что то", Округлый, Leaf.Овальный, Flower.ПростымОколцетвованием, Fruit.Жёлудь, Crown.Овальная, "", ""));
        plants.add(new Plant(6, "Кочедыжник", Крылатый, Leaf.Папоротниковый, Flower.Нету, Fruit.Нету, Crown.Нету, "", "\n" + "Семейство Кочедыжниковые." + "\n" + "Толстое и короткое ползучее корневище, густо покрытое тонкими черновато-коричневыми чешуйками." + "\n \n" + "Кочедыжники широко применяются для озеленения тенистых уголков сада."));
        plants.add(new Plant(7, "Щитовник", Ребристый, Leaf.Папоротниковый, Flower.Нету, Fruit.Нету, Crown.Нету, "", "\n" + "Семейство  Щитовниковые." + "\n" + "Короткое и толстое, косо поднимающееся вверх корневище." + "\n \n" + "Щитовник употребляют в виде различных настоек и чая. Он показан при лечении артрита, ревматизма и судорог"));
        plants.add(new Plant(8, "Рябина", Округлый, Leaf.Овальный, Flower.Нету, Fruit.Яблоко, Crown.Овальная, "", "\n" + "Семейство  Розовые." + "\n" + "Относительно невысокие растения." + "\n \n" + "Рябина применяется для приготовленния варенья, джемов. Также она применяется  как средство от головной боли."));
        plants.add(new Plant(9, "Берёза плакучая", Округлый, Leaf.Овальный, Flower.ДвойнымОколцетвованием, Fruit.Нету, Crown.Раскидастая, "", "\n" + "Семейство  Берёзовые." + "\n" + "Быстрорастущее дерево с ажурной кроной и стройным стволом высотой." + "\n \n" + "Из берёзового сока можно приготовить квас, мармелад, уксус.  Также березовый сок можно употреблять при язве желудка."));
        plants.add(new Plant(10, "Тюлпан", Округлый, Leaf.Овальный, Flower.РаздельноПростымОколцетвованием, Fruit.Нету, Crown.Нету, "", "\n" + "Семейство  Лилейные." + "\n" + "Травянисто луковичное растение." + "\n \n" + "Тюлпан распространенный цветок. Тюльпаны выращивают на клумбах. Он также используют для лечения проблем с сердцем."));
        plants.add(new Plant(10, "Нету.", Нету, Leaf.Нету, Flower.Нету, Fruit.Нету, Crown.Нету, "", ""));

    }

    private Plant search(SearchPlant sp){

        for (Plant plant : plants) {;
            if ( plantForSearch.equals(plant) ){
                return plant;
               }
        }

        return null;
    }
    public void nextActivityMainActivityBack(View v){

        Intent intent = new Intent(Description.this, MainActivity.class );
        startActivity(intent);
    }
}