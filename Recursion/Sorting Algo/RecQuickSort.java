import java.util.Arrays;

public class RecQuickSort {

    // best case TC -> O(nlog(n))
    // worst case TC -> O(n2)
    // SC -> O(1)
    
    static void sort(int[] nums, int low, int high) {
        if(low >= high) {
            return ;
        }

        int s = low ;
        int e = high ;
        int mid = s + (e - s) / 2 ;
        int pivot = nums[mid] ;

        while(s <= e) {
            // also a reason why if its already sorted it will not swap 
            while(nums[s] < pivot) {
                s++ ;
            }
            while(nums[e] > pivot) {
                e-- ;
            }

            if(s <= e) {
                int temp = nums[s] ;
                nums[s] = nums[e] ;
                nums[e] = temp ;
                s++; e-- ;
            }
        }

        // now my pivot is at correct index, please sort two halves now 
        sort(nums, low, e);
        sort(nums, s, high);
    }
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1} ;
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
