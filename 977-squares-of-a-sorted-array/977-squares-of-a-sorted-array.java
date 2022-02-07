class Solution {
    public int[] sortedSquares(int[] nums) {
        int ar[] =  new int[nums.length];
        int temp=0;
        for(int i = 0 ; i <nums.length ; i++)
        {
            ar[i]=nums[i]*nums[i];
            
        }
        Arrays.sort(ar);
        return ar;
    }
}