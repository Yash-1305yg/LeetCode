class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count=0 ,result = 0;
        for(int i=0 ; i<nums.length ; i++)
        {
           if(nums[i]==1)
           {
               count++;
               
           }
           else
           {
               result=Math.max(count,result);
               count=0;
               
           }
           
        }
        return Math.max(result,count);
    }
    
}