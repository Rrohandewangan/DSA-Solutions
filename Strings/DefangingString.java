public class DefangingString {

    // TC -> O(n)
    // SC -> O(n)

     public String defangIPaddr(String address) {
        StringBuilder newStr = new StringBuilder("");
        for(int i=0; i<address.length(); i++) {
            if(address.charAt(i) == '.') {
                newStr.append("[.]");
            } else {
                newStr.append(address.charAt(i)) ;
            }
        }
        return newStr.toString() ;
    }

    public static void main(String[] args) {
        
    }
}
