import java.util.* ;
public class leftShiftBy1{
   
// public static void leftShiftBy1(int[] arr, int n) {

//   int temp = arr[0] ;
  
//   for(int i=0; i<n-1 ; i++) {
//     arr[i] = arr[i+1] ;
//   }
//   arr[n-1] = temp ;

//   for(int i=0; i<n; i++) {
//     System.out.print(arr[i]+" ");
//   }
// }

public static void leftShiftByk(int[] arr, int n, int k ) {
 
    k = k % n ;
  int[] rotated = new int[n] ;

  for(int i=0; i<n; i++) {
     rotated[(i+k) % n] = arr[i] ;

  }

  

  for(int i=0; i<n; i++) {
    arr[i] = rotated[i] ;
    System.out.println(arr[i]+" ");
  }
}



// left shift by d postion 
// TC - O(3n)
// SC - O(1)
static void reverseArray(int[] arr, int st, int end) {

  while(st < end) {
    int temp = arr[st] ;
    arr[st] = arr[end] ;
    arr[end] = temp ;
    st++; end-- ;

  }
}

static void leftShiftByD(int[] arr, int k)  {
   int n = arr.length ;
  // reverse first k element of array 
  reverseArray(arr, 0, k-1);

  // reverse remaining element of array
  reverseArray(arr, k, n-1);

  // revsere entire array from st to end 
  reverseArray(arr, 0, n-1);

  for(int i=0; i<n; i++) {
    System.out.print(arr[i]+" ");
  }

}
 
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5} ;
      int n = arr.length ;
      int k = 3 ;
      leftShiftByk(arr, n, k);
      
    }
  }