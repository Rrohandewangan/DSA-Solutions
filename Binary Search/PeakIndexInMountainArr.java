
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakIndexInMountainArr {

// this is appicable for medium problem -> 162
// TC -> O(logn)
// SC -> O(1)

    public static int peakIndexInMountainArray(int[] arr) {
      int n = arr.length ;
      int st = 0, end = n - 1 ;

       if(n == 1) {
           return 0 ;
        }
         if(arr[0] > arr[1]) {
           return 0 ;
         }
         if(arr[n-1] > arr[n-2]) {
            return n-1 ;
         } 

      while(st < end) { // = is not added because it give out of bound and TLE error.
        int mid = st+(end-st) / 2 ;

       if(arr[mid] > arr[mid+1]) {
       // you are in ace part of array
      // this may be the ans, but look at left
      // this is why end != mid - 1 
       end = mid ; 
      } else {
        // you are in dec part of array
        // because we know that mid + 1 element > mid element
        st = mid + 1 ;
      }
      }
      // in  the end, start == end and pointing to the largest number because of the 2 check above.
      // start and end are always trying to find max element in above 2 checks 
      // hence, when they finding to just one element. that is the max one because that is what check say
    return end; // or return end as both are equal.
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0} ;

        System.out.println(peakIndexInMountainArray(arr));
    }
}
