class Solution {
    public int removeElement(int[] nums, int val) {
        // ****************** approach 1 Optimal - Overthinking ***********************
        // int diff = 0;
        // for(int i=0; i<nums.length; i++)
        // {
        //     if(nums[i]== val)
        //     {
        //         diff++;continue;
        //     }
        //     if(diff>0)
        //     {
        //         nums[i-diff] = nums[i];
        //     }
        // }
        // return nums.length-diff;

        // ****************** approach 2 Optimal **********************
        int k=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}