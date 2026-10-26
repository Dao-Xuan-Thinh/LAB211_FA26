package model;

public class Electronics extends Product{
    int warrantyYears;

    public Electronics() {}

    public Electronics(String productId, String productName, String manufacturer, float price, int warrantyYears) {
        super(productId, productName, manufacturer, price, 0);
        this.warrantyYears = warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String toString(){
        return type + " - " + "Electonics" + super.toString() + warrantyYears;
    }
}
