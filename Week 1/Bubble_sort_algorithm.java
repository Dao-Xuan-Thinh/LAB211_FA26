import java.util.Random;
import java.util.Scanner;


public class Bubble_sort_algorithm {
    public /*static*/ int Check(Scanner sc, String message) {
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
        int n;
        Scanner sc = new Scanner(System.in);
        //In case function doesnt has static, we need to create an object of the class to call the function
        Bubble_sort_algorithm b = new Bubble_sort_algorithm();

        n = b.Check(sc, "Enter the number of array: ");
        
        int[] A = new int[n];
        System.out.print("Unsorted array: [");
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = rand.nextInt(100);
            if (i == n - 1) {
                System.out.print(A[i] + "]");
            }
            else {
                System.out.print(A[i] + ", ");
            }
        }

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
            if (flag == false){
                break;
            }
        }
        System.out.println();
        System.out.print("Sorted array: [" + A[0]);
        for (int k = 1; k < n; k++){
            System.out.print(", " + A[k]);
        }
        System.out.print("]");
    }
}