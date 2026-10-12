public class JobSequenceProblem {

    // TC -> O(nlogn + n * maxDeadline);
    // SC -> O(maxDeadline)
    public int[] JobScheduling(int[][] Jobs) {
        
        int n = Jobs.length;

        // sort with in order of max profit comes first
        Arrays.sort(Jobs, (a, b) -> Integer.compare(b[2], a[2]));

        int maxDeadline = 0;
        for(int i=0; i<n; i++) {
            maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
        }

        // create timeline Array
        int[] timeline = new int[maxDeadline + 1];
        Arrays.fill(timeline, -1);

        int cntJobs = 0, totalProfit = 0;

        for(int i=0; i<n; i++) {

            int id = Jobs[i][0];
            int deadline = Jobs[i][1];
            int profit = Jobs[i][2];

            for(int j = deadline; j>0; j--) {

                if(timeline[j] == -1) {
                    timeline[j] = id;

                    cntJobs += 1;
                    totalProfit += profit;
                    break;
                }
            }
        }
        return new int[]{cntJobs, totalProfit};
    }
    
    public static void main(String[] args) {
        
    }
}
