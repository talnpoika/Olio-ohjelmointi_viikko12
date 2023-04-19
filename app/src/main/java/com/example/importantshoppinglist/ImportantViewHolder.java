package com.example.importantshoppinglist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImportantViewHolder extends RecyclerView.ViewHolder {

    TextView txtImportantName;

    public ImportantViewHolder(@NonNull View itemView) {
        super(itemView);
        txtImportantName = itemView.findViewById(R.id.txtImportant);
    }
}
