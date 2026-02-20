import java.util.ArrayList;

public class findLeaderElement {
 
    // Time Complexity -> O(n2)

    // public static void findLeaderEle(int[] arr) {
    //     int n = arr.length ;
    //    ArrayList<Integer> list = new ArrayList<>() ;
    //    for(int i=0; i<n; i++) {
    //      boolean leader = true ;
    //     for(int j=i+1; j<n; j++) {
    //        if(arr[j] > arr[i]) {
    //          leader = false ;
    //          break ;
    //        }
    //     }
    //      if(leader) {
    //        list.add(arr[i]);
            
    //      }
    //    }
    //    for(int val : list) {
    //     System.out.print(val+" ");
    //    }
    // }

    // Time Complexity -> O(n) // space complexity -> O(n)
    
    // public static void findLeaderEle(int[] arr) {
    //     int n = arr.length ;
    //     ArrayList<Integer> list = new ArrayList<>() ;
    //     int max = arr[n-1] ;
    //     list.add(arr[n-1]) ;
    //     for(int i=n-2; i>=0; i--) {
    //       if(arr[i] > max) {
    //         list.add(arr[i]) ;
    //         max = arr[i] ;
    //       }
    //     }
    //   for(int val:list) {
    //   System.out.print(val+" ");
    //   }
    // }
    public static void main(String[] args) {
     int[] arr = {4,7,1,0} ;
     findLeaderEle(arr);
    }
}
