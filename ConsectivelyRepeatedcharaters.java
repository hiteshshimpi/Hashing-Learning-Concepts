package Hashing;
// Given a string, remove the consecutively repeated characters. For example - aabbbcabcbb to cabc.
public class ConsectivelyRepeatedcharaters {
    public static void main(String[] args) {
        String str= "aabb";
       int i =0;
       String result ="";
       while (i<str.length()-1)
       {
           if(str.charAt(i)!=str.charAt(i+1))
           {
               result =result+str.charAt(i);
           }
           i++;
       }
       result=result+str.charAt(str.length()-1);
        System.out.println(result);
    }
}
