
public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int large = arr[0];
        int sl = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (large < arr[i]) {
                sl = large;
                large = arr[i];
            } else if (arr[i] > sl) {
                sl = arr[i];
            }
        }

        System.out.println(sl);
    }
}
