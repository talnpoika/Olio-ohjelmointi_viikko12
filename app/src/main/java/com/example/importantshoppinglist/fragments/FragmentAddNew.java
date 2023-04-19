package com.example.importantshoppinglist.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.importantshoppinglist.Item;
import com.example.importantshoppinglist.ItemList;
import com.example.importantshoppinglist.R;


public class FragmentAddNew extends Fragment {

    private EditText textInput;

    private Button btnAdd;

    private CheckBox checkBox;

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

        View view = inflater.inflate(R.layout.fragment_add_new, container, false);

        textInput = view.findViewById(R.id.etAddItemName);

        btnAdd = view.findViewById(R.id.btAdd);

        checkBox = view.findViewById(R.id.cbAddImportant);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem();
                if(checkBox.isChecked()) {
                    addImportant();
                }
                textInput.setText("");
            }
        });

        return view;
    }

    public void addItem() {
        Item item = new Item(textInput.getText().toString());
        ItemList.getInstance().addItemItems(item);
    }

    public void addImportant() {
        Item item = new Item(textInput.getText().toString());
        ItemList.getInstance().addItemImportant(item);
    }

}