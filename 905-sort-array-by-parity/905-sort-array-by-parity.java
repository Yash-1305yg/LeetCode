class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = 0 ;
        int l = 0;
        int m=0;
        int temp[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] %2 == 0)
            {
                nums[k] = nums[i];
                k++;
            }
            else
            {
                temp[l] = nums[i];
                l++;
            }
        }
        
        for(int i = k ;i<nums.length ; i++)
        {
            nums[ i ] = temp[m];
            m++;
        }
        return nums;
    }
}