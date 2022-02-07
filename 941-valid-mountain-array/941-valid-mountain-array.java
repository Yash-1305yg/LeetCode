class Solution {
    public boolean validMountainArray(int[] arr) {
        int lo = 0 ;
        int hi = arr.length-1;
        
        if(arr.length <3)
        {
            return false;
        }
        
        while(lo<hi)
        {
            if(arr[lo+1] > arr[lo])
            {
                lo++;
            }
            else if(arr[hi-1] > arr[hi])
            {
                hi--;
            }
            else
            {
                break;
            }
        }
        
        return lo == hi && lo!=0 && hi!=arr.length-1 ;
        
            
    }
}