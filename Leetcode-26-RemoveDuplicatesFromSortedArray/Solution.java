class Solution {
    public int removeDuplicates(int[] nums) {

        // ****************** approach 1 Optimal **********************
        // int uniqueCounter = 1;
        // int lui = 0;// last unique index
        // for(int i=1; i<nums.length; i++)
        // {
        //     if(nums[i] != nums[i-1])
        //     {
        //         uniqueCounter++;
        //         nums[lui+1] = nums[i];
        //         lui++;
        //     }
        // }
        // return uniqueCounter;

        // ****************** approach 2 Optimal **********************
        int lui = 0; // last unique index
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] != nums[i-1])
            {
                lui++;
                nums[lui] = nums[i];
            }
        }
        return lui+1;
    }
}