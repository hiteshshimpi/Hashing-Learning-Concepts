package Hashing;

import java.util.HashMap;

//First Unique Character in a String
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "letcode";
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hash.containsKey(s.charAt(i))) {
                hash.put(s.charAt(i), 1);
            } else {
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            {
                if (hash.get(s.charAt(i)) == 1) {
                    System.out.println("Index of 1st unqiue character is : " +i);
                    return;
                } else {
                    System.out.println("No unqiue character");
                }
            }
        }
    }
}
