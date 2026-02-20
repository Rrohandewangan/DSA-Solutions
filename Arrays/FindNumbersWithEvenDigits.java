// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumbersWithEvenDigits {

    // TC -> O(nums.length)*(log(num))  
    static int findNumbers(int[] nums) { 
        int count = 0 ;
    
       for(int num : nums) {
        if(even(num)) {
            count++ ;
        }
       }
       return count ;
    }
        
    

    static boolean even(int num) { // TC -> O(1)

        int numberOfDigits = countDigits(num) ;
        if(numberOfDigits % 2 == 0) {
            return true ;
        }

        return false ;
    }

    static int countDigits2(int num) {
        return (int)(Math.log10(num)) ;
    }

    // count numbers of digits in number
    // TC -> O(log(num))
    static int countDigits(int num) {

        if(num < 0) {
            num = num * -1 ;
        }

        if(num == 0) {
            return 1 ;
        }

        int count = 0 ;
        
        while(num > 0) {
            count++ ;
            num /= 10 ;
        }
        return count ;
    }
    public static void main(String[] args) {

    int[] nums = {12,345,2,6,7896} ;

    int ans = findNumbers(nums) ;
    System.out.println(ans);
      
    }
}
