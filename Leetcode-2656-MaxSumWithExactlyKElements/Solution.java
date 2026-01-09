class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for(int i:nums)
        {
            max = Math.max(max, i);
        }
        
        int sum = 0;
        while(--k>0)
        {
            sum += max;
            max += 1;
            k--;
        }
        return sum;
    }
}