class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int k = nums1.length+nums2.length;
        int[] nums3 = new int[k];
        int l=0;
        if (k%2==1){
            int i=0; int j=0;
            while (i<n1 || j<n2){
                if (i==n1){
                    int q=0;
                    for (q=j; q<n2; q++){
                        nums3[l++]=nums2[q];
                    }
                    j=q;
                    break;
                }
                if (j==n2){
                    int q=0;
                    for (q=i; q<n1; q++){
                        nums3[l++]=nums1[q];
                    }
                    i=q;
                    break;
                }

                if (nums1[i]<nums2[j]){
                    nums3[l++]=nums1[i++];
                }
                else if (nums1[i]>nums2[j]){
                    nums3[l++]=nums2[j++];
                }
                else{
                    nums3[l++]=nums1[i++];
                    nums3[l++]=nums2[j++];
                }
            }
            // System.out.println(k);
            return nums3[k/2];
        }
        else{
            int i=0; int j=0;
            while (i<n1 || j<n2){
                if (i==n1){
                    int q=0;
                    for (q=j; q<n2; q++){
                        nums3[l++]=nums2[q];
                    }
                    j=q;
                    break;
                }
                if (j==n2){
                    int q=0;
                    for (q=i; q<n1; q++){
                        nums3[l++]=nums1[q];
                    }
                    i=q;
                    break;
                }

                if (nums1[i]<nums2[j]){
                    nums3[l++]=nums1[i++];
                }
                else if (nums1[i]>nums2[j]){
                    nums3[l++]=nums2[j++];
                }
                else{
                    nums3[l++]=nums1[i++];
                    nums3[l++]=nums2[j++];
                }
            }
            // System.out.println(nums3);
            // for (int o: nums3) System.out.println(o);
            return (float) (nums3[k/2]+nums3[k/2 - 1])/2;
        }
    }
}
