// 31 WAP to enter an element at specific posiƟ on into array. (Do not take a new array)

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10]; // fixed size (extra space)
        int n, pos, value;

        // Input number of elements
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        // Input elements
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position and value
        System.out.print("Enter position: ");
        pos = sc.nextInt();

        System.out.print("Enter value: ");
        value = sc.nextInt();

        // Shift elements to right
        for(int i = n - 1; i >= pos - 1; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert value
        arr[pos - 1] = value;
        n++;

        // Display array
        System.out.println("Array after insertion:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}