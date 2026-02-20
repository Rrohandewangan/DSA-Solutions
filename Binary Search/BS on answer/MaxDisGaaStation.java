public class MaxDisGaaStation {

    // brutee force 
    // TC -> O(k * n)
    // SC -> O(1)
    public static double minimiseMaxDistance(int arr[], int k) {
         int n = arr.length ;
        int[] howMany = new int[n-1] ;
        
        for(int gStation=1; gStation<=k; gStation++) {
            double maxSection = -1 ;
            int maxIdx  = -1 ;
            for(int i=0; i<n-1; i++) {
                double diff = arr[i+1] - arr[i] ;
                double sectionLength = diff / (double)(howMany[i]+1) ;
                if(maxSection < sectionLength) {
                    maxSection = sectionLength ;
                    maxIdx = i ;
                }
            }
            howMany[maxIdx]++ ;
        }

        double maxAns = -1 ;
        for(int i=0; i<n-1; i++) {
            double diff = (arr[i+1] - arr[i]) ;
            double sectionLength = (arr[i+1] - arr[i]) / (double)(howMany[i] + 1) ;
            maxAns = Math.max(maxAns, sectionLength) ;
        }
        return maxAns ;
    }


        /// in tuf series optimal solution 

    
    public static void main(String[] args) {
        int N = 5 ;
         int arr[] = {1,2,3,4,5};
         int k = 4 ;

         System.out.println(minimiseMaxDistance(arr, k));
    }
}