class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;
        if(m == 0) 
        {
            while(n != 0)
            {
                nums1[n-1] = nums2[n-1];
                n--;
            }
            return;
        }
        while(n != 0)
        {
            if(m==0 || nums2[n-1]>=nums1[m-1])
            {
                nums1[m+n-1] = nums2[n-1]; n--;
            }
            else
            {
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
        }
    }
}