class Solution {
    public int sumOfUnique(int[] nums) {
        // ****************** approach 1 Sorting the array **********************
        // Arrays.sort(nums);
        // int prev = nums[0];
        // int sum = nums[0];
        // int counter = 0;
        // for(int i=1; i< nums.length; i++)
        // {
        //     if(nums[i] != prev)
        //     {
        //         sum += nums[i];
        //         counter = 0;
        //     }
        //     else{
        //         counter++;
        //         if(counter == 1) sum -= nums[i];
        //     }
        //     prev = nums[i];
        // }
        // return sum;

        // ****************** approach 2 Using HashMap **********************
        // Map<Integer, Integer> freqTracker = new HashMap<>();
        // for(int i=0; i<nums.length; i++)
        // {
        //     freqTracker.put(nums[i], freqTracker.getOrDefault(nums[i],0)+1);
        // }
        // int sum = 0;
        // for(int key:freqTracker.keySet())
        // {
        //     if (freqTracker.get(key) == 1){
        //         sum += key;
        //     }
        // }
        // return sum;

        // ****************** approach 3 Using freqArray **********************
        int[] freqArray = new int[101];
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            freqArray[nums[i]] += 1;
        }
        for(int i=1; i<freqArray.length; i++)
        {
            if(freqArray[i] == 1) sum+= i;
        }
        return sum;
    }
}