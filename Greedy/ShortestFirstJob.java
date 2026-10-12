public class ShortestFirstJob {

    // TC -> O(n + nlogn)
    // SC -> O(1)
    public long solve(int[] bt) {
        Arrays.sort(bt);
        int n = bt.length;
        long t = 0, wt = 0;

        for(int i=0; i<n; i++) {
            wt += t;
            t += bt[i];
        }

        return wt / n ;
    }
}