class Solution {
    public int maximumDifference(int[] nums) {
        int max=0 , max2 =0;
        for(int i =0 ; i < nums.length ; i ++)
        {
            for(int j =i;j<nums.length ; j ++)
            {
                if(nums[i] < nums[j])
                {
                    max=nums[j]-nums[i];
                    if(max2<max)
                    {
                        max2 = max;
                    }
                }
                
            }
            
        }
        if(max2==0)
        {
            return -1;
        }
        return max2;
    }
}