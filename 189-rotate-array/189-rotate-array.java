class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0)
            return;
        if(nums==null || nums.length==0)
            return;
        int[] res = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            int newindex = (i+k) %nums.length;
            res[newindex] = nums[i];
        }
        for(int i=0  ;i<nums.length;i++)
        {
            nums[i]=res[i];
        }
    }
}