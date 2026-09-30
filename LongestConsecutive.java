import java.util.HashSet;

public class LongestConsecutive {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // Store all elements
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int longest = 0;

        // Find sequence
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            // Check if num is the starting point
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                if (count > longest) {
                    longest = count;
                }
            }
        }

        System.out.println("Longest consecutive length: " + longest);
    }
}