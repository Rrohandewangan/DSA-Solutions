package Problems.SubsetsAndSubsequence;

import java.util.ArrayList;
import java.util.List; 


// TC -> O(n * 2pow(n))
// SC -> O(2pow(n) * n )
public class ArraySubSet {
    
    // subset in array
    // static List<List<Integer>> subSet(int[] arr) {
    //     List<List<Integer>> outer = new ArrayList<>() ;

    //     outer.add(new ArrayList<>()) ;

    //     for(int num : arr) {
    //         int n = outer.size() ;
    //         for(int i=0; i<n; i++) {
    //             List<Integer> internal = new ArrayList<>(outer.get(i)) ;
    //             internal.add(num) ;
    //             outer.add(internal) ;
    //         }
    //     }

    //     return outer ;
    // }


    // subsets of array with duplicates 
    // static List<List<Integer>> subSetDuplicate(int[] arr) {
    //     List<List<Integer>> outer = new ArrayList<>() ;
    //     outer.add(new ArrayList<>()) ;
    //     int start  = 0 ;
    //     int end = 0 ;

    //     for(int i=0; i<arr.length; i++) {
    //         start = 0 ;
    //         // if current and previous element is same, s = e + 1 ;
    //         if(i > 0 && arr[i] == arr[i-1]) {
    //             start = end + 1 ;
    //         }
    //         end = outer.size() - 1 ;
    //         int n = outer.size() ;
    //         for(int j=start; j<n; j++) {
    //             List<Integer> internal = new ArrayList<>(outer.get(j)) ;
    //             internal.add(arr[i]) ;
    //             outer.add(internal) ;
    //         }
    //     }

    //     return outer ;
    // }


    // Recursive approach -> 

    // TC -> O(2pow(n) * n)
    // SC -> O()
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
    public static void main(String[] args) {
        int[] arr = {1, 2, 3} ;
        List<List<Integer>> result = new ArrayList<>() ;

        printSubsets(arr, 0, new ArrayList<>(), result) ;
        
        for(List<Integer> list : result) {
            System.out.println(list);
        }


    }
}
