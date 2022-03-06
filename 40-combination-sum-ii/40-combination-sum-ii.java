class Solution {
    //first method can be same as combination sum1 but use set and add ds list to set and then convert set to list of list but it will take a lot of time
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        func(0 , ans,new ArrayList<>(),target,candidates);
        return ans;
    }
    private void func(int ind , List<List<Integer>> ans ,List<Integer> ds, int target , int[] arr )
    {
        if(target ==0 )
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i= ind;i<arr.length;i++)
        {
            if(i>ind && arr[i] == arr[i-1])
                continue;
            if(arr[i] > target)
                break;
            
            ds.add(arr[i]);
            func(i+1 ,ans,ds,target-arr[i],arr);
            ds.remove(ds.size()-1);
        }
        
    }
}