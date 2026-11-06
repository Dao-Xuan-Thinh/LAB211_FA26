package view;

import java.util.ArrayList;
import model.Electronics;
import model.Food;
import model.Furniture;
import model.Product;

public class ConsoleForm {
    public String getName(){
        System.out.print("Name to search: ");
        return DataInput.inputString();
    }

    public String getId(){
        System.out.print("Id to search: ");
        return DataInput.inputString();
    }

    public Product inputProduct() {
        int type = DataInput.GetIntInRange("Enter Type (0: Electronics, 1: Furniture, 2: Food): ", 0, 2);
        System.out.print("Enter product ID: ");
        String id = DataInput.inputString();
        System.out.print("Enter product name: ");
        String name = DataInput.inputString();
        System.out.print("Enter price: ");
        float price = DataInput.inputPositiveFloat();
        System.out.print("Enter manufacturer: ");
        String manufacturer = DataInput.inputString();

        switch (type) {
            case 0:
                System.out.print("Enter warranty years: ");
                int warranty = DataInput.inputIntInRange(0, 100);
                return new Electronics(id, name, manufacturer, price, warranty);
            case 1:
                System.out.print("Enter material: ");
                String material = DataInput.inputString();
                return new Furniture(id, name, manufacturer, price, material);
            default:
                System.out.print("Enter expiration date (dd-MM-yyyy): ");
                String date = DataInput.inputDateString();
                return new Food(id, name, manufacturer, price, date);
        }
    }

    public static String inputNameToSearch() {
        System.out.print("Enter product name to search: ");
        return DataInput.inputString();
    }

    public void showList(ArrayList<Product> list){
        if (list.isEmpty()){
            System.out.println("List Empty");
            return;
        }

        for (Product p : list){
            System.out.println(p);
        }
    }

    public void updateProduct(Product p) {
        System.out.println("Leave blank to keep the current value.");

        System.out.print("New name (" + p.getproductName() + "): ");
        String name = DataInput.inputOptional();
        if (!name.isEmpty())
            p.setProductName(name);

        System.out.print("New price (" + p.getPrice() + "): ");
        String price = DataInput.inputOptionalPositiveFloat();
        if (!price.isEmpty())
            p.setPrice(Float.parseFloat(price));

        System.out.print("New manufacturer (" + p.getManufactor() + "): ");
        String manufacturer = DataInput.inputOptional();
        if (!manufacturer.isEmpty())
            p.setManufactor(manufacturer);

        if (p instanceof Electronics) {
            Electronics e = (Electronics) p;
            System.out.print("New warranty years (" + e.getWarrantyYears() + "): ");
            String warranty = DataInput.inputOptionalIntInRange(0, 100);
            if (!warranty.isEmpty())
                e.setWarrantyYears(Integer.parseInt(warranty));
        }
        else if (p instanceof Furniture) {
            Furniture f = (Furniture) p;
            System.out.print("New material (" + f.getMaterial() + "): ");
            String material = DataInput.inputOptional();
            if (!material.isEmpty())
                f.setMaterial(material);
        }
        else if (p instanceof Food) {
            Food fd = (Food) p;
            System.out.print("New expiration date dd-MM-yyyy (" + fd.getExpirationDate() + "): ");
            String date = DataInput.inputOptionalDate();
            if (!date.isEmpty())
                fd.setExpirationDate(date);
        }
    }
}
