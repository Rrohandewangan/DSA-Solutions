public class findPeakElement {
    
    // public static int findPeakElement(int[] nums) {
    //     int n = nums.length ;
    //     int peak = 0 ;
    //     if(n == 1) {
    //         return 0 ;
    //     }
    //      if(nums[0] > nums[1]) {
    //         peak = 0 ;
    //      }

    //      if(nums[n-1] > nums[n-2]) {
    //         peak = n-1 ;
    //      }
    //     for(int i=1; i<n-1; i++) { 
    //         if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
    //             peak = i ;
    //        }
    //     }
    //     return peak ;
    // } 

   


         //for  hard problem ->
        //  public int findInMountainArray(int target, MountainArray mountainArr) {
        // int n = nums.length ;
        // int peak = 0 ;

        //  if(n == 1) {
        //    return 0 ;
        // }
        //  if(nums[0] > nums[1]) {
        //     peak = 0 ;
        //  }
        //  if(nums[n-1] > nums[n-2]) {
        //     peak = n-1 ;
        //  } 

        //  int st=1, end=n-2 ;

        //  while (st<= end)  {
        //     int mid = st+(end-st)/2 ;

        //     if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]) {
        //         peak = mid ;
        //     }

        //     if(nums[mid-1] < nums[mid]) {
        //         st = mid+1 ;
        //     }
        //     if(nums[mid] > nums[mid+1]) {
        //         end=mid-1 ;
        //     }

        //  }

        //  return peak ;
            
         }

    
    
    public static void main(String[] args) {
       int[] mounta = {1,2,1,3,5,6,4} ;
       System.out.println(findPeakElement(nums));


    }
}
