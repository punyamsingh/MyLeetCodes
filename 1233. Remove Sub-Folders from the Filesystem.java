class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> set = new HashSet<>();
        Arrays.sort(folder);
        for (String f: folder){
            set.add(f);

            for (int i=0; i<f.length(); i++){
                if (f.charAt(i)=='/' && set.contains(f.substring(0,i))){
                    set.remove(f);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
