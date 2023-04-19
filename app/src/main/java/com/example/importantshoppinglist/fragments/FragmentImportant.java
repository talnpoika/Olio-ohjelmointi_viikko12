package com.example.importantshoppinglist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.importantshoppinglist.ImportantViewAdapter;
import com.example.importantshoppinglist.ItemList;
import com.example.importantshoppinglist.R;


public class FragmentImportant extends Fragment {

    private ItemList importantList;

    private RecyclerView recyclerView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_important, container, false);

        importantList = ItemList.getInstance();

        recyclerView = view.findViewById(R.id.rvImportant);

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        recyclerView.setAdapter(new ImportantViewAdapter(getContext().getApplicationContext(), importantList.getImportant()));

        return view;
    }


}