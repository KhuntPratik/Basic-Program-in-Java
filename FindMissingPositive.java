public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = arr.length+1;

        int expected = n * (n + 1) / 2;

        int actual = 0;

        for(int i = 0 ; i<arr.length ; i++){
            actual += arr[i];
        }


        System.out.println(expected-actual);
    }
}
