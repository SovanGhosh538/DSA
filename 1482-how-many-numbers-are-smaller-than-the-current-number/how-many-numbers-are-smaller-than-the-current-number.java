class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int m=nums.length;
        int[] nums2 = new int[m];
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<n) count++;
            }
            nums2[i]=count;
        }
        for(int i=0;i<nums.length;i++)
            nums[i]=nums2[i];
        return nums;
    }
}