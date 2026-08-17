class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int k=0;k<n;k++){
        //     for(int i=0;i<m+n-1;i++){
        //         if(nums2[k]<nums1[i] || nums1[i]==0){
        //             nums1[i]=nums2[k];
        //             break;
        //         }
        //     }
        // }
        int i,j=0,temp;
        for(i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        for(i=0;i<n+m-1;i++){
            for(j=0;j<n+m-i-1;j++){
                if(nums1[j]>nums1[j+1]){
                    temp=nums1[j+1];
                    nums1[j+1]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}