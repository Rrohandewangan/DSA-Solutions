public class moveToZeroToEnd {
     public static  void moveZeroes(int[] nums, int n) {

    int arr[] = new int[n] ;
    int idx = 0 ;
    
    for(int i=0; i<n; i++) {
        if(nums[i] != 0) {
            arr[idx] = nums[i] ;
            idx++ ;
        }
    }

    for(int i=0; i<n ; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();



    }
    public static void main(String[] args) {
    
        int[] nums = {0,1,0,3,12} ;

        int n = nums.length ;

        moveZeroes(nums, n);
    } 
}


