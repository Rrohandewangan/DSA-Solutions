public class LongestConsecutiveSeq {
    
    // brute force -> O(n2)

    // better approach ->
    // TC -> O(nlogn)
    // SC -> O(1)
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int longest = 0, currCnt = 0, lastSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmallest) {
                currCnt += 1;
                lastSmallest = nums[i];
            } else if (nums[i] != lastSmallest) {
                currCnt = 1;
                lastSmallest = nums[i];
            }
            longest = Math.max(longest, currCnt);
        }
        return longest;
    }

    // optimal solution _> 
    // TC -> O(n)
    // SC -> O(n)
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        // lterate in set
        for(int num : set) {

            if(!set.contains(num - 1)) {
               int cnt = 1;
               int x = num;

               while(set.contains(x + 1)) {
                  x = x + 1;
                  cnt += 1;
               }
               longest = Math.max(longest, cnt);
            }
        }
       return longest;
    }
    public static void main(String[] args) {
        
    }
}
