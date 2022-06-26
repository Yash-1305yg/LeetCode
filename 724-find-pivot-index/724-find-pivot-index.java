class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i:nums){
            totalSum= totalSum+i;
        }
        int lo = 0;
        int ans=0;
        boolean flag = false;
        for(int i =0;i<nums.length;i++){
            int left=0;
            int right = 0;
            
            for(int j=0 ; j<i ; j++){
                left=left+nums[j];
            }
            
            right = totalSum - left - nums[i];
            if(right ==left)
                {ans=i;
                flag = true;
                break;}
        }
        if(!flag){
            return -1;
        }
        return ans;
    }
}