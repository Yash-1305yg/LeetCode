class Solution {
    public int search(int[] nums, int target) {
        int lo = 0 , hi=nums.length-1 , mid = 0;
        
        while(lo <=hi)
        {
            mid=(lo+hi)/2;
            
            if(nums[mid] == target)
            {
                return mid;
            }
            
            if(nums[mid] <= nums[hi])
            {
                if(target > nums[mid] && target <= nums[hi])
                {
                    lo = mid+1;
                }
                else
                {
                    hi = mid-1;
                }
            }
            
            if(nums[lo] <= nums[mid])
            {
                if(target >= nums[lo] && target < nums[mid])
                {
                    hi = mid-1;
                }
                else
                    
                {
                    lo = mid+1;
                }
            }
        }
        return -1;
    }
}