package com.company;

public class Eraser extends CancelleryItem {
    private String form;
    public Eraser(String manufacturer, String owner, int cost, String form) {
        super(manufacturer, owner, cost);
        this.form=form;
    }

    public int getCost(){
        return cost;
    }
    public String getForm(){
        return form;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getOwner(){
        return owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;

        Eraser eraser = (Eraser) obj;

        return form != null ? form.equals(eraser.form) : eraser.form == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (form != null ? form.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return super.toString("")+" form: "+form;
    }
}
