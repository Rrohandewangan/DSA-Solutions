//https://leetcode.com/problems/missing-number/description/

public class missingNumber {
    
    // // Brute force apparoach // run loop on each element
    // // TC -> o(n2)
    // // SC -> O(1)
    // public static int missingNumber(int[] arr) {
    //     int N = 4 ;
    //     int n = arr.length ;

    //     for(int i=0; i<N; i++) {
    //         int flag = 0 ;
    //         for(int j=0; j<n; j++) {
    //             if(arr[j] == i) {
    //                 flag=1 ;
    //                 break ;
    //             }
    //         }
    //         if(flag == 0) {
    //             return i ;
    //         }
    //     }
    //     return -1 ;
    //     }


    // Optimal apparoach -> maths formula
    // // TC -> O(n) 
    // // SC -> O(1)
    // public int missingNumber(int[] nums) {
    //     int n = nums.length ;
    //     int sum = n*(n+1)/2 ; // find sum of given range(1,n)
    //     int currSum = 0 ; // variable to track sum of array
    //     int ans = 0; // store answer
    //     for(int i=0; i<n; i++) {
    //        currSum += nums[i] ;
    //     }
    //     ans = sum - currSum ; // after substraction we can get missing number.
    //     return ans ;

    // Optimal apparoach1 -> Using xor because of it will not exceed the range of integer
    // TC -> 
    // SC -> 

    static int missingNumber(int[] arr) {
    int xor1 = 0 ;
    int xor2 = 0 ;
    int N = arr.length ;

    for(int i=0; i<=N-1 ; i++) {
        xor2 = xor2 ^ arr[i] ;
        xor1 = xor1 ^ (i) ;
    }
    xor1 = xor1 ^ N ;

    int ans = xor1 ^ xor2 ;
    return ans ;
    }
   

    public static void main(String[] args) {
        int[] arr = {3,0,1} ;

        System.out.println(missingNumber(arr));

    }
}
