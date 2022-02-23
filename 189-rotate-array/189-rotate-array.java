class Solution {
    public void rotate(int[] nums, int k) {
//         /// 1st method naive soltuion///
//         if(k==0)
//             return;
//         if(nums==null || nums.length==0)
//             return;
//         int[] res = new int[nums.length];
        
//         for(int i=0;i<nums.length;i++)
//         {
//             int newindex = (i+k) %nums.length;
//             res[newindex] = nums[i];
//         }
//         for(int i=0  ;i<nums.length;i++)
//         {
//             nums[i]=res[i];
//         }
        
        ///2nd method////
        
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    
    public void reverse(int[] nums , int start,int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}