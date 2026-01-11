class Solution {
    
    public int lengthOfLongestSubstring(String s) {

        // ****************** approach 1 Optimal **********************

        // int[] occurrenceTracker = new int[128];
        // int maxLength = 0;
        // int start = 0;
        // int currentLength = 0;
        // int currI = 0;
        // while(currI < s.length())
        // {
        //     char curr = s.charAt(currI);
        //     if(occurrenceTracker[curr] == 0)
        //     {
        //         occurrenceTracker[curr] = 1;
        //         maxLength = Math.max(maxLength, currI - start + 1);
        //         currI++;
        //     }
        //     else
        //     {
        //         occurrenceTracker[s.charAt(start)] = 0;
        //         start++;
        //     }
        // }
        // return maxLength;

        // ****************** approach 2 Optimal **********************
        int[] occurrenceTracker = new int[128];
        int maxLength = 0;
        int i = 0, j=0;
        while(j<s.length())
        {
            char c = s.charAt(j);
            i = Math.max(i, occurrenceTracker[c]);
            maxLength = Math.max(maxLength, j-i+1);
            occurrenceTracker[c] = j+1;
            j++;
        }
        return maxLength;
         
    }
}