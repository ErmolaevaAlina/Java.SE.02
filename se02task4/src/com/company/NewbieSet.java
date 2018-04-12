package com.company;

import java.util.*;

public class NewbieSet extends ArrayList<CancelleryItem> {

    public NewbieSet()
    {
        add(new Clip("z", "b", 100,"Metal"));
        add(new Eraser("a", "b", 20000000,"Form1"));
        add(new Eraser("a", "b", 100,"Form2"));
        add(new Eraser("hhh", "b", 242,"Form3"));
        add(new Eraser("jjj", "b", 43,"Form4"));
        add(new Eraser("kkk", "b", 234,"Form5"));
    }


    public void SortByCost()

    {
        Collections.sort(this, new Comparator<CancelleryItem>(){
            public int compare(CancelleryItem item1, CancelleryItem item2){
                if(item1.cost == item2.cost)
                    return 0;
                return item1.cost < item2.cost ? -1 : 1;
            }
        });
    }

    public void SortByManufacturer()
    {
        Collections.sort(this, new Comparator<CancelleryItem>(){
            public int compare(CancelleryItem item1, CancelleryItem item2){
                return item1.manufacturer.compareTo(item2.manufacturer);
            }
        });
    }

    public void SortByCostAndManufacturer()
    {
        Collections.sort(this, new Comparator<CancelleryItem>(){
            public int compare(CancelleryItem item1, CancelleryItem item2){
                if(item1.cost == item2.cost)
                    return item1.manufacturer.compareTo(item2.manufacturer);
                return item1.cost < item2.cost ? -1 : 1;
            }
        });
    }

    @Override
    public String toString() {
        List<String> output = new LinkedList();
        for(int i = 0; i < this.size(); i++)
        {
            output.add(this.get(i).toString());
        }
        return String.join("\n", output);
    }
}
