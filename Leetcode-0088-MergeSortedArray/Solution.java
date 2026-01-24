class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // ****************** approach 1 **********************
        // int i = m-1, j=n-1,  k = m+n-1;
        // while(j>=0)
        // {
        //     if(i>=0 && nums1[i]>=nums2[j])
        //     {
        //         nums1[k--] = nums1[i--];
        //     }
        //     else
        //     {
        //         nums1[k--] = nums2[j--];
        //     }
        // }

        // ****************** approach 2 - without using new variables **********************
        while(n-1>=0)
        {
            if(m-1>=0 && nums1[m-1]>=nums2[n-1])
            {
                nums1[m+n-1] = nums1[m-1]; m--;
            }
            else
            {
                nums1[m+n-1] = nums2[n-1]; n--;
            }
        }
    }
}