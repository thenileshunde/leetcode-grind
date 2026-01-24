class Solution {
    public void moveZeroes(int[] nums) {

        // ****************** approach 1 Optimal **********************
        // int zeroCounter = 0; 
        // for(int i=0; i< nums.length; i++)
        // {
        //     if(nums[i] == 0) 
        //     {
        //         zeroCounter++;
        //         continue;
        //     }
        //     if(zeroCounter>0)
        //     {
        //         nums[i-zeroCounter] = nums[i];
        //     }
        // }
        // while(zeroCounter>0)
        // {
        //     nums[nums.length - zeroCounter] = 0;
        //     zeroCounter--;
        // }

        // ****************** approach 2 Optimal **********************
        int k=0; 
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                nums[k++] = nums[i];
            }
        }
        while(k<nums.length)
        {
            nums[k++] = 0;
        }
    }
}