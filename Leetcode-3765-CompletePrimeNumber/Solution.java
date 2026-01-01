class Solution {
    
    public boolean completePrime(int num) {
        if(!isPrime(num)) return false;
        int temp = num/10;
        while(temp!=0)
        {
            if(!isPrime(temp)) return false;
            temp/=10;
        }
        int i=10;
        while(num%i!=num)
        {
            if(!isPrime(num%i)) return false;
            i*=10;
        }
        return true;
    }

    public boolean isPrime(int n)
    {
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5; i*i<=n; i+=6)
        {
            if(n%i == 0 || n%(i+2)==0 ) return false;
        }
        return true;
    }
}