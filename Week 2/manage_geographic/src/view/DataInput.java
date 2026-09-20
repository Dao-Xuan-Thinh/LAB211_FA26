package view;

import java.util.Scanner;

public class DataInput {

    private static Scanner sc = new Scanner(System.in);

    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            String result = sc.nextLine();
            if (!result.isEmpty()){
                return result;
            }
            else {
                System.out.println("Enter a String");
                System.out.println("Enter again");
            }
        }
    }

    public static int inputPositiveInt(){
        while (true){
            try {
                String inputString = inputString();
                int result = Integer.parseInt(inputString);
                if (result > 0) {
                    return result;
                }
                else {
                    System.out.println("Please input a positive number");
                }
            }
            catch (Exception e) {
                System.out.println("Please input a number");
            }
        }
    }

    public static float inputPositiveFloat(){
        while (true){
            try {
                String inputString = inputString();
                float result = Float.parseFloat(inputString);
                if (result > 0) {
                    return result;
                }
                else {
                    System.out.println("Please input a positive float number");
                }
            }
            catch (Exception e) {
                System.out.println("Please input a float number");
            }
        }
    }

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
                System.out.println("Enter a number between" + min + " and " + max);

            }
            catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
        }
    }

    public static boolean inputYN(){
        System.out.println("Do you want to continue?");
        while (true) {
            String inputString = inputString();
            if (inputString.equalsIgnoreCase("Y")){
                return true;
            }
            else if (inputString.equalsIgnoreCase("N")){
                return false;
            }
            else {
                System.out.println("Input Y or N");
            }
        }
    }

}
