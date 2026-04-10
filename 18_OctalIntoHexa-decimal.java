// 18 WAP to convert an Octal into hexa-decimal.

class main {
    public static void main(String[] args) {

        int octal = 17;   // Example
        int decimal = 0;
        int base = 1;

        // Octal to Decimal
        while (octal > 0) {
            int rem = octal % 10;
            decimal += rem * base;
            base *= 8;
            octal /= 10;
        }

        // Decimal to Hexadecimal
        String hex = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            int rem = decimal % 16;
            hex = hexChars[rem] + hex;
            decimal /= 16;
        }

        System.out.println("Hexadecimal = " + hex);
    }
}