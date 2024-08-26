class RandomizedSet {
    List<Integer> l;
    Map<Integer, Integer> map;
    
    public RandomizedSet() {
        map = new HashMap<>();
        l=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        else{
            l.add(val);
            map.put(val, l.size()-1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Element does not exist, so removal fails
        }
        int index = map.get(val); // Get the index of the element to be removed
        int lastElement = l.get(l.size() - 1); // Get the last element in the list

        // Move the last element to the place of the element to be removed
        l.set(index, lastElement);
        map.put(lastElement, index);
        
        // Remove the last element from the list
        l.remove(l.size() - 1);
        map.remove(val); // Remove the element from the map
        return true;
    }
    
    public int getRandom() {
        int n=l.size();
        int r=(int)(Math.random() * n);
        return l.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
