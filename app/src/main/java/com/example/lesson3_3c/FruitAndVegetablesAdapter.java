package com.example.lesson3_3c;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FruitAndVegetablesAdapter extends RecyclerView.Adapter<FruitAndVegetablesViewHolder> {
    public void setFruitVegetables(ArrayList<String> fruit_vegetables) {
    this.fruit_vegetables=fruit_vegetables;
}

    private ArrayList<String> fruit_vegetables;

    @NonNull
    @Override
    public FruitAndVegetablesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FruitAndVegetablesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_vegetables,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAndVegetablesViewHolder holder, int position) {
        holder.bind(fruit_vegetables.get(position));
    }

    @Override
    public int getItemCount() {
        return fruit_vegetables.size();
    }
}
