public class RotateStringII {
    
   public static boolean rotateString(String s, String goal) {  //TC -> O(1)
     if(s.length() != goal.length()) { // here rotation is not possible
        return false ;
     }

     // s+s contains all possible rotation of String s 
     if((s+s).contains(goal)) { 
        return true ;  
     } else {
        return false ;
     }
    }
    public static void main(String[] args) {
        String s = "abcde" ;
        String goal = "cdeab" ;
        System.out.println(rotateString(s, goal));
    }
}
