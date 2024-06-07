class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        List<String> sen=Arrays.asList(sentence.split(" "));
        for (String s: dictionary){
            int i=0;
            for (String k: sen){
                if (k.length()>=s.length()){
                    if ( k.substring(0,s.length()).equals(s) ){
                        sen.set(i, s);
                    }
                }
                i++;
            }
        }
        return String.join(" ", sen);
    }
}
