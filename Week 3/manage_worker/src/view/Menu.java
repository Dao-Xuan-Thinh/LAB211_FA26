package view;

public class Menu {
    DataInput input = new DataInput();

    public int ShowAndGet(){
        System.out.print("""
                ========== Worker Management ==========
                1. Add Worker
                2. Up salary
                3. Down salary
                4. Display Information salary
                5. Exit
                """);

        return input.GetIntInRange("> ", 1, 5);
    }
}
