class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sorting helps to prevent duplicates
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n-2; i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue; //excluding the duplicate
            int l=i+1, r=n-1, sum=-1 * nums[i];
            while(l<r)
            {
                if(nums[l] + nums[r] == sum)
                {
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);triplet.add(nums[l]);triplet.add(nums[r]);
                    result.add(triplet);
                    l++;r--;
                    
                    // once we found the sum equal - we first check if there are duplicate num ahead
                    //  as it will give us the same sum
                    while(l<n && nums[l] == nums[l-1]) l++;
                    while(r>=0 && nums[r] == nums[r+1]) r--;
                }
                else if(nums[l] + nums[r] < sum) l++; // we move to right as we want our
                //  sum to be more than what we are currently getting
                // this is only possible because array is sorted & we know if we move to right 
                // we can increase the sum.
                else r--; //  we move to left as we want our sum to be less than what we are currently getting
            
                
                
            }
        }
        return result;
    }
}