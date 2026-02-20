// public class FloorAndCeillingOfarray {
    
// public static int findFloor(int[] arr, int n, int x) {
//     int st=0, end = n-1 ;
//     int ans = -1 ;
//     while(st <= end) {
//       int mid = st +(end-st)/2 ;

//       if(arr[mid] <= x) {
//         ans = arr[mid] ;
//         st = mid+1 ;
//       } else {
//         end = mid-1 ;
//       }
//     }
//     return ans ;
// }
// public static int findCeiling(int[] arr, int n, int x) {
//     int st=0, end = n-1 ;
//     int ans = -1 ;
//     while(st <= end) {
//       int mid = st +(end-st)/2 ;

//       if(arr[mid] >= x) {
//         ans = arr[mid] ;
//         end = mid-1 ;
//       } else {
//         st = mid+1 ;
//       }
//     }
//     return ans ;
// }

// public static int[] getFloorAndCeilling(int[] arr, int n, int x) {
//     int floor = findFloor( arr, n, x) ;
//     int ceilling = findCeilling(arr, n, x) ;

//     return new int[] {floor, ceilling} ;
    

// }
//     public static void main(String[] args) {
//     int n = 6 ;
//     int arr[] ={3, 4, 4, 7, 8, 10} ;
//     int x = 5 ;

//     int ans[] = getFloorAndCeiling(arr, n, x) ;
//     System.out.println("the floor and ceiling are "+ans[0]+" "+ans[1]) ;
//     }
// }


// 2nd Times solve ->


// for both solution 
// TC -> O(logn)
// SC -> O(1)

public class FloorAndCeilingOfarray {

  // que1. ->
  // Ceiling -> smallest element in array greater or = target.
  

  static int ceiling(int[] arr, int target) {

    int n = arr.length ; 
    // if no element in array greater then target return -1.
    if(target > arr[n-1]) {
      return -1 ;
    }
    int st = 0 , end = n-1 ;
    
    while(st <= end) {
      int mid = st+(end-st)/2 ;
      
      if(target < arr[mid]) {
        end = mid - 1 ;
      } else if(target > arr[mid]) {
        st = mid + 1 ;
      } else {
        return mid ;
      }
    }
    return st ;
  }


// que.2 ->
// floor -> greatest element in array smaller or = target 
static int floor(int[] arr, int target) {

    int n = arr.length ; 
    // if no element is less than target then return -1 .
     if(target > arr[n-1]) {
      return -1 ;
    }
    int st = 0 , end = n-1 ;
    
    while(st <= end) {
      int mid = st+(end-st)/2 ;
      
      if(target < arr[mid]) {
        end = mid - 1 ;
      } else if(target > arr[mid]) {
        st = mid + 1 ;
      } else {
        return mid ;
      }
    }
    return end ;
  }
  public static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14, 16, 18} ;
    int target = 1;

    System.out.println("ceiling of array "+ceiling(arr, target));
    System.out.println("floor of array "+floor(arr, target));
  }
}