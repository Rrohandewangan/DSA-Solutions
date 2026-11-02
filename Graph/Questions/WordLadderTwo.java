public class WordLadderTwo {

    
     public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        int len = wordList.size();
        for(int i=0; i<len; i++) set.add(wordList.get(i));
        Queue<ArrayList<String>> q = new LinkedList<>();
        ArrayList<String> ls = new ArrayList<>();
        ls.add(beginWord);
        q.add(ls);
        ArrayList<String> usedOnLevel = new ArrayList<>();
        usedOnLevel.add(beginWord);
        int level = 0;
        List<List<String>> ans = new ArrayList<>();
        while(!q.isEmpty()) {
            ArrayList<String> vec = q.poll();
            //erase all words that has been used in the previous levels to transform
            if(vec.size() > level) {
                level++;
                for(String it : usedOnLevel) {
                    set.remove(it);
                }
            }
            String word = vec.get(vec.size() - 1);
            if(word.equals(endWord)) {
                if(ans.size() == 0) ans.add(vec);
                else if(ans.get(0).size() == vec.size()) ans.add(vec);
            }
            for(int i=0; i<word.length(); i++) {
                for(char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replaceWord = new String(replacedCharArray);
                    if(set.contains(replaceWord) == true) {
                        vec.add(replaceWord);
                        ArrayList<String> temp = new ArrayList<>(vec);
                        q.add(temp);
                        //mark as visited on the level
                        usedOnLevel.add(replaceWord);
                        vec.remove(vec.size() - 1);
                    }
                }
            }
        }
       return ans;
    }



    // LeetCode Version
    // TC -> O(26 * N * M * M + 26 * K * N * M * M)
    // SC ->O(N * M + K * N * M)
    String b;
    HashMap<String, Integer> map;
    List<List<String>> ans;
    private void dfs(String word, List<String> seq) {
        if(word.equals(b)) {
            List<String> dup = new ArrayList<>(seq);
            Collections.reverse(dup);
            ans.add(dup);
            return;
        }
        int steps = map.get(word);
        int size = word.length();
        for(int i=0; i<size; i++) {
            for(char ch = 'a'; ch <= 'z'; ch++) {
                char[] replaceCharArray = word.toCharArray();
                replaceCharArray[i] = ch;
                String replaceWord = new String(replaceCharArray);
                if(map.containsKey(replaceWord)
                && map.get(replaceWord) + 1 == steps) {
                    seq.add(replaceWord);
                    dfs(replaceWord, seq);
                    seq.remove(seq.size() - 1);
                }
            }
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        int len = wordList.size();
        for(int i=0; i<len; i++) set.add(wordList.get(i));
        Queue<String> q = new LinkedList<>();
        b = beginWord;
        q.add(beginWord);
        map = new HashMap<>();
        map.put(beginWord, 1);
        int size = beginWord.length();
        set.remove(beginWord);
        while(!q.isEmpty()) {
            String word = q.peek();
            int steps = map.get(word);
            q.remove();
            if(word.equals(endWord) == true) break;
            for(int i=0; i<size; i++) {
                for(char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);
                    // it exists in the set
                    if(set.contains(replacedWord) == true) {
                        q.add(replacedWord);
                        set.remove(replacedWord);
                        map.put(replacedWord, steps + 1);
                    }
                }
            }
        }
        ans = new ArrayList<>();
        if(map.containsKey(endWord) == true) {
            List<String> seq = new ArrayList<>();
            seq.add(endWord);
            dfs(endWord, seq);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
