class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //there are two methods to solve this problem check notes
        //second method without using extra space
        List<List<Integer>> ans = new ArrayList<>();
        func(0,nums,ans);
        return ans;
    }
    public void func(int ind,int[] nums, List<List<Integer>> ans)
    {
        if(ind==nums.length)
        {
            List<Integer> fs = new ArrayList<>();
            for(int j:nums)
            {
                fs.add(j);
            }
            ans.add(new ArrayList<>(fs));
            return;
        }
        
        for(int i=ind;i<nums.length;i++)
        {
            swap(i,ind,nums);
            func(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int i,int j,int[] nums)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}