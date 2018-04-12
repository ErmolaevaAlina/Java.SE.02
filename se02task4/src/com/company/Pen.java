package com.company;


public class Pen extends CancelleryItem{

    private String color;
    private int lineWidth;

    public Pen(String color, String manufacturer, int lineWidth, int cost, String owner) {
        super(manufacturer, owner, cost);
        this.color = color;
        this.lineWidth = lineWidth;
    }

    public String getColor(){
        return color;
    }

    public String getOwner(){
        return owner;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCost(){
        return cost;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;

        Pen pen = (Pen) obj;

        if (lineWidth != pen.lineWidth)
            return false;
        return color != null ? color.equals(pen.color) : pen.color == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + lineWidth;
        return result;
    }

    @Override
    public String toString() {
        return super.toString("color: " + color + "; line width: " + lineWidth);
    }
}

