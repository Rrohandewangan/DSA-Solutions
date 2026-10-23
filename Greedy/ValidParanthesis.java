public class ValidParanthesis {

    // TC -> O(n)
    // SC -> O(1)
    public boolean checkValidString(String s) {
        int n = s.length();
        int min = 0, max = 0;
        for(int i=0; i<n; i++) {
            char c = s.charAt(i);

            if(c == '(') {
                min = min + 1;
                max = max + 1;
            }
            else if(c == ')') {
                min = min - 1;
                max = max - 1;
            }
            else  {
                min = min - 1;
                max = max + 1;
            }

            if(min < 0) min = 0;
            if(max < 0) return false;
        }
        return min == 0;
    }

    // option 2
      int cnt = 0;

       for(char c : s.toCharArray()) {
        if(c == '(' || c == '*') cnt++;
        else cnt--;

        if(cnt < 0) return false;
       }
       cnt = 0;

       for(int i=s.length() - 1; i >=0; i--) {
        if(s.charAt(i) == ')' || s.charAt(i) == '*') cnt++;
        else cnt--;

        if(cnt < 0) return false;
       }
       return true;
    }
    
    public static void main(String[] args) {
        
    }
}
