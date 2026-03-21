package Problems.SubsetsAndSubsequence;

public class SubseqSumEqualk {

    static int countSubSeq(int[] arr, int i, int currSum, int k) {
        if(i == arr.length) {
            if(currSum == k) {
                return 1 ;
            } else {
                return 0 ;
            }
        }    
            // include element
            int include = countSubSeq(arr, i + 1, currSum + arr[i], k) ;

            int exclude = countSubSeq(arr, i + 1, currSum, k)  ;

        return include + exclude ;

        }
        

public static void main(String[] args) {

    System.out.println(countSubSeq(new int[]{4, 3, 2}, 0, 0, 4));
    
 }
}
