import java.util.Scanner ;
public class FindMinInsortedRotatedArray {
    
  public static int findMin(int[] nums) {
     int n = nums.length ;
     int min = Integer.MAX_VALUE ;
     int st=0, end=n-1 ;

     while(st <= end) {
      int mid = st+(end-st)/2 ;

      if(nums[st] <= nums[mid]) {
        if(nums[st] < min) {
          min = nums[st] ;
        }
        st = mid+1 ;
      } else {
        if(nums[mid] < min) {
          min = nums[mid] ;
        }
        end = mid-1 ;
      }
     }
     return min ;
  }
    public static void main(String[] args) {
    int[] nums = {3,4,5,1,2} ;
    System.out.println(findMin(nums));
}
}