public class LargestOddIntegerInString {
    
    public static String largestOddNumber(String num) {
        int ans = 0 ;
        for(int i=num.length()-1; i>=0; i--) {
            ans = num.charAt(i) - '0' ;
            if(ans % 2 != 0) {
                return num.substring(0, i+1) ;
            } 
        }
        return "" ;
        
    }
    public static void main(String[] args) {
       String num = "4206" ;
       System.out.println(largestOddNumber(num));
    }
}
