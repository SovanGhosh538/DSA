class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length, temp, i, j;

        for(i = 0; i < n - 1; i++) {
            for(j = 0; j < n - 1 - i; j++) {

                if(nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        if(nums[0] != 0) {
            return 0;
        }

        for(i = 0; i < n - 1; i++) {

            if(nums[i + 1] != nums[i] + 1) {
                return nums[i] + 1;
            }
        }

        return n;
    }
}