// 47 WAP to sort an Array using Radix sort

class main {

    // Function to get maximum value in array
    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    // A function to do counting sort based on digit (exp)
    static void countingSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int count[] = new int[10]; // digits 0-9

        // Initialize count array
        for (int i = 0; i < 10; i++)
            count[i] = 0;

        // Store count of occurrences
        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that it contains actual position
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy output array to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Main Radix Sort function
    static void radixSort(int arr[], int n) {
        int max = getMax(arr, n);

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, n, exp);
    }

    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;

        radixSort(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}