package view;

import java.util.Scanner;

public class DataInput {
    public static String inputString(){//nhap vao mot string khong rong
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String result = scanner.nextLine();
            if (!result.isEmpty()) return result;
            else {
                System.out.println("Enter a string");
                System.out.println("Enter again");
            }
        }
    }
    public static int inputPositiveInteger(){
        while (true) {
            try {
                String inputString = inputString();
                int result = Integer.parseInt(inputString);
                if (result > 0) return result;
                else {
                    System.out.println("Please input a positive number.");
                }
            } catch (Exception e) {
                System.out.println("Please input a number.");
            }
        }
    }
    public static int inputLimit(int min, int max) {
        while (true) {
            int result = inputPositiveInteger();
            if (result >= min && result <= max) {
                return result;
            } else {
                System.out.println("Please input a number in the range " + min + "," + max);
            }
        }
    }
    public static float inputPositiveFloat(){

        while (true) {
            try {
                String inputString = inputString();
                float result = Float.parseFloat(inputString);
                if (result > 0) return result;
                else {
                    System.out.println("Please input a positive float number.");
                }
            } catch (Exception e) {
                System.out.println("Please input a float number number.");
            }
        }
    }
    public static boolean inputYN(){
        System.out.println("“Do you want to continue?”");
        while (true) {
            String inputString = inputString();
            if (inputString.equalsIgnoreCase("Y")) return true;
            else if (inputString.equalsIgnoreCase("N")) return false;
            else {
                System.out.println("Please input Y/y or N/n");
            }
        }
    }
}
