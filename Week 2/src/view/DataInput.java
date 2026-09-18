package view;

import java.util.Scanner;

public class DataInput {

    private static Scanner sc = new Scanner(System.in);

    //For Menu :3
    public int GetIntInRange(String s, int min, int max){
        while(true){
            System.out.print(s);
            //Trim " "
            String input = sc.nextLine().trim();

            try {
                //String -> Int
                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }
                //If user enters a value smaller than 1 or bigger than 5
                System.out.println("Please enter a number between" + min + " and " + max);

            }
            catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
        }
    }

}
