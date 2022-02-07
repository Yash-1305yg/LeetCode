class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return hr(nums , n);
    }
    public int hr(int[] nums , int n)
    {
        int max=0;
        
        if(n==0){
            return 0;
        }
        int k1=nums[0];
        if(n==1){
            
            return k1;
        }
        
        int k2=Math.max(nums[0] , nums[1]);
        if(n==2){
            return k2;
        }
        
        for(int i=2;i<nums.length;i++){
            max= Math.max(nums[i]+k1 ,k2);
            k1=k2;
            k2=max;
        }
        return max;
    }
}