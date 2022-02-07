class Solution {
    public int maxSubArray(int[] nums) {
        int max1=nums[0] ; int max2 = nums[0];
        
        for(int i =1;i<nums.length;i++)
        {
            max2=Math.max(max2+nums[i] , nums[i]);
            max1=Math.max(max1,max2);
        }
        return max1;
    }
}