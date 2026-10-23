public class DivideIntervalIntoMinNumOfgroups {

    // using two pointer ->
    // TC -> O(nlogn)
    // SC -> O(n)
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0; i<n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int cnt = 0, maxCnt = 0;

        while(i < n) {
            if(start[i] <= end[j]) {
                cnt++;
                i++;
            } else {
                cnt--;
                j++;
            }
            maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt;
        
    }

    // using priority queue ->
    // TC -> O(nlogn)
    // SC -> O(n)
    public int minGroups(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] i : intervals) {
            int start = i[0];
            int end = i[1];
            
            if(!pq.isEmpty() && pq.peek() < start) {
                pq.poll();
            }

            pq.offer(end);
        }

        return pq.size();
    }
    
    public static void main(String[] args) {
        
    }
}
