package Problems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class PhonePad {
    
    // print all permutations
    static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        int digit = up.charAt(0) - '0' ; // this will convert '2'into 2

        for(int i=(digit - 1) * 3; i < digit * 3; i++) {
            
            char ch = (char)('a' + i) ;

            pad(p + ch, up.substring(1));
        }
    }



    //leetcode question solution ->

    static ArrayList<String> padRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list;
        }
        int digit = up.charAt(0) - '0' ; // this will convert '2'into 2

        ArrayList<String> list = new ArrayList<>() ;

        int offset = (digit - 2) * 3 ;
        if(digit > 7) offset++ ;

        int letters = (digit == 7 || digit == 9) ? 4 : 3  ;

        for(int i=0; i < letters; i++) {
            char ch = (char)('a' + offset + i) ;
            list.addAll(padRet(p + ch, up.substring(1)));
        }

     return list;
    }

    public static List<String> letterCombinations(String digits) {
        return padRet("", digits) ;
    }

    
        public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
