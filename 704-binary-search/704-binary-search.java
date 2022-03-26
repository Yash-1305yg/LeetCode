class Solution {
    public int search(int[] nums, int target) {
        int start = 0; 
        int en=nums.length-1;
        while(start<=en)
        {
            int mi = (start+en)/2;
            if(nums[mi]==target)
            {
                return mi;
            }
            else if(nums[mi]>target)
            {
                en=mi-1;
            }
            else
            {
                start=mi+1;
            }
        }
        return -1;
    }
}