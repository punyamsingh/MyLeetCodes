class LRUCache {
    Map<Integer, Integer> map;
    int capa, k=0;
    Queue<Integer> lru;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        capa=capacity;
        lru = new LinkedList<>();
    }
    
    public int get(int key) {
        if (map.containsKey(key)){
            lru.remove(key);
            lru.add(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) lru.remove(key);
        else{
            if (k==capa){
                map.remove(lru.poll());
                k--;
            }
            k++;
        }
        lru.add(key);
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
