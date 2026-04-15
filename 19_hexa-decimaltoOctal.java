// 19 WAP to convert a hexa-decimal to Octal.


import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hexadecimal number: ");
        String hex = sc.nextLine();

        // Convert Hex to Decimal
        int decimal = Integer.parseInt(hex, 16);

        // Convert Decimal to Octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal value: " + octal);
    }
}