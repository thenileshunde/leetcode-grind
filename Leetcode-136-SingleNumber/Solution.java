class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0; 
        for(int i:nums)
        {
            ans ^= i;
        }
        return ans;
    }
}
// the logic is simple , xor of same number is 0 , xor is also associative i.e (a^b)^c = a^(b^c).
// we use xor because : Properties that matter
// 1️⃣ a ^ a = 0
// 2️⃣ a ^ 0 = a
// 3️⃣ XOR is commutative and associative
// (0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1) => (0^0) ^ (1^1) ^ (3^3) ^ 2 => 0 ^ 0 ^ 0 ^ 2 => 2
// in the end only unique number is left.