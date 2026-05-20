
import java.util.* ;

public class NextSmallestElement {

    // TC -> O(n)
    // SC -> O(n)

    public static int[] prevSmallestElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }

            if(s.empty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            s.push(arr[i]);
        }

        return ans ;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 8, 6};

        int[] ans = prevSmallestElement(arr);

        for(int val : ans) {
            System.out.print(val + " ");
        }
    }
}