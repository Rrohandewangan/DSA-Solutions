import java.util.ArrayList;

// TC -> O(2pow(n) * n)
// SC -> O(2pow(n) * n)
public class BinaryString {
    
    static void printBinaryStr(ArrayList<String> ans, int n, String curr, char prev) {
        if(curr.length() == n) {
            ans.add(curr) ;
            return ;
        }

        printBinaryStr(ans, n, curr + '0', '0');

        if(prev != '1') {
            printBinaryStr(ans, n, curr + '1', '1');
        }
    }
    public static void main(String[] args) {
        int n = 2 ;
        ArrayList<String> ans = new ArrayList<>() ;
        printBinaryStr(ans, n, "", '0');
        System.out.println(ans);

    }
}
