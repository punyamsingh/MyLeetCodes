// Original Approach

// class Solution {
//     public int numSteps(String s) {
//         char[] num = s.toCharArray();
//         // for (char i: num) System.out.print(i + " ");
//         int l = num.length;
//         int tl=l;
//         int m=0;
//         while (!((num[0]=='1') && (l==1 || num[1]=='/'))){
//             if (num[tl-1]=='0'){
//                 num[tl-1]='/';
//                 tl--;
//                 // System.out.println("jai shri ram");
//             }
//             else{
//                 num=addOne(num, tl);
//                 int k=num.length-1;
//                 for (k=num.length-1; (k>=0 && num[k]=='/'); k--);
//                 tl=k+1;
//             }
//             m++;
//         }
//         return m;
//     }

//     public char[] addOne(char[] num, int tl){
//         int n=tl;
//         for (int i=n-1; i>=0; i--){
//             if (num[i]=='/') continue;
//             if (num[i]=='0'){
//                 num[i]='1';
//                 for (int j=i+1; j<n; j++){
//                     if (num[j]=='/') break;
//                     num[j]='0';
//                 }
//                 return num;
//             }
//         }
//         String snum = "1";
//         for (char c: num){
//             if (c=='/') break;
//             snum+='0';
//         }
//         return snum.toCharArray();
//     }
// }


class Solution {
    public int numSteps(String s) {
        int res = 0, carry = 0;

        for(int i = s.length() - 1; i> 0; i--){
            res++;
            if(s.charAt(i) - '0' + carry == 1){
                carry = 1;
                res ++;
            }

        }

        return res + carry;
    }
}
