import java.util.*;

class Trie {
    static HashSet h;

    public Trie() {
        h = new HashSet();
        h.clear();
    }
    
    public void insert(String word) {
        if (h==null){
            h = new HashSet();
            h.clear();
        }
        h.add(word);
    }
    
    public boolean search(String word) {
        if (h.isEmpty()){
            return false;
        }
        return h.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        if (h.isEmpty()){
            return false;
        }
        Enumeration e = Collections.enumeration(Trie.h);
        while (e.hasMoreElements()){
            String i = (String) e.nextElement();
            if (i.startsWith(prefix)){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
