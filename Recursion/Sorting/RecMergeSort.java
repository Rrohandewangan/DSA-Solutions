import java.util.Arrays;

public class RecMergeSort {
    
    // TC -> O(nlog(n)) 
    // SC -> O(n)
    // static int[] mergeSort(int[] arr) {
    //     if(arr.length == 1) {
    //         return arr ;
    //     }

    //     int mid = arr.length / 2 ;

    //     int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)) ;
    //     int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)) ;

    //     return merge(left, right);
    // }


    // private static int[] merge(int[] first, int[] second) {
    //     int[] mergedArr = new int[first.length + second.length] ;

    //     int i = 0 ; // pointer of first or left array
    //     int j = 0 ; // pointer of second or right array
    //     int k = 0 ; // pointer of merged array

    //     while(i < first.length && j < second.length) {
    //         if(first[i] < second[j]) {
    //             mergedArr[k] = first[i] ;
    //             i++ ;
    //         } else {
    //             mergedArr[k] = second[j] ;
    //             j++ ;
    //         }
    //         k++ ;
    //     }

    //      //it may possible that one of the arrays is not complete
    //      // copy the remaining elements
    //         while(i < first.length) {
    //             mergedArr[k] = first[i] ;
    //             i++; k++ ;
    //         }

    //         while(j < second.length) {
    //             mergedArr[k] = second[j] ;
    //             j++; k++ ;
    //         }
        
    //     return mergedArr ;
    // }


    // Merge Sort in-place ->
    // TC -> O(nlog(n))
    // SC -> O(1)
    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if(e - s == 1) {
            return ;
        }

        int mid = s + (e - s) / 2 ;

        mergeSortInPlace(arr, s, mid) ;
        mergeSortInPlace(arr, mid, e) ;

        merge(arr, s, mid, e);
    }


    private static void merge(int[] arr, int s, int m, int e) {
        int[] mergedArr = new int[e - s] ;

        int i = s ; // pointer of first or left array
        int j = m ; // pointer of second or right array
        int k = 0 ; // pointer of merged array

        while(i < m && j < e) {
            if(arr[i] < arr[j]) {
                mergedArr[k] = arr[i] ;
                i++ ;
            } else {
                mergedArr[k] = arr[j] ;
                j++ ;
            }
            k++ ;
        }

         //it may possible that one of the arrays is not complete
         // copy the remaining elements
            while(i < m) {
                mergedArr[k] = arr[i] ;
                i++; k++ ;
            }

            while(j < e) {
                mergedArr[k] = arr[j] ;
                j++; k++ ;
            }
        
        for(int l = 0; l < mergedArr.length; l++) {
            arr[s + l] = mergedArr[l] ;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1} ; 
        mergeSortInPlace(arr, 0, arr.length) ;
        System.out.println(Arrays.toString(arr));


        
    }
}
