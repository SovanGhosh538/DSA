class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j;
        int n=nums.length;
        for(i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                for(j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                n--;
                i--;
            }
        }
        return n;
    }
}