import java.util.ArrayList;

public class ArrayRec {

    // Que1 -> check the array is sorted or not 
    // static boolean sorted(int[] arr, int index) {
    //     // base condition
    //     if(index == arr.length - 1) {
    //         return true ;
    //     }

    //     return arr[index] < arr[index + 1] && sorted(arr, index + 1) ;
    // }

    
    // Que2 -> linear Search on array -> 
    // static boolean linearSearch(int[] arr, int target, int index) {
    //     if(index == arr.length) {
    //         return false ;
    //     }
    //     return arr[index] == target || linearSearch(arr, target, index + 1) ;
    // }

    // // search index
    // static int findIndex(int[] arr, int target, int index) {
    //     if(index == arr.length) {
    //         return -1 ;
    //     }
    //     if(arr[index] == target) {
    //         return index ;
    //     } else {
    //         return findIndex(arr, target, index + 1) ;
    //     }
    // }

    // // find index from last 
    //  static int findIndexLast(int[] arr, int target, int index) {
    //     if(index == -1) {
    //         return -1 ;
    //     }
    //     if(arr[index] == target) {
    //         return index ;
    //     } else {
    //         return findIndexLast(arr, target, index - 1) ;
    //     }
    // }



    // if there is 2 same number in  array ->
    // static ArrayList<Integer> ans = new ArrayList<>() ;
    // static void findAllIndex(int[] arr, int target, int index) {
    //     if(index == arr.length) {
    //         return ;
    //     }
    //     if(arr[index] == target) {
    //         ans.add(index) ;
    //     } 
    //     findAllIndex(arr, target, index + 1);
    // }

    // method return arraylist ->
    // static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> ans) {
    //     if(index == arr.length) {
    //         return ans ;
    //     }
    //     if(arr[index] == target) {
    //         ans.add(index) ;
    //     } 
    //     return findAllIndex(arr, target, index + 1, ans);
    // }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 8, 9, 1} ;
        
        // ArrayList<Integer> list = findAllIndex(arr, 8, 0, new ArrayList<>());
        // System.out.println(list);


    }
}
