import java.util.Scanner;


class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("Decimal equivalent: " + decimal);
    }
}