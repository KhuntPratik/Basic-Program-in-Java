public class MaxSubarray {
    
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currnertSum = arr[0];

        int maxSum = arr[0];

        for(int i = 1 ; i<arr.length ; i++){
            currnertSum = Math.max(arr[i] , currnertSum + arr[i]);

            maxSum  = Math.max(maxSum , currnertSum);
        }

        System.err.println(maxSum);
    }
}
