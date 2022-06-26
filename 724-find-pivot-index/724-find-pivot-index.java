class Solution {
    public int pivotIndex(int[] nums) {
//         My Solution
//         int totalSum = 0;
//         for(int i:nums){
//             totalSum= totalSum+i;
//         }
//         int lo = 0;
//         int ans=0;
//         boolean flag = false;
//         for(int i =0;i<nums.length;i++){
//             int left=0;
//             int right = 0;
            
//             for(int j=0 ; j<i ; j++){
//                 left=left+nums[j];
//             }
            
//             right = totalSum - left - nums[i];
//             if(right ==left)
//                 {ans=i;
//                 flag = true;
//                 break;}
//         }
//         if(!flag){
//             return -1;
//         }
//         return ans;
        
//         Optimized code
        
        int sum = 0 , left =0;
        for(int i: nums){
            sum+=i;
        }
        for(int i=0;i< nums.length;i++){
            if(left == sum - nums[i] - left){
                return i;
            }
            left = left + nums[i];
        }
        return -1;
    }
}