class Solution {
    public int removeElement(int[] nums, int val) {
        int n,i,j,count=0;
        n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]==val){
                count++;
                for(j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                i--;
                n--;
            }
        }
        return n;
    }
}