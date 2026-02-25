
import java.util.Scanner;

// 6 WAP to find weather given number is Armstrong number is not
class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        int original = num;
        int remainder;
        int result = 0;

        while (num != 0) {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num = num / 10;
        }

        if (result == original) {
            System.out.println("Armstrong Number"); 
        }else {
            System.out.println("Not Armstrong Number");
        }

    }
}
