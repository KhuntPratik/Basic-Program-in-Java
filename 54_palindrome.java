// WAP to find whether string is palindrome or not.

import java.util.*;

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String- ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();

        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

    }
}
