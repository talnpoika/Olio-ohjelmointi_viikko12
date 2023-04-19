package com.example.importantshoppinglist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView txtName;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.txtItemName);
    }
}

