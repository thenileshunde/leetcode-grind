class Solution {
    public String largestGoodInteger(String num) {
        // ****************** approach 1 Optimal **********************
        int i=1;
        int counter=1;
        int goodCharIndex = -1 ;
        char prevChar = num.charAt(0);
        while(i<num.length())
        {
            char curr = num.charAt(i);
            if(num.charAt(i) == prevChar )
            {
                counter++;
                if(counter == 3 && (goodCharIndex==-1 || ( curr > num.charAt(goodCharIndex))))
                {
                    goodCharIndex = i-2;
                    counter = 1;
                }
            }
            else
                counter = 1;
            prevChar = curr;
            i++;
        }
        // ****************** approach 2 Optimal **********************
        // int goodCharIndex = -1;
        // for(int i=0; i<= num.length()-3; i++)
        // {
        //     if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2) )
        //     {
        //         if(goodCharIndex == -1 || (num.charAt(i) > num.charAt(goodCharIndex)))
        //         {
        //             goodCharIndex = i;
        //         }
        //     }
        // }
        return goodCharIndex == -1 ? "" : num.substring(goodCharIndex, goodCharIndex+3); 
    }
}