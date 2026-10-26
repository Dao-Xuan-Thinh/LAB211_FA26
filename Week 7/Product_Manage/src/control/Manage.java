package control;

import model.Product;
import model.ProductList;
import view.ConsoleForm;
import view.DataInput;
import view.Menu;

public class Manage {
    ConsoleForm CF = new ConsoleForm();
    ProductList PL = new ProductList();
    Menu menu = new Menu();

    public void Execute(){
        while(true){
            int choice = menu.showAndGet();

            switch (choice){
                case 1:
                    do {
                        Product newP = CF.inputProduct();
                        if (PL.findById(newP.getProductId()) != null) {
                            System.out.println("ID already exists");
                        }
                        else {
                            PL.addProduct(newP);
                        }
                        System.out.print("Continue(Y/N): ");
                    } while (DataInput.inputYN());
                    break;

                case 2:
                    System.out.println(PL.getMostRecent());
                    break;

                case 3:
                    CF.showList(PL.searchByName(CF.getName()));
                    break;

                case 4:
                    Product p = PL.findById(CF.getId());
                    if (p == null)
                        System.out.println("Product not found");

                    else
                        CF.updateProduct(p);

                    break;

                case 5:
                    p = PL.findById(CF.getId());
                    if (p == null)
                        System.out.println("Product not found");

                    else
                        PL.removeProduct(p);

                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
