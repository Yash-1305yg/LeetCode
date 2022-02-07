class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int ind=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==ind)
                {
                    return true;
                }
            }
        }
        return false;
    }
}