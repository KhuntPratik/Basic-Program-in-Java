import java.util.HashMap;

public class SubarraySum {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 2};
        int target = 8;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);


        int sum = 0;


        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];

               if (hm.containsKey(sum - target)) {
                System.out.println("Subarray found");
                break;
            }
            hm.put(sum, i);

        }


    }
}
