import java.util.Stack;

public class NextGreaterEle {

    // TC -> O(n)
    // SC -> O(n)
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};

        // Next Greater Element
        Stack<Integer> s = new Stack<>() ;
        int[] ans = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--) {
            while(s.size() > 0 && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek() ;
            }

            s.push(arr[i]);

        }

        // print answer 
        for(int val : ans) {
            System.out.print(val + " ");
        }
    }

    // Leetcode Version of Next Greater Element 
    // TC -> O(nums1.length + nums2.length)
    // SC -> O(nums1.length)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for(int i=nums2.length - 1; i>=0; i--) {
            while(!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            
            if (s.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], s.peek());
            }

            s.push(nums2[i]);
            
        }

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

    return ans ;
    }
}