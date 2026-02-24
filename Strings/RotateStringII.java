public class RotateStringII {

   // Brute force approach ->
   
    // TC -> O(n2)
    // SC -> O(n)
   //  public boolean rotateString(String s, String goal) {
   //      if(s.length() != goal.length()) {
   //          return false ;
   //      }

   //      for(int i=0; i<s.length(); i++) { //O(n)
   //          String rotated = s.substring(i) + s.substring(0, i) ; //O(n) every time creates string of length n. 
   //          // check rotated is equal to goal or not
   //          if(rotated.equals(goal)) {
   //              return true ;
   //          }
   //      }
   //      return false ;
   //  }
    

   // optimal approach -> 
   
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
