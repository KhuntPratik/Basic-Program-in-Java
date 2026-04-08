// 25 Print a following paƩ ern 
// ********* 
//  ******* 
//  ***** 
//  *** 
//  *


class main{
    public static void main(String[] args) {
        for(int i=5 ; i>=1 ; i--){
            for(int j=5 ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int k=i ; k>=1 ; k--){
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}