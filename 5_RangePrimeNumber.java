// 5 WAP to find a prime number between range (range should be entered by user).

import java.util.Scanner;


class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter Starting Number:- ");
        int s = sc.nextInt();

         System.err.print("Enter Ending Number:- ");
        int e = sc.nextInt();

        for(int i = s ; i<=e ; i++){
             int count = 0;

             for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

              if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}