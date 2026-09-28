
import java.util.HashMap;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 5, 4};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int k = arr[i];

            if (hm.containsKey(k)) {
                hm.put(k, hm.get(k) + 1);
            } else {
                hm.put(k, 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                System.out.println("First duplicate: " + arr[i]);
                break;
            }
        }
    }
}
