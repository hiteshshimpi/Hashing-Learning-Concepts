package DSA_2Pointers_Problems;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abacabad";
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i =0;i<str.length();i++)
        {
            if(!hash.containsKey(str.charAt(i)))
            {
                hash.put(str.charAt(i),1);
            }
            else {
                hash.put(str.charAt(i),hash.get(str.charAt(i))+1);
            }
        }
        System.out.println(hash);


        for (int i=0;i<str.length();i++)
        {
           int val = hash.get(str.charAt(i));
           if(val==1)
           {
               System.out.println(str.charAt(i));
               return;
           }
        }
    }
}
