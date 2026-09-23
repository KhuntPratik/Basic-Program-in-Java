
import java.util.HashSet;

class main{
    public static void main(String[] args) {
        String n = "pwwkew";
        int ans = 0 ; 

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for(int i= 0 ; i<n.length(); i++){
            char ch = n.charAt(i);

            while(set.contains(ch)){
                set.remove(n.charAt(left));
                left++;
            }

            set.add(ch);

            int length = i-left+1;

            if(length>max){
                max = length;
            }
        }

        System.out.println(max);
    }
}