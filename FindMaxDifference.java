public class FindMaxDifference {
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Maximum difference: " + difference);
    }
}