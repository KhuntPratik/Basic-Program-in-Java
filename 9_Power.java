// 9 WAP to find a power a^b (without using power and multiplication operation

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();

        int result = 1; 

     
        for(int i = 1; i <= b; i++) {
            int temp = 0; 
            for(int j = 1; j <= result; j++) {
                temp += a; 
            }
            result = temp;
        }

        System.out.println(a + "^" + b + " = " + result);

        sc.close();
    }
}