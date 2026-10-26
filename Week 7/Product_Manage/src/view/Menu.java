package view;

import javax.xml.crypto.Data;

public class Menu {
    public int showAndGet(){
        System.out.println("""
                PRODUCT MANAGEMENT SYSTEM
                1. Add a new product
                2. Display the information of the most recently added product
                3. Search for a product by name
                4. Update a product by product ID
                5. Delete a product by product ID
                6. Exit
                """);

        return DataInput.GetIntInRange("> ", 1, 6);
    }
}
