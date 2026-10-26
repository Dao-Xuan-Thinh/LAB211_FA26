import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Analyze_String {
    public HashMap<String, List<Integer>> getNum(String input){
        HashMap<String, List<Integer>> bigMapNum = new HashMap<>();
        List<Integer> all = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> square = new ArrayList<>();

        String OnlyNum = input.replaceAll("\\D+", "-").replaceAll("^-", "");

        if(!OnlyNum.isEmpty()){
            String[] numArray = OnlyNum.split("-");

            for (String n : numArray){
                int numTemp = Integer.parseInt(n);
                all.add(numTemp);

                if(numTemp % 2 == 0){
                    even.add(numTemp);
                }
                else{
                    odd.add(numTemp);
                }

                if (Math.sqrt(numTemp) == (int) Math.sqrt(numTemp)){
                    square.add(numTemp);
                }
            }
        }

        bigMapNum.put("All", all);
        bigMapNum.put("Even", even);
        bigMapNum.put("Odd", odd);
        bigMapNum.put("Square", square);
        return bigMapNum;
    }

    public HashMap<String, StringBuilder> getChar(String input){
        HashMap<String, StringBuilder> bigMapChar = new HashMap<>();

        String OnlyChar = input.replaceAll("\\d+", "");
        String OnlySpecial = OnlyChar.replaceAll("\\w", "");
        String OnlyLow = input.replaceAll("[^a-z]", "");
        String OnlyUp = input.replaceAll("[^A-Z]", "");

        bigMapChar.put("Uppercase", new StringBuilder(OnlyUp));
        bigMapChar.put("Lowercase", new StringBuilder(OnlyLow));
        bigMapChar.put("Special", new StringBuilder(OnlySpecial));
        bigMapChar.put("All", new StringBuilder(OnlyChar));
        return bigMapChar;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Analyze_String AS = new Analyze_String();

        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        String input = sc.nextLine();

        HashMap<String, List<Integer>> numbers = AS.getNum(input);
        HashMap<String, StringBuilder> chars = AS.getChar(input);

        System.out.println("-----Result Analysis------");
        System.out.println("Perfect Square Numbers: " + numbers.get("Square"));
        System.out.println("Odd Numbers: " + numbers.get("Odd"));
        System.out.println("Even Numbers: " + numbers.get("Even"));
        System.out.println("All Numbers: " + numbers.get("All"));
        System.out.println("Uppercase Characters: " + chars.get("Uppercase"));
        System.out.println("Lowercase Characters: " + chars.get("Lowercase"));
        System.out.println("Special Characters: " + chars.get("Special"));
        System.out.println("All Characters: " + chars.get("All"));
    }
}