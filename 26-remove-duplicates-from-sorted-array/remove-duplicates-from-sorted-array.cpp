class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n=nums.size();
        vector<int> stack;
        int i;
        for(i=0;i<n-1;i++){
            if(nums[i+1]!=nums[i]){
                stack.emplace_back(nums[i]);
            }
        }
        stack.emplace_back(nums[i]);
        int m=stack.size();
        for(int i=0;i<m;i++){
            nums[i]=stack[i];
        }
        return m;
    }
};