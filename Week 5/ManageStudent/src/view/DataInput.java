package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataInput {

    private static Scanner sc = new Scanner(System.in);

    public int GetIntInRange(String s, int min, int max){
        while(true){
            System.out.print(s);
            String input = sc.nextLine().trim();

            try {
                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }
                System.out.println("Enter a number between " + min + " and " + max);

            }
            catch (NumberFormatException e) {
                System.out.println("Invalid value");
            }
        }
    }

    public static String inputString(){
        while(true) {
            String result = sc.nextLine().trim();
            if (!result.isEmpty()){
                return result;
            }
            else {
                System.out.println("Enter a String");
                System.out.println("Enter again");
            }
        }
    }

    public static String inputOptional() {
        return sc.nextLine().trim();
    }

    public static String inputOptionalInt() {
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) return input;
            try {
                Integer.parseInt(input);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Please input a number or leave blank");
            }
        }
    }

    public static String inputOptionalDouble() {
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) return input;
            try {
                Double.parseDouble(input);
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Please input a number or leave blank");
            }
        }
    }

    public static int inputInt(){
        while (true){
            try {
                return Integer.parseInt(inputString());
            }
            catch (NumberFormatException e) {
                System.out.println("Please input a number");
            }
        }
    }

    public static int inputIntInRange(int min, int max){
        while (true){
            int result = inputInt();
            if (result >= min && result <= max) {
                return result;
            }
            else {
                System.out.println("Please input a number between " + min + " and " + max);
            }
        }
    }

    public static int inputPositiveInt(){
        while (true){
            int result = inputInt();
            if (result > 0) {
                return result;
            }
            else {
                System.out.println("Please input a positive number");
            }
        }
    }

    public static double inputDouble(){
        while (true){
            try {
                return Double.parseDouble(inputString());
            }
            catch (NumberFormatException e) {
                System.out.println("Please input a number");
            }
        }
    }

    public static double inputDoubleInRange(double min, double max){
        while (true){
            double result = inputDouble();
            if (result >= min && result <= max) {
                return result;
            }
            else {
                System.out.println("Please input a number between " + min + " and " + max);
            }
        }
    }

    public static double inputPositiveDouble(){
        while (true){
            double result = inputDouble();
            if (result > 0) {
                return result;
            }
            else {
                System.out.println("Please input a positive number");
            }
        }
    }

    public static float inputPositiveFloat(){
        return (float) inputPositiveDouble();
    }

    public static boolean inputYN(String print){
        System.out.println(print);
        while (true) {
            String inputString = inputString();
            if (inputString.equalsIgnoreCase("Y")){
                return true;
            }
            else if (inputString.equalsIgnoreCase("N")){
                return false;
            }
            else {
                System.out.println("Y/N");
            }
        }
    }

    public static String inputRegex(String regex, String error){
        while (true) {
            String result = inputString();
            if (result.matches(regex)){
                return result;
            }
            else {
                System.out.println(error);
            }
        }
    }

    public static String inputName(){
        return inputRegex("^[\\p{L} ]+$", "Name can only contain letters").replaceAll("\\s+", " ");
    }

    public static String inputEmail(){
        return inputRegex("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$", "Please input a valid email");
    }

    public static String inputPhone(){
        return inputRegex("^0\\d{9}$", "Phone must be 10 digits and start with 0");
    }

    public static String inputChoice(String... options){
        while (true) {
            String result = inputString();
            for (String option : options) {
                if (option.equalsIgnoreCase(result)) {
                    return option;
                }
            }
            System.out.println("Please input one of: " + String.join(", ", options));
        }
    }

    public static Date inputDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        while (true) {
            try {
                return format.parse(inputString());
            }
            catch (ParseException e) {
                System.out.println("Please input a date (dd/MM/yyyy)");
            }
        }
    }
}
