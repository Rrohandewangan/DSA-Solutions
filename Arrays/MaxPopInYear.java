public class MaxPopInYear {

    // TC -> O(n)
    // SC -> O(1)
    public int maximumPopulation(int[][] logs) {
        int maxPop = 0 ;
        int ansYear = 1950 ;

        for(int year = 1950; year <= 2050; year++) {
            int count = 0;
            for(int i = 0; i < logs.length; i++) {
                if(logs[i][0] <= year && year < logs[i][1]) {
                    count++ ;
                }
            }

            if(count > maxPop) {
                maxPop = count ;
                ansYear = year ;
            }
        }
        return ansYear ;
    }
    public static void main(String[] args) {
        
    }
}