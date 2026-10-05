
// import java.util.HashMap;

// public class MajorityElement {

//     public static void main(String[] args) {
//         int[] arr = {2, 2, 1, 2, 3, 2, 2};

//         HashMap<Integer, Integer> hm = new HashMap<>();

//         for (int i = 0; i < arr.length; i++) {

//             int k = arr[i];

//             if (hm.containsKey(k)) {
//                 hm.put(k, hm.get(k) + 1);
//             } else {
//                 hm.put(k, 1);
//             }
//         }

//         for (Integer key : hm.keySet()) {
//             if (hm.get(key) > arr.length / 2) {
//                 System.out.println("Majority element: " + key);
//             }
//         }
//     }
// }

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 3, 3, 5};

        int candidate = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(candidate == arr[i]){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
        }

        System.out.println("Candidate: " + candidate);
    }
}