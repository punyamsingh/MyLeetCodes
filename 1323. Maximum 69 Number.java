class Solution {
    public int maximum69Number (int num) {
        char[] ca = (num+"").toCharArray();
        for (int i=0; i<ca.length; i++){
            if (ca[i] == '6'){
                ca[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(ca));
    }
}
