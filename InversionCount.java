public class InversionCount {


    // TC -> O(nlog(n))
    // SC -> O(n)
    public static int mergeSortInPlace(int[] arr, int s, int e) {
        if(s < e) {

        int mid = s + (e - s) / 2 ;

        int leftInvCount = mergeSortInPlace(arr, s, mid) ;
        int rightInvCount = mergeSortInPlace(arr, mid + 1, e) ;

        int invCount = merge(arr, s, mid, e);

        return leftInvCount + rightInvCount + invCount ;
        }
        return 0 ;
    }

    private static int merge(int[] arr, int s, int m, int e) {

        int[] mergedArr = new int[e - s + 1] ;

        int i = s ; // pointer of first or left array
        int j = m + 1; // pointer of second or right array
        int k = 0 ; // pointer of merged array
        int invCount = 0 ; // to count number of inversion

        while(i <= m && j <= e) {
            if(arr[i] <= arr[j]) {
                mergedArr[k++] = arr[i++] ;
            } else {
                mergedArr[k++] = arr[j++] ;
                invCount += (m - i + 1) ;
            }
        }

         //it may possible that one of the arrays is not complete
         // copy the remaining elements
            while(i <= m) {
                mergedArr[k] = arr[i] ;
                i++; k++ ;
            }

            while(j <= e) {
                mergedArr[k] = arr[j] ;
                j++; k++ ;
            }
        
        for(int l = 0; l < mergedArr.length; l++) {
            arr[s + l] = mergedArr[l] ;
        }

        return invCount ;
    }
    
    public static void main(String[] args) {
        int[] arr = {6, 3, 5, 2, 7} ;

        int ans = mergeSortInPlace(arr, 0, arr.length-1) ;
        System.out.println("inv count : " + ans);
    }
}
