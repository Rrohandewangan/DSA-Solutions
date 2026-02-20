public class ContainerWithMostWater {

    // brute force approach  ->
    // Tc -> O(n2)
    // SC -> O(1)
     public static  int maxArea(int[] height) {
      int n = height.length;

      int maxWater = 0 ; // to store final answer
      for(int i=0; i<n; i++) {
          int width = 0; // to store width j - i
          int ht = 0; // smallest piller = height ;
           int currentWater = 0 ; // current area contains water
        for(int j=i+1; j<n; j++) {
            ht = Math.min(height[i], height[j]);
            width = j - i ;
            currentWater = width * ht ;
            maxWater = Math.max(maxWater, currentWater) ;
        }
      }
    return maxWater;
    }

    // optimal approach ->
      // TC -> O(n)
    // sc -> O(1)
    public static int maxArea(int[] height) {
      int n = height.length;
      int maxWater = 0 ; // to store final answer
      int lp = 0, rp = n - 1 ;
 
      while(lp < rp) {
        int w = rp - lp ; //calculate width of conatiner
        int h = Math.min(height[lp], height[rp]) ; // calculate height of container
        int currWater = w * h ; // current area of container to store water
        maxWater = Math.max(currWater, maxWater) ;
        
       if(height[lp] < height[rp]) {
        lp++ ;
       } else {
        rp-- ;
       }
    }
    return maxWater;
    }


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7} ;

        System.out.println(maxArea(height));
    }
}
