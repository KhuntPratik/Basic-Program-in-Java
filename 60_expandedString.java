//  Write a program that should decode the given pattern and print the resulting expanded string

import java.util.*;

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pattern: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            char ch = str.charAt(i);
            int count = str.charAt(i + 1) - '0';

            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        System.out.println("Expanded String: " + result.toString());
    }
}
