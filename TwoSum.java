import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };

        int target = 9;

        HashMap<Integer, Integer> hm = new HashMap<>();

        

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];
            if (hm.containsKey(required)) {
                System.out.println(required + " + " + arr[i] + " = " + target);
            }

            hm.put(arr[i], i);
        }
    }
}
