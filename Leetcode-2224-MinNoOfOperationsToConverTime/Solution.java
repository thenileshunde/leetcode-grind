class Solution {
    public int convertTime(String current, String correct) {
        // ****************** approach 1 Optimal **********************
        // String[] initTime = current.split(":");
        // String[] newTime = correct.split(":");
        // int currMins = Integer.parseInt(initTime[0]) * 60 + Integer.parseInt(initTime[1]);
        // int endMins = Integer.parseInt(newTime[0]) * 60 + Integer.parseInt(newTime[1]);
        // int diffMins = endMins - currMins;
        // int steps = 0;
        // while(diffMins != 0)
        // {
        //     int localSteps = 0;
        //     if(diffMins % 60 != diffMins)
        //     {
        //         localSteps = diffMins / 60; 
        //         diffMins -= localSteps * 60;
        //     }
        //     else if(diffMins % 15 != diffMins)
        //     {
        //         localSteps = diffMins / 15;
        //         diffMins -= localSteps * 15;
        //     }
        //     else if(diffMins % 5 != diffMins)
        //     {
        //         localSteps = diffMins / 5;
        //         diffMins -= localSteps * 5;
        //     }
        //     else 
        //     {
        //         localSteps = diffMins;
        //         diffMins = 0;
        //     }
        //     steps += localSteps;

        // }
        // return steps;

        // ****************** approach 2 Optimal **********************
        int[] ops = {60,15,5,1};
        int diffMins = getMinutes(correct) - getMinutes(current);
        int steps = 0;
        for(int op : ops)
        {
            steps += diffMins / op;
            diffMins %= op;
        }
        return steps;
        
    }
    
    int getMinutes(String s)
    {
        return Integer.parseInt(s.substring(0,2)) * 60 + Integer.parseInt(s.substring(3,5));
    }
}