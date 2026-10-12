public class FractionalKnapSack {

    // TC -> O(n + nlogn)
     // SC -> O(1)
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        
        int n = val.length;
        Integer[] idx = new Integer[n];

        for(int i=0; i<n; i++) {
            idx[i] = i;
        }

        // sort by val/weight ratio in decending order
        Arrays.sort(idx, (a, b) -> 
         Double.compare(
               (double) val[b] / wt[b], (double) val[a]/wt[a]
         )
        );

        double maxVal = 0;

        for(int i : idx) {

            if(cap == 0) break;

            if(wt[i] <= cap) {
                maxVal += val[i];
                cap -= wt[i];
            } else {
                maxVal += ((double) val[i]/wt[i]) * cap;
                cap = 0;
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
        
    }
}