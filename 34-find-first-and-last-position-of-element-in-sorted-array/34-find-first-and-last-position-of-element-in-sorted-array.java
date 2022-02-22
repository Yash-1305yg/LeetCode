class Solution {
    public int[] searchRange(int[] nums, int target) {
        int k=0;
        int founs=0;
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(k==0)
                    ans[0]=i;
                k=1;
                ans[1]=i;
                founs++;
            }
            
        }
        if(founs==0)
        {
            for(int i=0;i<ans.length;i++)
            {
                ans[i]=-1;
            }
        }
        return ans;
    }
}