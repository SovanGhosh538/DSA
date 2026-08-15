import java.io.*;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            if(target<nums[i] || target==nums[i]){
                return i;
            }
        }
        return n;
    }
}