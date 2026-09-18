
import java.util.Random;
import java.util.Scanner;

public class Binary_search_algorithm {
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
        Scanner sc = new Scanner(System.in);
        int n = Check(sc, "Enter the number of array: ");
        int target = Check(sc, "Search value: ");

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


        // Bubble Sort
        boolean flag;
        for (int i = 0; i < n - 1; i++){
            flag = false;
            for (int j = 0; j < n - i - 1; j++){
                if (A[j] > A[j + 1]){
                    flag = true;
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
            if (flag == false || i == n - 1) {
                System.out.println();
                System.out.print("Sorted array: [ " + A[0]);
                for (int k = 1; k < n; k++){
                    System.out.print(", " + A[k]);
                }
                System.out.print(" ]");
                break;
            }
        }
        System.out.println();

        // Binary Search

        int left = 0, right = n - 1;
        int resultIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == target) {
                resultIndex = mid;
                break;
            } 
            else if (A[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        if (resultIndex != -1) {
            System.out.println("Found at index: " + resultIndex);
        } 
        else {
            System.out.println("Element not found.");
        }
    }
}
