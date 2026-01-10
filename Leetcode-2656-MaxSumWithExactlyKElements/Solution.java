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
        // here the if we check the ans of the samples, we can observe that - 
        // if k is 3, then ans is max * 3 + sum of all natural numbers till 2 i.e. k-1;
        // similarly if k is 5 ans is max * 5 + sum of all natural numbers till 4 i.e. k-1
        // so sum of first k-1 natural numbers is (k-1) * ((k-1)+1) / 2 => (k-1) * k / 2. 
        int sum = (max * k + (k-1)*k/2);
        return sum;
    }
}