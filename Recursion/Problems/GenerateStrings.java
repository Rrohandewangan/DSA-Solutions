import java.util.ArrayList;
import java.util.List;

public class GenerateStrings {
    // TC -> O(O(4^n / √n));
    // SC -> O(O(4^n / √n))
    static void helper(List<String> ans, String curr, int n, int open, int close) {
        if(curr.length() == 2*n) {
            ans.add(curr) ;
            return ;
        }

        if(open < n) {
            helper(ans, curr + "(", n, open + 1, close) ;
        }

        if(close < open) {
            helper(ans, curr + ")", n, open, close + 1) ;
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>() ;
        helper(ans, "", n, 0, 0) ;
        return ans ;
    }
    public static void main(String[] args) {
        
    }
}
