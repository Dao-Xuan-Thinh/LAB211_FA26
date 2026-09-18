package view;

/*
 * THE MENU SCREEN.
 *
 * Note: "public class Menu {"  — no parentheses after the class name.
 * Parentheses are for methods, which take arguments. A class does not.
 *
 * This class only draws the menu and asks for a choice. It does not decide
 * what any choice means — that is the controller's job.
 */
public class Menu {

    private DataInput input = new DataInput();

    public int showAndGetChoice() {
        System.out.println();
        System.out.println("                              MENU");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of a book");
        System.out.println("2. Display the information of the book you've just input");
        System.out.println("3. Search the information of a book by user-entered title");
        System.out.println("4. Display the information of books sorted by title in ascending order");
        System.out.println("5. Exit");
        System.out.println("==========================================================================");

        return input.getIntInRange("Your choice: ", 1, 5);
    }
}
