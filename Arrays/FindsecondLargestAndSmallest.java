public class FindsecondLargestAndSmallest {

    // Brute Force of this que is -> O(nlogn + n)
    // better apporach is -> O(2n)
   // optimal solution -> O(n)
//     public static int findLargest(int[] arr) {
//         int n = arr.length ;
//         int max = Integer.MIN_VALUE ;
//         int secMax = Integer.MIN_VALUE ;
//         for(int i=0; i<n; i++) {
//             if(arr[i] > max) {
//                 secMax = max ;
//                 max = arr[i] ;
//             } else if(arr[i] > secMax && arr[i] != max) {
//                 secMax = arr[i] ;
//             }
//         }
//         return secMax ;
//     } 
//  public static int findsmallest(int[] arr) {
//         int n = arr.length ;
//         int min = Integer.MAX_VALUE ;
//         int secMin = Integer.MAX_VALUE ;
//         for(int i=0; i<n; i++) {
//              if(arr[i] < min) {
//                 secMin = min ;
//                  min = arr[i] ;
//              }
             
//             //  min = Math.min(min, arr[i]) ;
//         }
//         for(int i=0; i<n; i++) {
//             if(arr[i] < secMin && arr[i] != min) {
//                 secMin = arr[i] ;
//             }
//         }
//         return secMin ;
//     }     


//     public static void main(String[] args) {
//         int arr[] = {2,5,1,3,0};
//         System.out.println("second largest element in array "+findLargest(arr));
//         System.out.println("second smallest element in array "+findsmallest(arr));

//     }

// optimal solution -> O(n)

static int secondMax(int[] arr) {
    int n = arr.length ;
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MIN_VALUE;

    for(int i=0; i<n; i++) {
        if(arr[i] > max) {
            secMax = max ;
            max = arr[i] ;
        } 
        else if(arr[i] > secMax && arr[i] != max) {
            secMax = arr[i] ;
        }
    }
    return secMax ;
}
static int secondMin(int[] arr) {
    int n = arr.length ;
    int min = Integer.MAX_VALUE;
    int secMin = Integer.MAX_VALUE;

    for(int i=0; i<n; i++) {
        if(arr[i] < min) {
           secMin = min ;
           min = arr[i] ;
        } 
        else if(arr[i] < secMin && arr[i] != min) {
            secMin = arr[i] ;
        }
    }
    return secMin ;
}
public static void main(String[] args) {
    int[] arr = {1, 2, 4, 7, 7, 5} ;
    int ans = secondMax(arr) ;
    System.out.println("Second Largest element in array = "+ans);

    int ans2 = secondMin(arr) ;
    System.out.println("second smallest element in array = "+ans2);
}
}

