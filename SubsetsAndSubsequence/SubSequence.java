package Problems.SubsetsAndSubsequence;

import java.util.ArrayList;

public class SubSequence {
    

    // method 1 ->
    // static void subSeq(String p, String up) {
    //     if(up.isEmpty()) {
    //         System.out.println(p);
    //         return ;
    //     }

    //     char ch = up.charAt(0) ;

    //     subSeq(p + ch, up.substring(1));
    //     subSeq(p, up.substring(1));

    // }

    

    //method 2 ->
    // static ArrayList<String> subSeq(String p, String up) {
    //     if(up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>() ;
    //         list.add(p) ;
    //         return list ;
    //     }

    //     char ch = up.charAt(0) ;

    //     ArrayList<String> left = subSeq(p + ch, up.substring(1));
    //     ArrayList<String> right = subSeq(p, up.substring(1));

    //     left.addAll(right) ;
    //     return left ;

    // }


    //print subsequence with ascii value  ->

    // static void subSeqAscii(String p, String up) {
    //     if(up.isEmpty()) {
    //         System.out.println(p);
    //         return ;
    //     }
    //     char ch = up.charAt(0) ;
    //     subSeqAscii(p + ch, up.substring(1));
    //     subSeqAscii(p, up.substring(1));
    //     subSeqAscii(p + (ch + 0), up.substring(1));
        
    // }

    static ArrayList<String> subSeqAscii(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>() ;
            list.add(p) ;
            return list ;
        }

        char ch = up.charAt(0) ;

        ArrayList<String> first = subSeqAscii(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAscii(p, up.substring(1)) ;
        ArrayList<String> third = subSeqAscii(p + (ch + 0), up.substring(1)) ;
        first.addAll(second) ;
        first.addAll(third) ;
        return first ;

    }
    
    public static void main(String[] args) {
        System.out.println(subSeqAscii("", "abc"));
    }
}
