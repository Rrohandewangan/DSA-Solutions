public class DNF {
    
    // TC -> O(n)
    // this solution is also correct but it is done by 2 passes 

    //    public void sortColors(int[] nums) {
    //     int n = nums.length ;
    //     int count0 = 0, count1 = 0, count2 = 0 ;
    //     for(int i=0; i<n; i++) {
    //         if(nums[i] == 0) {
    //             count0++ ;
    //         } else if(nums[i] == 1) {
    //             count1++ ;
    //         } else {
    //             count2++ ;
    //         }
    //     }

    //     // for zeros overwrite 
    //     int idx = 0 ;
    //     for(int i=0; i<count0; i++) {
    //         nums[idx++] = 0 ;
    //     }
    //      for(int i=0; i<count1; i++) {
    //         nums[idx++] = 1 ;
    //     }
    //      for(int i=0; i<count2; i++) {
    //         nums[idx++] = 2 ;
    //     }
    //    } 


  // Dutch National Flag Algorithm
  // Sorting array with 0s , 1s, 2s

  public static void dnf(int[] arr, int n) {
     int low=0, mid=0, high=n-1 ;
     while(mid <= high) {
        if(arr[mid] == 0) {
            int temp = arr[mid] ;
            arr[mid] = arr[low] ;
            arr[low] = temp ;
            low++; mid++ ;
        } else if(arr[mid] == 1) {
            mid++ ;
        } else {
            int temp = arr[mid] ;
            arr[mid] = arr[high] ;
            arr[high] = temp ;
            high-- ;
        }
     }

     for(int i=0; i<n; i++) {
        System.out.print(arr[i]+" ");
     }
  }
    public static void main(String[] args) {
     int[] arr = {2,0,2,1,1,0,2,0,0} ;
     int n = arr.length ;

    dnf(arr, n);
    }
}
