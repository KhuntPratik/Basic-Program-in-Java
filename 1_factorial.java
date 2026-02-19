import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        int count = 1;

       for (int i=1 ; i<=n ; i++){
            count = count*i;
       }

       System.out.println(count);
    }
}


// import java.util.Scanner;

// class FactorialRecursion {

    
//     static long factorial(int n) {
//         if (n == 0 || n == 1) {   
//             return 1;
//         }
//         return n * factorial(n - 1); 
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         long result = factorial(n);

//         System.out.println("Factorial = " + result);

//         sc.close();
//     }
// }
