import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveSeqInArr {

    // brute force approach ->
    // TC -> O(n2)
    // SC -> O(1)
    // static boolean linearSearch(int[] arr, int num) {
    //     for(int i=0; i<arr.length; i++) {
    //         if(arr[i] == num) {
    //             return true ;
    //         }
    //     }
    //      return false ;
    // }

    // static int consecutiveSeq(int[] arr) {
    //     int n = arr.length ;
    //     int longest = 1 ; // to store longest conse. seq of array
    //     for(int i=0; i<n; i++) {
    //           int x = arr[i] ; // current number
    //           int currLongest = 1 ;  // to store the current longest seq. of consecutive number

    //         while(linearSearch(arr, x + 1)) { // check next consecutive number exist in arr or not

    //             x += 1 ; // update current number
    //             currLongest += 1 ; // update count of con. numbers
    //         }

    //         longest = Math.max(longest, currLongest) ;
    //     }
      
    // return longest ;

    // }


    // better approach -> 
    // TC -> O(nlogn)
    // sc -> O(1)
    static int consecutiveSeq(int[] arr) {
        int n = arr.length ;
         if(n == 0) {
            return 0 ;
        }

        Arrays.sort(arr) ;

        int longest = 1 ; // to store longest conse. seq of array 
        int currLongest = 1 ; // to store curr longest conse. seq of array

        for(int i=1; i<n; i++) {

            if(arr[i] == arr[i-1] + 1) { // check current element is part of sequence or not
                currLongest += 1 ;
            } else if(arr[i] != arr[i-1]) { // if seq is break then start currLOngest from 1 
                currLongest = 1 ;
            }
             
            longest = Math.max(longest, currLongest) ;
        }
       return longest ;
    }

    // optimal approach is after study set ..
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 1, 1, 2, 100, 2, 100, 102, 101} ;

        System.out.println(consecutiveSeq(arr));
    }
}
