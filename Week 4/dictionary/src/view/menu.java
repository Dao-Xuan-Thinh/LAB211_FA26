package view;

public class menu {
    dataInput input = new dataInput();

    public int showAndGet(){
        System.out.print("""
                ========== Dictionary program ==========
                1. Add Word
                2. Delete Word
                3. Translate
                4. Exit
                """);

        return input.GetIntInRange("> ", 1, 4);
    }
}
