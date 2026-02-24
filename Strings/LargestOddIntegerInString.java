public class LargestOddIntegerInString {
    
   public static String largestOddNumber(String num) {
         int n = num.length() ;
         for(int i=n-1; i>=0; i--) { // we can ilitrate from right to left because if first number of right is odd then whole number is odd number and if not then skip it.
            if((int) num.charAt(i) % 2 != 0) { // we cast it to an integer and check it.
                return num.substring(0, i+1) ; // here i+1 because it is exclude last index in substring function.
            }
         }
         return "" ;
    }
    public static void main(String[] args) {
       String num = "4206" ;
       System.out.println(largestOddNumber(num));
    }
}
