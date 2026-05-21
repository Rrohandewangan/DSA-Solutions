public class LargestRectangleInHistogram {
    
    // TC -> O(n)
    // SC -> O(n)

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i=1; i<heights.length; i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while(!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty()) {
           area = arr[popped] * i; 
        } else {
           area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }


    // Method - 2 
    // TC -> O(n)
    // SC -> O(n)
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n]; //left smaller nearest 
        int[] right = new int[n]; // right smaller nearest
        Stack<Integer> s = new Stack<>();

        //Right Smaller Nearest ->
        for(int i=n-1; i>=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            right[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        while(!s.isEmpty()) {
            s.pop();
        }

        //Left Smaller Nearest -> 
        for(int i=0; i<n; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            left[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currArea = heights[i] * width;
            ans = Math.max(ans, currArea);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
