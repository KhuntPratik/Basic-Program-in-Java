
import java.util.HashMap;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 4, 3, 2, 5};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.print(hm);

    }
}
