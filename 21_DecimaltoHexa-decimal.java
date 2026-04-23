// 21 WAP to Convert a Decimal to Hexa-decimal and vice versa.



import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal equivalent: " + hex);
    }
}