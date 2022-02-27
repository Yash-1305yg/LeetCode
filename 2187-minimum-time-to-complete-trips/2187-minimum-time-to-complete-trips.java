class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start=0 ; 
        long min = time[0];
        for(int i:time)
        {
            if(min<i)
                min=i;
        }
        long end =totalTrips*min;
        
        while(start < end)
        {
            long mid = (start+end)/2;
            long trips =0;
            for(int i:time)
            {
                trips = trips+(mid)/i;
            }
            if(trips<totalTrips)
                start=mid+1;
            else{
                end=mid;
            }
        }
        return start;
    }
}