import java.util.Stack;

public class CelebrityProblem {
    
    // TC -> O(n)
    // SC -> O(n)

    public static int getCelebrity(int[][] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++) {
            s.push(i);
        }

        while(s.size() > 1) {
            int i = s.peek();
            s.pop();

            int j = s.peek();
            s.pop();

            if(arr[i][j] == 0) {
                s.push(i);
            } else {
                s.push(j);
            }
        }

        int celebrity = s.peek();

        for(int i=0; i<n; i++) {
            if((i != celebrity) && (arr[i][celebrity] == 0 || arr[celebrity][i] == 1)) {
                return -1;
            }
        }

        return celebrity;

    }

    public static void main(String[] args) {
        int[][] arr = {{0,1,0}, {0,0,0}, {0,1,0}};

        int ans = getCelebrity(arr);

        System.out.println("celebrity is : " + ans);
    }
}
