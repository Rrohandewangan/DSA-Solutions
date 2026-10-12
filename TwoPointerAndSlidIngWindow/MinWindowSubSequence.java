public class MinWindowSubSequence {

     // TC -> O(m * n)
    // SC -> O(1)
  public String minWindow(String s1, String s2) {

    int n = s1.length();
    int m = s2.length();

    if (n == 0 || m == 0 || n < m) return "";

    int left = 0, right = 0, minLen = Integer.MAX_VALUE, minStart = -1, j = 0;

    while (right < n) {

      if (s1.charAt(right) == s2.charAt(j)) {
        j++;
      }

      if (j == m) {

        int end = right;

        j = m - 1;
        left = right;

        while (j >= 0) {
          if (s1.charAt(left) == s2.charAt(j)) {
            j--;
          }
          left--;
        }
        left++;

        int len = right - left + 1;

        if (len < minLen) {
          minLen = len;
          minStart = left;
        }

        right = left;
        j = 0;
      }
      right++;
    }
    if (minStart == -1) return "";

    return s1.substring(minStart, minStart + minLen);
  }

    public static void main(String[] args) {
        
    }
}