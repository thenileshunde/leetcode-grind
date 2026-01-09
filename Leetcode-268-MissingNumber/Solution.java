class Solution {
    public int missingNumber(int[] nums) {
        // ****************** approach 1 Optimal **********************
        // int n = nums.length;
        // int sumN = n * (n + 1) / 2 ;
        // for(int i=0; i<n; i++)
        // {
        //     sumN -= nums[i];
        // }
        // return sumN;

        // ****************** approach 2 Optimal **********************
        // explaination: https://chatgpt.com/share/695ffc4b-4de8-800e-bf6e-9fcb6e73f63f
        int ans = nums.length;
        // Start with n
        // Because the array contains numbers from 0 to n except one, and indices only go 0 to n-1
        // we use xor because : Properties that matter
        // 1️⃣ a ^ a = 0
        // 2️⃣ a ^ 0 = a
        // 3️⃣ XOR is commutative and associative
        // (0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1) => (0^0) ^ (1^1) ^ (3^3) ^ 2 => 0 ^ 0 ^ 0 ^ 2 => 2
        for(int i=0; i<nums.length; i++)
        {
            ans ^= i ^ nums[i];
        }
        return ans;
        
    }
}