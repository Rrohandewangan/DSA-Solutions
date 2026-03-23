public class StringLength {

    public static void main(String[] args) {
        System.out.println(stringLength("abcd", 0));
    }

    static int stringLength(String str, int count) {
        if(str.length() == 0) {
            return count ;
        }

        return stringLength(str.substring(1), count + 1) ;
    }
    static int stringLength2(String str, int i) {
        if(str.length() == i) {
            return i ;
        }

        return stringLength(str, i + 1) ;
    }
}