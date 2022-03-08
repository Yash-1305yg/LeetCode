class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        func(0,nums,list,new ArrayList<>());
        return list;
    }
    
    public void func(int ind,int[] nums, List<List<Integer>>  list , List<Integer> ds)
    {
        // if(ind>=n)
        // {
            list.add(new ArrayList<>(ds));
        //     return;
        // }
        
        for(int i= ind;i<nums.length;i++)
        {
            if(i!=ind && nums[i] == nums[i-1])
                continue;
            ds.add(nums[i]);
            func(i+1,nums,list,ds);
            ds.remove(ds.size()-1);
        }
        
    }
}