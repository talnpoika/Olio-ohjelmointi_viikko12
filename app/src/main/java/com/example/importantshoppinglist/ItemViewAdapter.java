package com.example.importantshoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemViewAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public ItemViewAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        holder.txtName.setText(items.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
