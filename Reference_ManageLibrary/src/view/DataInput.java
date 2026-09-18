package view;

import java.util.Scanner;

/*
 * ALL KEYBOARD INPUT LIVES HERE.
 *
 * This is your Week 1 Check() method, grown up and split by type.
 * Same shape you already wrote: loop forever, try to parse, return on success,
 * complain and loop again on failure.
 *
 * Why is the Scanner "static"?
 *   static = one single copy shared by every DataInput object in the program.
 *   Menu makes a DataInput and so does the controller, so without static there
 *   would be two Scanners fighting over the same keyboard — and one can swallow
 *   input meant for the other. static guarantees exactly one, however many
 *   DataInput objects exist.
 *
 * Why always nextLine() and never nextFloat()?
 *   nextFloat() reads the number but LEAVES the newline character sitting in
 *   the buffer. The next nextLine() then instantly returns an empty string and
 *   your program skips a question. Reading lines and parsing them by hand
 *   avoids this completely. This bug wrecks more LAB211 submissions than
 *   anything else.
 */
public class DataInput {

    private static Scanner sc = new Scanner(System.in);

    // plain text that must not be blank
    public String getString(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty. Try again.");
        }
    }

    // a float that must be greater than zero
    public float getPositiveFloat(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            try {
                float value = Float.parseFloat(input);

                if (value > 0) {
                    return value;
                }
                System.out.println("Value must be greater than 0.");

            } catch (NumberFormatException e) {
                // thrown when the text is not a number at all, e.g. "abc"
                System.out.println("That is not a valid number.");
            }
        }
    }

    // an int restricted to a range, for the menu choice
    public int getIntInRange(String message, int min, int max) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            try {
                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Please enter a number between " + min + " and " + max + ".");

            } catch (NumberFormatException e) {
                System.out.println("That is not a valid number.");
            }
        }
    }

    /*
     * Yes/no question for the "do you want to continue?" loop.
     * Accepts y / yes / n / no in any capitalisation, rejects anything else.
     */
    public boolean getYesNo(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                return true;
            }
            if (input.equals("n") || input.equals("no")) {
                return false;
            }
            System.out.println("Please answer y or n.");
        }
    }
}
