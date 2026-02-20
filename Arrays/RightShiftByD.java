import java.util.Arrays;

public class RightShiftByD {

    // public static void rotateArray(int[] nums, int k) {
    //   int n = nums.length ;
    //   int[] temp = new int[n] ;
    //   for(int i=0; i<n; i++) {
    //     temp[(i+k) % n] = nums[i] ;
    //   } 

    //   for(int i=0; i<n; i++) {
    //     nums[i] = temp[i] ;
    //     System.out.print(nums[i]+" ");
    //   }
    // }
    // public static void main(String[] args) {
    //   int nums[] = {1,2,3,4,5} ;
    //    int k = 3 ;
    //    rotateArray(nums, k);
    // }




    
    // Rotate array right by k positon.


    // BruteForce apporach -> 

    static void rotate(int[] arr, int k) {
    int n = arr.length ;
    int[] temp = new int[k] ;
    k = k % n ;

    // store last k element in temp array
    for(int i=0; i<k; i++) {
        temp[i] = arr[n-k+i];
    }

    // shift remaining element of array to right by k
    for(int i=n-1; i>=k; i--) {
        arr[i] = arr[i-k] ;
    }

    // put back form temp to original array
    for(int i=0; i<k; i++) {
        arr[i] = temp[i] ;
        
    }

    for(int i=0; i<n; i++) {
        System.out.print(arr[i]+" ");
    }
    
    }


    // Optimal approach.
    // TC -> O(2n)
    // SC -> O(n)
//       public static void rotate(int[] arr, int k) {
//         int n = arr.length ;
//         int[] temp = new int[n] ;

//         for(int i=0; i<n; i++) {
//             temp[(i+k)%n] = arr[i] ;
//         }

//         for(int i=0; i<n; i++) {
//             arr[i] = temp[i] ;
//             System.out.print(arr[i]+" ");
//         }

// } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7} ;
        int k = 3 ;
        rotate(arr, k);
    }
}
