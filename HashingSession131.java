package Hashing;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class HashingSession131 {
    public static void main(String[] args) {
        int [] arr ={10, 12, 10, 15, -1, 7, 6,
                5, 4, 2, 1, 1, 1};
        int k =11;
        int count=0;
        HashMap<Integer,Integer>hash = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int expectedKey = k -arr[i];
            if(hash.containsKey(expectedKey))
            {
                count++;
            }
            hash.put(arr[i],i);
        }
        System.out.println(hash);
        System.out.println(count);
    }
}
