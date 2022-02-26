class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int lo= 0 , hi = arr.length -1, mi=0;
        // //1st method
        // while(lo <=hi)
        // {   mid= (lo + hi)/2;
        //     if(arr[mid+1] < arr[mid] && arr[mid-1] < arr[mid])
        //     {
        //         return mid;
        //     }
        //     if(arr[mid+1] > arr[mid])
        //     {
        //         lo=mid+1;
        //     }
        //     else
        //     {
        //         hi=mid-1;
        //     }
        // }
        // return lo;
        
        //2nd method is same as above but checks are ifferent an less
        
        while(lo<hi)
        {
            mi= (lo+hi)/2;
            if(arr[mi] > arr[mi+1])
            {
                hi=mi;
            }
            else{
                lo=mi+1;
            }
        }
        return lo;
    }
}