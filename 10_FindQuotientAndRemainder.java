
import java.util.Scanner;

// 10 WAP to find a quoƟ ent and reminder of 2 number (bigger number should be divided by lower 
// number) and you are not allowed to use a division and quoƟ ent operator.
class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second  number: ");
        int b = sc.nextInt();

        int big, small;

        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        int quotient = 0;

        while (big >= small) {
            big = big - small;
            quotient++;
        }

        int remainder = big;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }
}
