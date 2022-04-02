class Solution {
    public int arrangeCoins(int n) {
        long lo=0 , hi= n;
        while(lo<=hi)
        {
            long mid = lo+(hi-lo)/2;
            long res = (mid*(mid+1))/2;
            if(res == n)
                return (int)mid;
            else if(res < n)
            {
                lo=mid+1;
            }
            else
                hi=mid-1;
        }
        return (int)hi;
    }
}