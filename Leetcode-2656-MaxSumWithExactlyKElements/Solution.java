class Solution {
    public int maximizeSum(int[] nums, int k) {
        // ****************** approach 1 Optimal **********************
        // int max = nums[0];
        // for(int i:nums)
        // {
        //     max = Math.max(max, i);
        // }
        
        // int sum = 0;
        // while(k>0)
        // {
        //     sum += max;
        //     max += 1;
        //     k--;
        // }
        // return sum;

        // ****************** approach 2 Optimal **********************
        int max = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            max = Math.max(max, nums[i]);
        }
        int ans = (max * k + (k-1)*k/2);
        return ans;
    }
}