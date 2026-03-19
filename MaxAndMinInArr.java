import java.lang.reflect.Array;
import java.util.ArrayList;

public class MaxAndMinInArr {
    
    // TC => O(n)
    // SC -> O(n)
    // static ArrayList<Integer> maxAndMin(int[] arr, int i, int max, int min) {
    //     if(i == arr.length) {
    //         ArrayList<Integer> ans = new ArrayList<>() ;
    //         ans.add(max) ;
    //         ans.add(min) ;
    //         return ans;
    //     }

    //     if(arr[i] > max) {
    //         max = arr[i] ;
    //     } 

    //     if(arr[i] < min) {
    //         min = arr[i] ;
    //     }

    //     return maxAndMin(arr, i+1, max, min);
    // }

    static ArrayList<Integer> findMaxAndMin(int[] arr) {
        return maxAndMin(arr, arr.length-1) ;
    }

    static ArrayList<Integer> maxAndMin(int[] arr, int i) {
        if(i == 0) {
            ArrayList<Integer> base = new ArrayList<>() ;
            base.add(arr[0]) ;
            base.add(arr[0]) ;
            return base;
        }

        ArrayList<Integer> ans = maxAndMin(arr, i - 1) ;

        int max = ans.get(1) ;
        int min = ans.get(0) ;

        // min
        if(arr[i] < min) ans.set(0, arr[i]) ;
        if(arr[i] > max) ans.set(1, arr[i]) ;

        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, -5, 8, 1} ;
        // ArrayList<Integer> list = maxAndMin(arr, 0, arr[0], arr[0]) ;

        // System.out.println(list);

        ArrayList<Integer> result = findMaxAndMin(arr) ;
        System.out.println(result);
    }
}