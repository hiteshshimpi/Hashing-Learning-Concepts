package Hashing;


import java.util.HashMap;

// check if there are any two equal/ same numbers in a array at a distance k
public class HashingSession1 {
    public static void main(String[] args) {

        int arr[] = {3, 1, 2, 3, 2};
        int k=1;
        int count=0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hash.containsKey(arr[i]))
            {
                hash.put(arr[i],i+1);
            }
            else {
                int val = hash.get(arr[i]);
                System.out.println(val);

                int sub = (i - val);
                System.out.println("substraction : "+sub);
                if(sub ==k)
                {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
