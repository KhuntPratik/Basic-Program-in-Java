
import java.util.Scanner;

// WAP to convert a Decimal number to BCD
class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number= ");
        int num = sc.nextInt();

        while (num > 0) {
            int digit = num % 10;
            String bin = Integer.toBinaryString(digit);
            while (bin.length() < 4) {
                bin = "0" + bin;
            }

            System.out.println(bin + " ");

            num = num / 10;

        }
    }
}