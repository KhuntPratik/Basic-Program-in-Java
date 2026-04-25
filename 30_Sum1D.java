// 30 WAP to find a sum of even number into 1D array.


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        // Input elements
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find sum of even numbers
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        // Output result
        System.out.println("Sum of even numbers: " + sum);

        sc.close();
    }
}