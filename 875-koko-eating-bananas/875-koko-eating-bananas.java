class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int lo = 1 ;int  hi = 1  ; int mid =0;
        for(int i=0 ; i< piles.length ; i++)
        {
            if(piles[i]  >hi)
                hi =piles[i] ;
        }
        
        while(lo < hi)
        {
            mid = (lo+hi)/2;
            
            int hours =0 ;
            
           for (int i=0 ;i< piles.length ; i++) {
                hours += Math.ceil((double) piles[i] / mid);
            }
            
            if(hours <= h)
            {
                hi = mid;
            }
            else
                lo = mid+1;
        }
        return hi;
    }
}