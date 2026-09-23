public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int  n = 5 ;

        int expected = n *(n+1)/2;

        int actual = 0;

        for(int i = 0 ;i<arr.length ; i++){
            actual += arr[i];
        }

        System.out.print(expected - actual);

    }
}