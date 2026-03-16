public class CntItemsMatchARule  {

    // brute force -> 
    // TC -> O(n)
    // SC -> O(1)

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0 ;
       // run a loop on list<list>
       for(int i=0; i<items.size(); i++) {
           List<String> item = items.get(i) ;
           
           if(ruleKey.equals("type") && item.get(0).equals(ruleValue)) count++ ;
           if(ruleKey.equals("color") && item.get(1).equals(ruleValue)) count++ ;
           if(ruleKey.equals("name") && item.get(2).equals(ruleValue)) count++ ;
       }
       return count ;
    }
    public static void main(String[] args) {
        
    }
}