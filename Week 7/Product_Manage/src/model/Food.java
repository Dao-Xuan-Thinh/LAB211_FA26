package model;

public class Food extends Product{
    String expirationDate;

    public Food() {}

    public Food(String productId, String productName, String manufactor, float price, String expirationDate) {
        super(productId, productName, manufactor, price, 2);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString(){
        return type + " - " + "Food" + super.toString() + expirationDate;
    }
}
