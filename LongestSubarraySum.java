import java.util.HashMap;

public class LongestSubarraySum {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 9;

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(0, -1);
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (hm.containsKey(sum - target)) {
                int previousIndex = hm.get(sum - target);

                int length = i - previousIndex;

                if (length > maxLength) {
                    maxLength = length;
                }
            }

            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        System.out.println("Longest subarray length: " + maxLength);
    }
}
