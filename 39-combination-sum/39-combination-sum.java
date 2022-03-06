class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        
        func(0 , ans,new ArrayList<>(),target,candidates , n );
        return ans;
    }
    public void func(int ind , List<List<Integer>> ans ,List<Integer> ds, int target , int[] arr , int n)
    {
        
        if(ind == n)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[ind] <= target) // check whether the number is less than target or not
        {
            ds.add(arr[ind]);
            func(ind,ans,ds,target-arr[ind],arr,n); // pick condition
            ds.remove(ds.size()-1);
        }
        func(ind+1,ans,ds,target,arr,n); //not pick condition
        
    }
    
}