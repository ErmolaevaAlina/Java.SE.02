package com.company;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private List<CancelleryItem> items;

    public Person(String name) {
        this.name = name;
        items = new LinkedList();
    }

    public String getName() {
        return name;
    }

    public Person addItem(CancelleryItem item) {
        this.items.add(item);
        return this;
    }

    public CancelleryItem getItem(CancelleryItem item) {
        CancelleryItem i = items.get(items.indexOf(item));
        items.remove(item);
        return i;
    }

    @Override
    public String toString() {
        List<String> output = new LinkedList();
        int totalCost = 0;
        for(int i = 0; i < items.size(); i++)
        {
            output.add(items.get(i).toString());
            totalCost += items.get(i).cost;
        }
        output.add("Total cost: " + totalCost);
        return String.join("\n", output);
    }
}
