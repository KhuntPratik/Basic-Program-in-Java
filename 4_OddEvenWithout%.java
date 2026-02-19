// WAP to find whether a number is Odd or Even without using a % operator.

import java.util.Scanner;


class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter Number:- ");
        int num = sc.nextInt();

        if((num/2)*2 == num){
            System.err.println(num+" This Number is Even");
        }
        else{
            System.err.println(num+" This Number is Odd");
        }

    }
}