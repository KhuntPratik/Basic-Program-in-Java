import java.util.*;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if(s.length() != t.length()){
            System.out.println("False");
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
             System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}