
public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int l1 = arr1.length;
        int l2 = arr2.length;

        int sum = l1 + l2;

        int[] newarr = new int[sum];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newarr[k] = arr1[i];
                i++;
            } else {
                newarr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            newarr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            newarr[k] = arr2[j];
            j++;
            k++;
        }

        for (int x : newarr) {
            System.out.print(x + " ");
        }

    }

}
