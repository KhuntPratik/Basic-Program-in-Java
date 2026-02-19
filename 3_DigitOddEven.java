
// WAP to find a total odd and total even digit of a given number

import java.util.Scanner;


class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number:- ");
        int num = sc.nextInt();
        int digit ;
        int odd = 0;
        int even = 0;

        while (num != 0) { 
            digit = num%10;

            if(digit%2==0){
                even++;
            }
            else{
                odd++;
            }

            num = num/10;
        }

        System.out.println("Total Odd Number:- " + odd);
        System.err.println("Total Even Number:- "+even);
    }
}