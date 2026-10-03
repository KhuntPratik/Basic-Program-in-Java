
import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcdde";

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);

            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }

       
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) {
                System.out.println("First Non Repeating Character: " + str.charAt(i));
                break;
            }
        }
    }
}
