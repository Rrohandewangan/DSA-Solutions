public class UpperCaseChar {
    
    static char firstChar(String str, int i) {
        if(i == str.length()) {
            return '\0' ;
        }

        if(Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i) ;
        }
        // recursive call 
        firstChar(str, i + 1) ;

        return 0 ;
        
    }
    public static void main(String[] args) {
        String str = "RohanDewangan" ;

        System.out.println(firstChar(str, 0));
    }
}
