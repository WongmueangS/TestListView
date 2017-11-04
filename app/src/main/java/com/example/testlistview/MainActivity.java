package com.example.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.testlistview.Adapter.AnimalListAdapter;
import com.example.testlistview.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView mListView;
    private ArrayList<Animal> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.list_view);

        AnimalData animalData = AnimalData.getsTnstent();
        animalData.animalList = new ArrayList<>();

        mData = new ArrayList<>();
//        mData.add("Cat");
//        mData.add("Dog");
//        mData.add("Lion");
//        mData.add("Hippo");
//        mData.add("Panda");
//        mData.add("Snack");
//        mData.add("Giraffe");
       // Animal animal = new Animal("Cat",R.drawable.animals_cat);
//        mData.add(new Animal("Cat",R.drawable.cat));
//        mData.add(new Animal("Dog",R.drawable.dog));
//        mData.add(new Animal("Dolphin",R.drawable.dolphin));
//        mData.add(new Animal("Koala",R.drawable.koala));
//        mData.add(new Animal("Lion",R.drawable.lion));
//        mData.add(new Animal("Owl",R.drawable.owl));
//        mData.add(new Animal("Penguin",R.drawable.penguin));
//        mData.add(new Animal("Pig",R.drawable.pig));
//        mData.add(new Animal("Rabbit",R.drawable.rabbit));
//        mData.add(new Animal("Tiger",R.drawable.tiger));

        animalData.animalList.add(new Animal("Cat",R.drawable.cat));
        animalData.animalList.add(new Animal("Dog",R.drawable.dog));
        animalData.animalList.add(new Animal("Dolphin",R.drawable.dolphin));
        animalData.animalList.add(new Animal("Koala",R.drawable.koala));
        animalData.animalList.add(new Animal("Lion",R.drawable.lion));
        animalData.animalList.add(new Animal("Owl",R.drawable.owl));
        animalData.animalList.add(new Animal("Penguin",R.drawable.penguin));
        animalData.animalList.add(new Animal("Pig",R.drawable.pig));
        animalData.animalList.add(new Animal("Rabbit",R.drawable.rabbit));
        animalData.animalList.add(new Animal("Tiger",R.drawable.tiger));


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this,
//                R.layout.item,//item.xml ที่เราสร้างเอง // android.R.layout.simple_list_item_1 layout ของแต่ละitemในListview  //อ้างถึง file xml ที่ android สร้างไว้ให้แล้ว ระบุว่า อยากให้ listView หน้าตาเป็นยังไง
//                R.id.textView, //กำหนดว่าให้ไปแสดงที่ไหน //บอกให้ adepter รู้
//                mData   //แหล่งข้อมูลทั้งหมด ทั้งarray
//
//
//        );

        AnimalListAdapter adapter = new AnimalListAdapter(
                this,
                R.layout.item,
                mData

        );

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view, int i, long l) {
                Animal animal = mData.get(i);
                Toast.makeText(MainActivity.this,animal.name,Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,AnimalDetalsActivity.class);
                intent.putExtra("name",animal.name);
                intent.putExtra("picture",animal.picture); //ctrl+q ดูducument

                intent.putExtra("position")
                startActivity(intent);

            }
        });



    }
}
