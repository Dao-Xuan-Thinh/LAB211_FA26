package view;

public class Menu {
    public int showAndGet(){
        DataInput input = new DataInput();

        System.out.println("""
                CANDIDATE MANAGEMENT SYSTEM
                    1. Experience
                    2. Fresher
                    3. Internship
                    4. Searching
                    5. Exit
                """);
        System.out.print("> ");
        return DataInput.inputIntInRange(1, 5);
    }
}
