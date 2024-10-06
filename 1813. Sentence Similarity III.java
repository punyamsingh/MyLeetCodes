class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        String[] smaller;
        String[] larger;
        if (s1.length > s2.length){
            smaller=s2;
            larger=s1;
        }
        else{
            smaller=s1;
            larger=s2;
        }

        int l1=0, l2=0;
        while (l1<smaller.length && l2<larger.length && smaller[l1].equals(larger[l2])){
            l1++;
            l2++;
        }

        int r1=(smaller.length-1), r2=(larger.length-1);
        while (r1>=0 && r2>=0 && smaller[r1].equals(larger[r2])){
            r1--;
            r2--;
        }

        return l1>r1;
    }
}
