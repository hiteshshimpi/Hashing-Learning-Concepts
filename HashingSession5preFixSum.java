package Hashing;


// find the sum of range [l to r] where (l<r) using prefix sum
public class HashingSession5preFixSum {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = 3;
        int r = 7;
        bruteForcePrefixSum(arr,l,r);
        int[] prefix = prefixSum(arr);
        System.out.println("Optimized Sum: " + optimizedSum(prefix, l, r));
    }
        public static void bruteForcePrefixSum ( int arr[], int l, int r )
        {
            int sum = 0;
            while (l <= r) {
                sum = sum + (arr[l] + arr[r]);
                l++;
                r--;
            }
            System.out.println("Sum using Brute Force : " + sum);
        }


    static int[] prefixSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    static int optimizedSum(int[] prefix, int l, int r) {
        return prefix[r] - prefix[l - 1];
    }
}
