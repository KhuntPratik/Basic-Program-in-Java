// 17 WAP to convert a Binary to Decimal.

class main {
    public static void main(String[] args) {

        int binary = 10011101;
        int decimal = 0;
        int i = 0;

        while (binary != 0) {
            int rem = binary % 10;
            decimal += rem * Math.pow(2, i);
            binary = binary / 10;
            i++;
        }

        System.out.println(decimal);
    }
}