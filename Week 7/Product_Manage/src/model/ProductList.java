package model;

import java.util.ArrayList;
import java.util.Locale;

public class ProductList {
    ArrayList<Product> PL = new ArrayList<>();

    public ArrayList<Product> getList() {
        return PL;
    }

    public void addProduct(Product p) {
        PL.add(p);
    }

    public void removeProduct(Product p) {
        PL.remove(p);
    }

    public ArrayList<Product> searchByName(String name) {
        ArrayList<Product> found = new ArrayList<>();
        name = name.trim().toLowerCase();

        for (Product p : PL) {
            if ((p.getproductName().toLowerCase().contains(name))) {
                found.add(p);
            }
        }
        return found;
    }

    public Product findById(String id) {
        for (Product p : PL) {
            if (p.getProductId().equalsIgnoreCase(id.trim())) {
                return p;
            }
        }
        return null;
    }

    public Product getMostRecent() {
        if (PL.isEmpty()) {
            return null;
        }
        return PL.getLast();
    }
}