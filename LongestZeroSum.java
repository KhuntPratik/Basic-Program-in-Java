import java.util.HashMap;

public class LongestZeroSum {
    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10};

        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        hm.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (hm.containsKey(sum)) {

                int previousIndex = hm.get(sum);
                int length = i - previousIndex;

                if (length > maxLength) {
                    maxLength = length;
                }

            } else {
                hm.put(sum, i);
            }
        }

        System.out.println("Longest zero sum subarray length: " + maxLength);
    }
}