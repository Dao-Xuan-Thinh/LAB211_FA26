package model;

public class Furniture extends Product{
    String material;

    public Furniture() {}

    public Furniture(String productId, String productName, String manufactor, float price, String material) {
        super(productId, productName, manufactor, price, 1);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString(){
        return type + " - " + "Furniture" + super.toString() + material;
    }
}
