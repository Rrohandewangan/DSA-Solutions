import java.util.Arrays;

public class AnagramStrings {

    
    // // brute force approach -> 
    // // TC -> O(nlogn)
    // // SC -> O(1)
    // public boolean isAnagram(String s, String t) {

    //      if(s.length() != t.length()) {
    //         return false;
    //      }
        
    //     char[] charArr1 = s.toCharArray() ; // convert string to char array
    //     char[] charArr2 = t.toCharArray() ; // convert string to char array

    //     Arrays.sort(charArr1) ; // sort the character array 1
    //     Arrays.sort(charArr2) ; // sort the character array 2

    //     for(int i=0; i<charArr1.length; i++) { // check if both character are same or not 
    //         if(charArr1[i] != charArr2[i]) {
    //             return false ;
    //         }
    //     }
    //     return true ;
    // }

    // // Better approach -> 
    // // TC -> O(n)
    // // SC -> O(1)
    // boolean isFreqSame(int[] freq1, int[] freq2) { //O(26)
    //     for(int i=0; i<26; i++) {
    //         if(freq1[i] != freq2[i]) {
    //             return false ;
    //         }  
    //     }
    //     return true ;
    // }
 
    // public boolean isAnagram(String s, String t) {

    //     if(s.length() != t.length()) {
    //         return false;
    //     }

    //     int[] freq1 = new int[26] ; // to store the frequency of character in string s
    //     int[] freq2 = new int[26] ; // to store the frequency of character in string t

    //     for(int i=0; i<s.length(); i++) { // store freq in array of string s //O(n)
    //         freq1[s.charAt(i) - 'a']++ ;
    //     }
 
    //     for(int i=0; i<t.length(); i++) { // stroe in fre in array of string t //O(n)
    //         freq2[t.charAt(i) - 'a']++ ;
    //     }

    //     if(isFreqSame(freq1, freq2)) { // O(n)
    //         return true ;
    //     }

    //     return false ;
    // }
    
     // optimal approach ->
    // TC -> O(n)
    // SC -> O(1)
    public static boolean isAnagram(String s, String t) {
 
        if(s.length() != t.length()) {
            return false ;
        }

        int[] freq = new int[26] ; // to store the frequency of character
        
        for(int i=0; i<s.length(); i++) { 
            freq[s.charAt(i) - 'a']++ ; // increase the freq for each char in array
        }
 
        for(int i=0; i<t.length(); i++) { 
            freq[t.charAt(i) - 'a']-- ; // decrease the freq of each char in array
        }

        // check in freq array all value are zeros or not
        for(int i=0; i<26; i++) {
            if(freq[i] != 0) { // if any freq is non-zero, they are not anagrams
                return false ;
            }
        }

        return true ;
    }
    public static void main(String[] args) {
        String s = "abc" ;
        String t = "bac" ;
        System.out.println(isAnagram(s, t) );
        

    }
}