package com.example.importantshoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ImportantViewAdapter extends RecyclerView.Adapter<ImportantViewHolder> {

    private Context context;
    private ArrayList<Item> important = new ArrayList<>();

    public ImportantViewAdapter(Context context, ArrayList<Item> important) {
        this.context = context;
        this.important = important;
    }

    @NonNull
    @Override
    public ImportantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImportantViewHolder(LayoutInflater.from(context).inflate(R.layout.important_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ImportantViewHolder holder, int position) {

        holder.txtImportantName.setText(important.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return important.size();
    }
}
