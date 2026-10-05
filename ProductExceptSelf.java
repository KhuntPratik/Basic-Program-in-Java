public class ProductExceptSelf {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int[] result = new int[arr.length];

        // Left product
        int left = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = left;
            left = left * arr[i];
        }

        // Right product
        int right = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * right;
            right = right * arr[i];
        }

        for(int i : result){
            System.out.println(i);
        }
    }
}