package com.example.lesson3_3c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String>fruitAndVegetables=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        fruitAndVegetables = new ArrayList<>();
        fruitAndVegetables.add("Apple");
        fruitAndVegetables.add("Carrot");
        fruitAndVegetables.add("Melon");
        fruitAndVegetables.add("Watermelon");
        fruitAndVegetables.add("Avocado");
        fruitAndVegetables.add("Mango");
        fruitAndVegetables.add("Grape");
        fruitAndVegetables.add("Papaya ");
        fruitAndVegetables.add("Coconut");
        fruitAndVegetables.add("Orange");
        fruitAndVegetables.add("Pear");
        fruitAndVegetables.add("Plum");
        fruitAndVegetables.add("Apricot");
        fruitAndVegetables.add("Tomato");
        fruitAndVegetables.add("Potato");
        fruitAndVegetables.add("Onion");
        fruitAndVegetables.add("Cucumber");
        fruitAndVegetables.add("Cabbage");
        fruitAndVegetables.add("Capsicum");
        fruitAndVegetables.add("Broccoli");
        fruitAndVegetables.add("Brinjal");
        fruitAndVegetables.add("Corn");
        fruitAndVegetables.add("Grean Bean");
        fruitAndVegetables.add("Spinach");
        fruitAndVegetables.add("Beetroot");
        fruitAndVegetables.add("Radish");
        fruitAndVegetables.add("Peas");
        fruitAndVegetables.add("Garlic");
        fruitAndVegetables.add("Red pepper");
        FruitAndVegetablesAdapter adapter = new FruitAndVegetablesAdapter();
        adapter.setFruitVegetables(fruitAndVegetables);
        recyclerView.setAdapter(adapter);
    }
}