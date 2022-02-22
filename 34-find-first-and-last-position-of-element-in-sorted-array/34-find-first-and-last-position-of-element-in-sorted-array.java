class Solution {
    public int[] searchRange(int[] nums, int target) {
        int k=0;
        
        int[] ans ={-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(k==0)
                    ans[0]=i;
                k=1;
                ans[1]=i;
                
            }
            
        }
        
        return ans;
    }
}