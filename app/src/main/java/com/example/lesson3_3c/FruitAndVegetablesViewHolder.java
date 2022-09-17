package com.example.lesson3_3c;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FruitAndVegetablesViewHolder extends RecyclerView.ViewHolder {
    private TextView fruit;

    public FruitAndVegetablesViewHolder(@NonNull View itemView) {
        super(itemView);
        fruit = itemView.findViewById(R.id.fruitt);
    }

    public void bind(String fruitAndVegetables) {
        fruit.setText(fruitAndVegetables);
    }
}