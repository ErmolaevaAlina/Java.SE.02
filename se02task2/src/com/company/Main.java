package com.company;

public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new Person("Alina");
        people[0].addItem( new Clip("a1", people[0].getName(), 100, "metal"));

        people[1] = new Person( "Alexander");
        people[1].addItem(new Eraser("b2", people[1].getName(), 200,"Circle"));


        for (int i = 0; i < 2; i++)
        {
            System.out.println(people[i]);
        }

    }
}
