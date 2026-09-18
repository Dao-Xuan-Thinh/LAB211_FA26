
import java.util.Random;
import java.util.Scanner;

public class Linear_search {
    public static int Check(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine();

            try {
                int value = Integer.parseInt(input);

                if (value > 0) {
                    return value;
                }

                System.out.println("Invalid input");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
            
        //Get the thing
        Scanner sc = new Scanner(System.in);
        int n = Check(sc, "Enter the number of array: ");
        int target = Check(sc, "Search value: ");

        //Random array
        int[] A = new int[n];
        Random rnd = new Random();
        System.out.print("Unsorted array: [");
        for (int i = 0; i < n; i++) {
            A[i] = rnd.nextInt(100);
            if (i == n - 1) {
                System.out.print(A[i] + "]");
            } 
            else {
                System.out.print(A[i] + ", ");
            }
        }
        System.out.println();

        //Linear Search
        int flag = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] == target) {
                flag = 1;
                System.out.println("Found at index: " + i);
                return;
            }
        }
        if (flag == -1) {
            System.out.println("Not found");
        }
    }
}
