import java.util.ArrayList;

public class CreateTarArr {
    
    // brute force approach ->
    // TC -> O(n2)
    // SC -> O(n)
    //  public int[] createTargetArray(int[] nums, int[] index) {
    //     int n = nums.length ;
    //     int[] tar = new int[n] ;
    //     int size = 0 ;

    //     for(int i=0; i<n; i++) {
    //         int pos = index[i] ;
    //         // check we need to shift the element or not
    //         if(pos < size) {
    //             for(int j=size; j>pos; j--) {
    //                 tar[j] = tar[j-1];
    //             }
    //         }

    //         tar[pos] = nums[i] ;
    //             size++ ;
    //     }
    //     return tar ;
    // }

     // TC -> o(n2)
    // SC -> O(n)
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length ;
        int[] tar = new int[n] ;
        ArrayList<Integer> temp = new ArrayList<>() ;

        for(int i=0; i<n; i++) {
            temp.add(index[i], nums[i]) ;
        }

        for(int i=0; i<n; i++) {
            tar[i] = temp.get(i) ;
        }

        return tar ;
    }
    public static void main(String[] args) {
        
    }
}