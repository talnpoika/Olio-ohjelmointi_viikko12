package com.example.importantshoppinglist;

import java.util.ArrayList;

public class ItemList {

    private static ItemList singleton = null;

    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Item> important = new ArrayList<>();

    private ItemList() {
    }

    public static ItemList getInstance() {
        if (singleton == null) {
            singleton = new ItemList();
        }
        return singleton;
    }

    public void addItemItems(Item item) {
        items.add(item);
    }

    public void addItemImportant(Item item) {
        important.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Item> getImportant() {
        return important;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}
