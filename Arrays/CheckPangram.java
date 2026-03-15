public class CheckPangram {
    
    // brute force approach -> 
    // TC -> O(n2) 
    // SC -> O(1)
    // public boolean checkIfPangram(String sentence) {
    //     int freq = 0 ;

    //     for(int ch='a'; ch <='z'; ch++) {
    //         boolean found = false ;
    //         for(int i=0; i<sentence.length(); i++) {
    //             if(sentence.charAt(i) == ch) {
    //                 found = true ;
    //                 break ;
    //             }
    //         }
    //         if(!found) return false ;
    //     }
        
    //     return true ;
    // }

    // optimal approach but used 2 passes 
    // TC -> O(n) 
    // SC -> O(1)
    // public boolean checkIfPangram(String sentence) {
    //     int n = sentence.length() ;
    //     int[] freq = new int[26] ;

    //     for(int i=0; i<n; i++) {
    //         freq[sentence.charAt(i) - 'a']++ ;
    //     }

    //     for(int i=0; i<freq.length; i++) {
    //         if(freq[i] == 0) {
    //             return false ;
    //         }
    //     }
    //     return  true ;
    // }

    // optimal approach but single pass ->
    // TC -> O(n)
    // SC -> O(1)
     public boolean checkIfPangram(String sentence) {
        boolean[] found = new boolean[26] ;
        int unique = 0 ;

        for(int i=0; i<sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a' ;

            if(!found[index]) {
                found[index] = true ;
                unique++ ;
            }
        }

        if(unique != 26) return false ;

        return true ;
    }
    public static void main(String[] args) {
        
    }

}