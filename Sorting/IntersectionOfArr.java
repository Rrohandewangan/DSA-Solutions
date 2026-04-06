public class IntersectionOfArr {


    // brute force approach ->
    // TC -> O(nlogn + mlogm) 
    // SC -> O(min(m, n))
     public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1) ;
        Arrays.sort(nums2) ;

        int m = nums1.length ;
        int n = nums2.length ;
        int[] inter = new int[Math.min(m, n)] ;

        int i = 0 , j = 0, k = 0 ;
        while(i < m && j < n) {
          if(nums1[i] == nums2[j]) {
            if(k == 0 || inter[k - 1] != nums1[i]) {
                inter[k++] = nums1[i] ;
            }
            i++; j++;
          } else if(nums1[i] < nums2[j]) {
            i++ ;
          } else {
            j++ ;
          }
        }

        int[] ans = new int[k] ;
        for(int l=0; l<k; l++) {
            ans[l] = inter[l] ;
        }
        
        return ans ;
    }


    // optimal approach -> 
     // TC -> O(m + n)
    // SC -> O(m)
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>() ;
        HashSet<Integer> result = new HashSet<>() ;

        for(int num : nums1) { // O(m)
            set.add(num) ;
        }

        for(int num : nums2) { // O(n)
            if(set.contains(num)) {
                result.add(num) ;
            }
        }

        int[] ans = new int[result.size()] ; //O(min(m, n))
        int i = 0 ;
        for(int num : result) {
            ans[i++] = num ;
        }

        return ans ;

    }
    
    public static void main(String[] args) {
        
    }

}
