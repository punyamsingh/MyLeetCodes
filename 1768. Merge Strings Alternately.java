// class Solution:
//     def mergeAlternately(self, word1: str, word2: str) -> str:
//         a=""
//         b=min(len(word1),len(word2))
//         for i in range(b):
//             a+=word1[i]
//             a+=word2[i]
//         if (len(word2)>len(word1)):
//             a+=word2[b::]
//         else:
//             a+=word1[b::]
//         return a

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder list = new StringBuilder();
        int b=Math.min(word1.length(),word2.length());
        int i;
        for (i=0; i<b; i++){
            list.append(word1.charAt(i));
            list.append(word2.charAt(i));
        }
        list.append(word1.substring(i));
        list.append(word2.substring(i));
        return list.toString();
    }
}
