class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo=0 ; int hi=nums.length-1;
        int len = nums.length;
        
        while(lo<hi )
        {
            int mid=(lo+hi)/2;
            if(nums[mid] == nums[mid+1])
            {
                mid=mid-1;
            }
            if((mid-lo+1)%2!=0)
            {
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return nums[lo];
        
    }
}