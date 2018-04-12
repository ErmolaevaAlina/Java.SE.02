package com.company;

public class Pen {
    private String type;
    private String color;

    public void setColor(String c) {
        color = c;
    }

    public void setType(String t) {
        type = t;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
    public boolean equals(Object object){
        if (object==this){
            return true;
        }
        if(object==null||object.getClass()!= this.getClass()){
            return false;
        }

        Pen pen =(Pen) object;

        return getType() == pen.getType() && getColor() == pen.getColor();

    }

    public int hashCode() {
        return type.hashCode() ^ color.hashCode();
    }

    public String toString(){
        return getColor()+"; "+ getType();
    }


    }
