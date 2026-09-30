public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String ans ="" ;

        for(int i = str.length()-1 ; i>=0 ; i--){
            char ch = str.charAt(i);

            ans += ch;
        }

        System.out.print(ans);
    }
}
