class Solution {
    public int findMiddleIndex(int[] nums) {
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