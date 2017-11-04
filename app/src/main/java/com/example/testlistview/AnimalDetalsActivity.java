package com.example.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testlistview.model.Animal;

import static android.R.attr.name;

public class AnimalDetalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detals);

        ImageView animalImageView = (ImageView) findViewById(R.id.animal_image_view);
        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);

        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//        int picture = intent.getIntExtra("picture", 0);

//        int position = intent.getIntExtra("position",0);
//        AnimalData animalData = AnimalData.getInstance();
//        Animal animal = animalData.animalList.get(position);
      //  Animal animal = animalData.animalList.get(position);

        int position = intent.getIntExtra("position",0);
        AnimalData animalData = AnimalData.getInstance();
        Animal animal = animalData.animalList.get(position);

        nameTextView.setText(animal.detail);
        animalImageView.setImageResource(animal.picture);

        getSupportActionBar().setTitle(animal.name);



    }
}
