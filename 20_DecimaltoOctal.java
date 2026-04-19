// 20 WAP to Convert a Decimal to Octal and Vice versa.


import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal number: ");
        int decimal = sc.nextInt();

        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal number: " + octal);
    }
}