package view;

public class Menu {
    DataInput input = new DataInput();

    public int ShowAndGet(){
        System.out.println();
        System.out.println("""
                1. Add Doctor
                2. Update Doctor
                3. Delete Doctor
                4. View all doctor information
                5. Exit
                """);

        return input.GetIntInRange(">> ", 1, 5);
    }
}
