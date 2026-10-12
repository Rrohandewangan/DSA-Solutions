public class MinWindowSubString {

    // TC -> O(2n) + O(m)
    // SC -> O(256)
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n == 0 || m == 0 || n < m) return "";

        int[] freq = new int[128];

        for(char c : t.toCharArray()) { // O(m)
            freq[c]++;
        }

        int left = 0;
        int cnt = 0, minLen = Integer.MAX_VALUE, startIdx = -1;

        for(int right=0; right < n; right++) { // O(n)

            char curr = s.charAt(right);
            
            // Current char is stil req.
            if(freq[curr] > 0) cnt += 1;
            freq[curr]--;
            
            // Valid Window
            while(cnt == m) {  // O(n) overall
                
                int currLen = right - left + 1;

                if(currLen < minLen) {
                    minLen = currLen;
                    startIdx = left;
                }

                char leftChar = s.charAt(left);  // more negative freq more times char appear in subString

                freq[leftChar]++;

                if(freq[leftChar] > 0) {
                    cnt--;
                }
                
                left++;
            }
        }

        if(startIdx == -1) return "";

        return s.substring(startIdx, startIdx + minLen);
    }

    public static void main(String[] args) {
        
    }
}