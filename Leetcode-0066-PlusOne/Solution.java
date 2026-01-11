class Solution {
    public int[] plusOne(int[] digits) {
        // ****************** approach 1 Optimal **********************
        // int carry = 1;
        // int i = digits.length-1;
        // while(i>=0)
        // {
        //     if(digits[i] < 9 && carry != 0)
        //     {
        //         digits[i] =  digits[i] + carry;
        //         carry = 0;
        //         break;
        //     }
        //     else if(digits[i] == 9 && carry == 1)
        //     {
        //         digits[i] = 0;
        //         carry = 1;
        //     }
        //     i--;
        // }
        // if(carry == 1)
        // {
        //     int[] newDigits = new int[digits.length+1];
        //     newDigits[0] = carry;
        //     System.arraycopy(digits, 0, newDigits, 1, digits.length);
        //     return newDigits;
        // }
        // else
        //     return digits;

        // ****************** approach 2 Optimal **********************
        // int carry = 1;
        // int i = digits.length-1;
        // while(i>=0)
        // {
        //     int newDigit = digits[i] + carry;
        //     digits[i] = newDigit % 10;
        //     carry = newDigit / 10;
        //     if(carry < 1) break;
        //     i--;
        // }
        // if(carry == 1)
        // {
        //     int[] newDigits = new int[digits.length+1];
        //     newDigits[0] = carry;
        //     System.arraycopy(digits, 0, newDigits, 1, digits.length);
        //     return newDigits;
        // }
        // else
        //     return digits;

        // ****************** approach 3 Optimal **********************
        final int n=digits.length;
        for(int i=n-1; i>=0; i--){
            digits[i]++;
            if (digits[i]<10) return digits;
            digits[i]=0;
        }
        // we reach to this point only if the array has all digits as  9999...
        // as there is no digit to absorb the carry - we need to prepend the array by 1.
        digits=new int[n+1];
        digits[0]=1;
        return digits;
    }
}