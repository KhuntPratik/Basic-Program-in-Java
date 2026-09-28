import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {

        String str1 = "aab";
        String str2 = "aaa";

        if (str1.length() != str2.length()) {
            System.out.println("Invalid Anagram");
            return;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (!hm.containsKey(ch)) {
                System.out.println("Invalid Anagram");
                return;
            }

            hm.put(ch, hm.get(ch) - 1);

            if (hm.get(ch) == 0) {
                hm.remove(ch);
            }
        }

        if (hm.isEmpty()) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Invalid Anagram");
        }
    }
}