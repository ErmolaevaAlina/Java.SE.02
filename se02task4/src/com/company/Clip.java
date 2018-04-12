package com.company;

public class Clip extends CancelleryItem{
    private String type;

    public Clip(String manufacturer, String owner, int cost, String type) {
        super(manufacturer, owner, cost);
        this.type=type;
    }

    public int getCost(){
        return cost;
    }

    public String getType() {
        return type;
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

        Clip clip = (Clip) obj;

        return type != null ? type.equals(clip.type) : clip.type == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {

        return super.toString("")+" type: " + type;
    }
}
