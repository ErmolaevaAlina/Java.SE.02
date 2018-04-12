package com.company;

import java.util.ArrayList;
import java.util.List;

public class NewbieSet extends ArrayList<CancelleryItem> {

    public NewbieSet()
    {
        add(new Clip("a", "b", 100,"Metal"));
        add(new Eraser("a", "b", 200,"Circle"));
    }
}
