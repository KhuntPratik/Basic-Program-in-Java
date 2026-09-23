public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int st = 0;
        int ls = arr.length-1;

        for(int i = st ; i<ls ; i++){
            int temp = arr[st];
            arr[st] = arr[ls];
            arr[ls] = temp;

            st++;
            ls--;
        }

        for(int i : arr){
            System.out.println(i);
        }

    }
}
