package Hashing;

import java.util.HashSet;
import java.util.Set;

//Find out the pair from array whose sum forms the number 'x' when both the numbers of the pair are added
public class Hashing8 {
    public static void main(String[] args) {
        int[] arr ={0, -1, 2, -3, 1};
        int x =-2;

       HashSet<Integer> pairSet = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            int temp = x + arr[i];
            if(pairSet.contains(temp))
            {
                System.out.println("true");
                return;
            }
            else
            {
                pairSet.add(temp);
            }
        }
        System.out.println("False");
    }
}
