class Solution {
    public int findPeakElement(int[] arr) {
         int lo= 0 , hi = arr.length -1, mi=0;
        while(lo<hi)
        {
            mi= (lo+hi)/2;
            if(arr[mi] > arr[mi+1])
            {
                hi=mi; /// means we are in the decresaing part of the array an it is a possible outcome 
            }
            else{
                lo=mi+1;  // means we are in the increasing part of the array an it cannot be the  possbile outocme
            }
        }
        return lo;  //int the en start an en willl point to the same element due to the above checks
    }
}