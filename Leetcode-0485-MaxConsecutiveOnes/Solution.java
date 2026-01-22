class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter =0, maxLength =0;
        for(int num:nums)
        {
            if(num == 0)
            {
                // here it is better to check max to check if num is 0 , because these max check happens rarely 
                // as it is a consecutive 1s there is less chance to encounter 0 than 1s
                // hence less Math.max calls.
                maxLength = Math.max(maxLength , counter);
                counter = 0;
            }
            else counter++;
        }
        maxLength = Math.max(maxLength , counter);
        return maxLength;
    }
}