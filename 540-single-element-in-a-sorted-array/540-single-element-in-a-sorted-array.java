class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo=0 ; int hi=nums.length-1;
        int len = nums.length;
        //here we are checking the length of right and left subarray
        //if nums[mid] = nums[mid+1] then move mid to 1 behind
        // then check the length of left subarray if it is odd then move hi to id
        // else move to lo mid+1
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