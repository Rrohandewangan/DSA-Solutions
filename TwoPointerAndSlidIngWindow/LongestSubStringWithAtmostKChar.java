public class LongestSubStringWithAtmostKChar {

     // TC -> O(n)
    // SC -> O(1)
    public int kDistinctChar(String s, int k) {
        int n = s.length();

        if(n == 0 || k <= 0) return 0;

        Map<Character, Integer> map = new HashMap<>();

        int left = 0, maxLength = 0;

        for(int right=0; right < n; right++) {
            char curr = s.charAt(right);

            map.put(curr, map.getOrDefault(curr, 0) + 1);

            if(map.size() > k) {
                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    
    public static void main(String[] args) {
        
    }
}
