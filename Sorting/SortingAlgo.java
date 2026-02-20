import java.util.Arrays;

public class SortingAlgo {
    
    // Bubble sort 
    // TC -> O(n2)
    // public static void bubbleSort(int[] arr) {
    //     // run the steps n-1 times
    //     for(int i=0; i< arr.length; i++) {
    //         boolean isSwap = false ;

    //         for(int j=0; j<arr.length-i-1; j++) {
    //             if(arr[j] > arr[j+1]) {
    //                 //swap 
    //                 int temp = arr[j] ;
    //                 arr[j] = arr[j+1] ;
    //                 arr[j+1] = temp ; 
    //                 isSwap = true ;
    //             }
    //         }

    //         if(!isSwap) {  // array is already sorted 
    //             return ;
    //         }
    //     }
    // }

    // selection sort 
    // TC -> O(n2)
    public static void selectionSort(int[] arr, int n) {
        for(int i=0; i<n-1; i++) {
            int smallestIdx = i ; // unsorted part starting
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[smallestIdx]) {
                    smallestIdx = j ;
                }
            }
            int temp = arr[i] ;
            arr[i] = arr[smallestIdx] ;
            arr[smallestIdx] = temp ;
        }
    }

    // insertion sort 
    // TC -> O(n2)

    public static void insertionSort(int[] arr, int n) {
        for(int i=1; i<n; i++) {
                int curr = arr[i] ;
                int prev = i - 1 ;
                while(prev >= 0 && arr[prev] > curr) {
                    arr[prev + 1] = arr[prev] ;
                    prev-- ;
                }
                arr[prev + 1] = curr ;
        }
    }
    public static void main(String[] args) {
        int[] arr ={100, 45, 32, -89} ;
        int n = arr.length ;
        // selectionSort(arr, n);
            insertionSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
