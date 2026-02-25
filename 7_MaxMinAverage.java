
//  WAP to fifind Max, Min, Average of n numbers, n should be taken from user and all
//  n value should  be taken from user (Note that you are not allowed to use an array for this)


import java.util.Scanner;

class  main{
    public static void main (String [] args){
        
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = sc.nextInt();

            sum = sum + num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double average = (double) sum / n;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + average);

    }
}