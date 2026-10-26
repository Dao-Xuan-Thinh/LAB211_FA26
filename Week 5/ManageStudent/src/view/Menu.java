package view;

public class Menu {
    DataInput input = new DataInput();

    public int showGet(){
        System.out.println("""
                WELCOME TO STUDENT MANAGEMENT
                    1. Create
                    2. Find and Sort
                    3. Update/Delete
                    4. Report
                    5. Exit
                """);

        return input.GetIntInRange("> ", 1, 5);
    }

    public int updateMenu(){
        System.out.println("""
                1. ID
                2. Name
                3. Semester
                4. Course
                5. Return
                """);

        return input.GetIntInRange("Choose attribute to update: ", 1, 5);
    }
}
