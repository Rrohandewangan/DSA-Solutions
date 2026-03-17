import java.util.ArrayList;
import java.util.List;

public class SubSet1 {
    
    // TC -> O(2pow(n) * n)
    // SC -> O(2pow(n) * n)
    static void printSubsets(int[] arr, int i, ArrayList<Integer> curr, List<List<Integer>> result) {
        if(i == arr.length) {
            result.add(new ArrayList<>(curr)) ;
            return ;
        }
            
        // include element 
        curr.add(arr[i]) ;
        printSubsets(arr, i+1, curr, result);

        // exclude or backtrack ->
        curr.remove(curr.size() - 1) ;
        printSubsets(arr, i+1, curr, result);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;
        printSubsets(nums, 0, new ArrayList<>(), result) ;
        return result ;
    }
    public static void main(String[] args) {
        
    }
}
