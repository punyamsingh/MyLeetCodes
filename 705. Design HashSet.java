class MyHashSet {
    ArrayList<Integer> set;

    public MyHashSet() {
        set = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if (!set.contains(key)){
            set.add(key);
        }
    }
    
    public void remove(int key) {
        if (set.contains(key)) set.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for (int a: set){
            if (a==key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
