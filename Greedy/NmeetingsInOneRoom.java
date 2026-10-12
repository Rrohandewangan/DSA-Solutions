public class NmeetingsInOneRoom {

    // TC -> O(nlogn)
    // SC -> O(n)
    public int maxMeetings(int[] start, int[] end) {
         int n = start.length;

         // for storinhg start and end time together
         int[][] meetings = new int[n][2];

         for(int i=0; i<n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
         }

         Arrays.sort(meetings, (a, b) -> a[1] - b[1]);

         int freeTime = -1;
         int cnt = 0;

         for(int[] meeting : meetings) {
            int currStart = meeting[0];
            int currEnd = meeting[1];

            if(currStart > freeTime) {
                cnt++;
                freeTime = currEnd;
            }
         }

         return cnt;
    }

     public static void main(String[] args) {
        
     }
}