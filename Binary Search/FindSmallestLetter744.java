//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// important key points ->
// 1. exact same apporach as ceiling of array.
// 2. we are not ignore the target = what we are looking for.
// 3. condition violted : start = end + 1 -> length of array(n)
// 4. return st = st % n ; 

public class FindSmallestLetter744 {

      public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length ;
        int st = 0, end = n-1 ; 
        while(st <= end) {
            int mid = st + (end - st)/2 ;

            if(letters[mid] < target) {
                st = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
        } 
        return letters[st % n]  ;
    }
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'} ;
        char target = 'f' ;

        System.out.println(nextGreatestLetter(letters, target));
    }
}
