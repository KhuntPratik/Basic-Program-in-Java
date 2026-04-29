// 46 WAP to sort an Array using Bucket sort.



import java.util.*;

class main {

    // Function to perform bucket sort
    public static void bucketSort(float arr[], int n) {
        if (n <= 0)
            return;

        // Create n empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        // Put array elements into different buckets
        for (int i = 0; i < n; i++) {
            int index = (int)(arr[i] * n); // index in bucket
            buckets[index].add(arr[i]);
        }

        // Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float arr[] = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f};
        int n = arr.length;

        bucketSort(arr, n);

        System.out.println("Sorted array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}