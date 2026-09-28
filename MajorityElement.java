
import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int k = arr[i];

            if (hm.containsKey(k)) {
                hm.put(k, hm.get(k) + 1);
            } else {
                hm.put(k, 1);
            }
        }

        for (Integer key : hm.keySet()) {
            if (hm.get(key) > arr.length / 2) {
                System.out.println("Majority element: " + key);
            }
        }
    }
}
