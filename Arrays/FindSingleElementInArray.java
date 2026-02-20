public class FindSingleElementInArray {



    // // brute force apporach ->
    // // TC -> O(n2)
    // // sc -> O(1)

    //  public static int singleNumber(int[] arr) {
    //    int n = arr.length ;
     
    //    for(int i=0; i<n; i++) {
    //    // assume first number as answer
    //     int ans = arr[i] ;
    //      // to store current count of number
    //       int count = 0; 
    //       for(int j=0; j<n; j++) {
    //          if(arr[i] == arr[j]) {
    //              count++ ; 
    //          }
    //       }
    //       // check if number appear less than 2 times then he is answer 
    //       if(count == 1) {
    //          return ans  ;
    //       }
    //    }  
    //    return -1 ;
    //  }
    

    // Optimal apporach ->
    // TC - O(n)
    // SC - O(1)
    static int singleNumber(int[] arr) {
        int n = arr.length ;
     // use to store xor of all element n=in array
        int xor = 0 ;
        for(int i=0; i<n; i++) {
            // after taking all element in last single element is found
            // because xor -> a^a = 0 every twice element is cancel out
            xor = xor ^ arr[i] ;
        }
        return xor ;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2} ;
        int ans = singleNumber(arr) ;
        System.out.println(ans);

    }
}
