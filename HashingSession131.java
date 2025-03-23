package Hashing;
//Java Program for Count pairs with given sum
import java.util.HashMap;

public class HashingSession131 {
    public static void main(String[] args) {
        int [] arr ={3,2,1,5,4};
        int k =2;
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
