public class Duplicates {
    

    // O(n)
    // O(n)
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>() ;

       for(int num : nums) {
        if(set.contains(num)) {
            return true ;
        }
        set.add(num) ;
       }
       return false ;
    }

    public static void main(String[] args) {
        
    }

}
