class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int pos=Math.abs(nums[i]);
            nums[pos-1]=-(Math.abs(nums[pos-1]));
        }
        
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] >0)
            {
                res.add(i+1);
            }
        }
        return res;
    }
}