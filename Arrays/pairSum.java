import java.util.ArrayList;
import java.util.Arrays;

public class pairSum {
     // time complexity ->  O(n)
    // public static  void pairSum(int[] arr, int target) {
    //     ArrayList list = new ArrayList<>() ;
    //     int i = 0 ; 
    //     int j = arr.length - 1 ;
    //     while(i < j) {
    //         int pairSum = arr[i] + arr[j] ;
    //         if(pairSum > target) {
    //             j-- ;
    //         } else if(pairSum < target) {
    //            i++ ;
    //         } else {
    //           list.add(i) ;
    //           list.add(j) ;
    //           break ;
    //         }
    //     }
    //     System.out.println(list.get(0)+","+" "+list.get(1));
    // }

    // // time complexity -> O(n2)
    // public static void pairSum(int[] arr, int target) {
    //     int n = arr.length ;

    //     ArrayList list = new ArrayList<>() ;

    //     for(int i=0; i<n; i++) {
    //         for(int j=i+1; j<n; j++) {
    //             if(arr[i] + arr[j] == target) {
    //                 list.add(i) ;
    //                 list.add(j) ;
    //             }
    //         }
    //     }
    //     System.out.println(list.get(0)+","+" "+list.get(1));

    // }

    // Brute force apporach
    // TC -> O(n2)
    // SC -> O(1)
    // public static int[] pairSum(int[] arr, int target) {
    //     int n = arr.length ;
    //     for(int i=0; i<n; i++) {
    //         for(int j=i+1; j<n; j++) {
    //             if(arr[i]+arr[j] == target) {
    //                 return new int[]{i, j} ;
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1} ;
    // }

    // optimal apporach
    // TC -> O(n)
    // SC -> O(1)
    public static int[] pairSum(int[] arr, int target) {
        int n = arr.length ;
        int i=0 ;
        int j=n-1 ;

        while(i < j) {
        int pairSum = arr[i]+arr[j] ;

        if(pairSum > target) {
            j-- ;
        } 
        else if(pairSum < target) {
            i++ ;
        }
        else {
            return new int[]{i,j} ;
        }
        }
        return new int[]{-1,-1} ;
    }
    public static void main(String[] args) {
     
        int target = 26 ;
        int[] arr = {2, 7, 11, 15} ;
       
        System.out.println(Arrays.toString(pairSum(arr, target)));
       
    }
}
