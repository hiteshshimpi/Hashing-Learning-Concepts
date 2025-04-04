package Hashing;

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

           }
        }
        System.out.println("Optimized Method **********");
        optimizedHash();
    }


    public static void optimizedHash()
    {
        String str = "abacabad";
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i =0;i<str.length();i++)
        {
            char c =str.charAt(i);
            Integer charCount =hash.get(c);
            hash.put(c,charCount==null ? 1 : charCount+1 );
        }
        System.out.println(hash);
    }
}
