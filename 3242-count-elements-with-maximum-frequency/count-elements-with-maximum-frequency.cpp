class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int> hash;
        int n=size(nums);
        for(int i=0;i<n;i++)
           hash[nums[i]]++;
        int max=0;
        for(auto it : hash){
            if(it.second>max)
              max=it.second;
        }
        int output=0;
        for(auto it : hash){
            if(it.second==max)
              output += max;
        }
        return output;
    }
};