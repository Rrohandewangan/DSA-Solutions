import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharacterByFreq {
    
    // TC -> O(nlogn)
    // SC -> O(n)
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>() ;
        
        // store character and freqeuncy in hashmap
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i) ;
           if(map.containsKey(c)) {
              map.put(c, map.get(c) + 1);
            } else {
            map.put(c, 1);
            }
        }

        // store in list 
        List<Character> list = new ArrayList<>(map.keySet()) ;
        list.sort((a, b) -> map.get(b) - map.get(a)) ;

        // run a loop and create a string in decending order
        StringBuilder sb = new StringBuilder() ;
        for(char ch : list) {
            for(int i=0; i<map.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString() ;
    }

    public static void main(String[] args) {
        
    }
}
