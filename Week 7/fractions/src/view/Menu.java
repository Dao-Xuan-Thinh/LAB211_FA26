package view;

public class Menu {
    DataInput input = new DataInput();

    public int showAndGet(){
        System.out.print("Enter the number of element: ");
        return input.inputInt();
    }
}
