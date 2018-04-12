package com.company;

public class Main {

    public static void main(String[] args) {

        Pen penOne = new Pen();
        penOne.setType("BallPen");
        penOne.setColor("Blue");

        Pen penTwo = new Pen();
        penTwo.setType("GellPen");
        penTwo.setColor("Green");


        System.out.println(penOne);
        System.out.println(penTwo);
    }
}
