public class LongestSubArrayWithSumK {

    // better approach -> 
    // TC -> O(n)
    // SC -> O(n)
     public int longestSubarray(int[] nums, int k) {
       HashMap<Long, Integer> preSumMap = new HashMap<>(); 
        long sum = 0;
        int maxLen = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            long rem = sum - k;
            if(preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            preSumMap.putIfAbsent(sum, i);
        }
         return maxLen;
    }

    // TC -> O(n)
    // SC -> O(1)
    public int longestSubarray(int[] nums, int k) {
       int left = 0, right = 0;
       long sum = nums[0];
        int maxLen = 0;
        int n = nums.length();
        while(right < n) {
            while(left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if(sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < n) sum += nums[right];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        
    }
}