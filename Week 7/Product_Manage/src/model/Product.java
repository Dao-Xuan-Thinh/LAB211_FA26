package model;

public class Product {
    String productId, productName, manufactor;
    float price;
    int type;

    public Product() {}

    public Product(String productId, String productName, String manufactor, float price, int type) {
        this.productId = productId;
        this.productName = productName;
        this.manufactor = manufactor;
        this.price = price;
        this.type = type;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getproductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return " | " + productId + " | " + productName + " | " + price + " | " + manufactor + " | ";
    }
}
