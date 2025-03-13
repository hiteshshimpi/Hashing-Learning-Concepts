package Hashing;


// Problem :  count all (i,j) pairs such tthat b[i]+b[j] == k count such pairs

public class Hashingsession2 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 2, 5};
        int k = 4;
        int count =bruteForceSol1(arr,k);
        System.out.println(count);

    }

    public static  int bruteForceSol1(int [] arr,int k)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length-1;j++)
            {
                    if(arr[i]+arr[j]==k)
                    {
                        count++;
                    }
            }
        }
        return count;
    }
}
