public class IsomorphicStirng {
    
  public static boolean isIsomorphic(String s, String t) {
     if(s.length() != t.length()) { // both string length is not equal are not isomorphic
        return false ;
     }

     int[] sMap = new int[256] ; // to map val of Schar in array and for ascii val
     int[] tMap = new int[256] ; // to map val of tchar in array and for ascii val

     for(int i=0; i<s.length(); i++) {
        char sChar = s.charAt(i) ; 
        char tChar = t.charAt(i) ;

        if(sMap[sChar] != tMap[tChar]) { // both val is not equal means mapping (one to one) is not consistent
            return false ;
        }
        sMap[sChar] = i+1 ; // sChar ascii val convert into index
        tMap[tChar] = i+1 ; // tChar ascii val convert into index
        
     }
     return true ;
    }
    public static void main(String[] args) {
        String s = "egg", t = "add" ;

        System.out.println(isIsomorphic(s, t));
    }
}
