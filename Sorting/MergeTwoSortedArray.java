public class MergeTwoSortedArray {

    // TC -> O(n) 
    // SC -> O(1)

 public static void mergedArray(int[] A, int[] B, int m, int n) {
    int idx = m+n-1 ;
    int i = m-1 ;
    int j = n-1 ;

    while(i>=0 && j>=0) {
        if(A[i] >= B[j]) {
            A[idx] = A[i] ;
            idx-- ; i-- ;
        } else {
            A[idx] = B[j] ;
            idx-- ; j-- ;
         }
    }

    while(j >= 0) {
        A[idx--] = B[j--] ; 
    }

    for(int k=0; k<m+n ; k++) {
        System.out.print(A[k]+" ");
    }
 }
    public static void main(String[] args) {
     int[] A = {1,2,3,0,0,0} ;
     int m = 3 ;
     int[] B = {2,5,6} ;
     int n = 3 ;

     mergedArray(A, B, m, n);
    }
}
