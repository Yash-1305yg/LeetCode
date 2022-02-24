class Solution {
    public int findPeakElement(int[] arr) {
        int lo= 0 , hi = arr.length -1, mid=0;
        
        while(lo <hi)
        {   mid= (lo + hi)/2;
            
            if(arr[mid+1] < arr[mid] )
            {
                hi=mid;
            }
            
            else
            {
                lo=mid+1;
            }
        }
        return lo;
    
    }
}