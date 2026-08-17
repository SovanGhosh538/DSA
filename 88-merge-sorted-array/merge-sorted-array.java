class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
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