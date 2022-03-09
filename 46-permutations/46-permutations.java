class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> fs = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        func(nums,ans,fs,arr);
        return ans;
    }
    public void func(int[] nums, List<List<Integer>> ans,List<Integer> fs,boolean[] arr)
    {
        if(fs.size()==nums.length)
        {
            ans.add(new ArrayList<>(fs));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!arr[i])
            {
                arr[i]=true;
                fs.add(nums[i]);
                func(nums,ans,fs,arr);
                fs.remove(fs.size()-1);
                arr[i]=false;
            }
        }
    }
}