public class PalindromeNumber {
    public static void main(String[] args) {

        int n = 121;
        int original = n;
        int reversedNum = 0;

        while (n != 0) {
            int reminder = n % 10;

            reversedNum = (reversedNum * 10) + reminder;

            n /= 10;
        }

        if (original == reversedNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}