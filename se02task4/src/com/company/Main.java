package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        NewbieSet newbieSet = new NewbieSet();

        System.out.println(newbieSet);
        System.out.println("-------------");

        newbieSet.SortByCost();
        System.out.println(newbieSet);
        System.out.println("-------------");

        newbieSet.SortByManufacturer();
        System.out.println(newbieSet);
        System.out.println("-------------");

        newbieSet.SortByCostAndManufacturer();
        System.out.println(newbieSet);

    }
}
