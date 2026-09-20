package view;

public class Menu {
    DataInput input = new DataInput();

    public int ShowAndGet(){
        System.out.println();
        System.out.println("""
                1. Add a contact
                2. Display all contacts
                3. Delete a contact
                4. Exit
                """);

        return input.GetIntInRange(">> ", 1, 4);
    }
}
