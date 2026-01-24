class Solution {
    public int majorityElement(int[] nums) {
        
        // ****************** approach 1 Optimal - Using HashMap **********************
        // int initialCapacity = (nums.length / 2) + 1;
        // // 1. Pre-size the map to avoid resizing overhead
        // // Capacity = (expected elements / load factor) + 1
        // Map<Integer, Integer> map = new HashMap<>(initialCapacity);
        
        // int threshold = nums.length / 2;

        // for (int num : nums) {
        //     // 2. Use merge to update and get the new value in one go
        //     int count = map.merge(num, 1, Integer::sum);
            
        //     // 3. Early exit
        //     if (count > threshold) {
        //         return num;
        //     }
        // }
        // return -1;

        /* 
            The Boyer-Moore Voting Algorithm is a stroke of genius because 
            it solves the problem in $O(n)$ time and $O(1)$ space.
            While the HashMap approach needs memory to store every unique number, 
            Boyer-Moore realizes that if a majority element exists, 
            it will "outvote" all other elements combined.How the "Voting" Works - 
            Think of it like a battlefield:We pick a candidate and give them a count (their "army" size).
            If we see the same number again, the army grows (count++).
            If we see a different number, it challenges our candidate and both "soldiers" are knocked out (count--).
            If the count hits zero, the current candidate is defeated, 
            and we pick the next number we see as the new candidate.
            Because the majority element appears more than $n/2$ times, 
            it is guaranteed to be the "last person standing."
        */

        // ****************** approach 2 Optimal - Using Boyer-Moore Voting Algorithm **********************
        // int count=1, n=nums.length;
        // int num = nums[0];
        // for(int i=1; i<n; i++)
        // {
        //     if(nums[i] == num)
        //     {
        //         count++;
        //     }
        //     else count--;
        //     if(count==0)
        //     {
        //         num = nums[i];
        //         count++;
        //     }
        // }
        // return num;

        // ****************** approach 2 Optimal - Using Boyer-Moore Voting Algorithm - clean code **********************
        public int majorityElement(int[] nums) {
            int candidate = 0;
            int count = 0;

            for (int num : nums) {
                // If the army is empty, pick a new candidate
                if (count == 0) {
                    candidate = num;
                }
                
                // If we see our candidate, increase strength. 
                // If we see an enemy, decrease strength.
                count += (num == candidate) ? 1 : -1;
            }

            return candidate;
        }
    }
}