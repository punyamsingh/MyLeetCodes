class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> nec = new HashSet<Integer>();
        Map<Integer, Integer> map= new HashMap<>();
        HashSet<Integer> tbr = new HashSet<Integer>();

        for (int i=0; i<edges.size(); i++){
            List<Integer> el=edges.get(i);
            nec.add(el.get(0));
            map.put(el.get(1),el.get(0));
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int a=entry.getKey();
            if (nec.contains(a)){
                // nec.remove(a);
                tbr.add(a);
                nec.add(entry.getValue());
            }
        }
        HashSet<Integer> dif = new HashSet<>(nec);
        dif.removeAll(tbr);
        return (new ArrayList<Integer>(dif));
    }
}
