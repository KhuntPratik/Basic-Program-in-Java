public class SecondSmallest {
    public static void main(String [] args){

        int[] arr = {10, 5, 20, 3, 8};

        int smallest  = arr[0];
        int secondSmallest   = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<smallest ){
                secondSmallest   = smallest ;
                smallest  = arr[i];
            }else if(arr[i] < secondSmallest  ){
                secondSmallest   = arr[i];
            }
        }

        System.out.print(secondSmallest  );
    }
}
