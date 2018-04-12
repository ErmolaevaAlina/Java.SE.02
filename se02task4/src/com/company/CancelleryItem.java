package com.company;

public abstract class CancelleryItem {

    protected String manufacturer;
    protected String owner;
    protected int cost;


    public CancelleryItem(String manufacturer, String owner, int cost) {
        this.manufacturer = manufacturer;
        this.owner = owner;
        this.cost = cost;
    }

    public int getCost() {

        return cost;
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

        CancelleryItem that = (CancelleryItem) obj;

        if (this.cost != that.cost)
            return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null)
            return false;
        return owner != null ? owner.equals(that.owner) : that.owner == null;

    }

    @Override
    public int hashCode() {
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + cost;
        return result;
    }

    public String toString(String concreteInfo) {
        return getClass().getSimpleName() + " "
                +"Manufacturer: " + manufacturer +
                "; owner: " + owner +
                "; cost: " + cost;
    }
}
