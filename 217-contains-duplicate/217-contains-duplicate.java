class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int ind=nums[i];
            
                if(nums[i+1]==ind)
                {
                    return true;
                } 

        }
        
        return false;
    }
}