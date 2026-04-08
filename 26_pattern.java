// 26 Print a following paƩ ern 
// ********* 
// **** **** 
// ***  *** 
// **    ** 
// *      *

class main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            int spaces = (n - i) * 2;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}