package Hashing;


//Find out the element occurance in the array  using brute force
public class Hashing1 {
    public static void main(String[] args) {
        int[] arr={1,1,3,4,5,1,2,5,3,4,4,4};
        int query[] ={1,5,4};
        int count =0;
        for(int i =0;i<query.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j] == query[i])
                {
                    count++;
                }
            }
            System.out.println("Count is "+count);
            count=0;
        }
    }
}
