class Solution {
    public int[] searchRange(int[] nums, int target) {
        // // 1st method //
        // int k=0;
        // int[] ans ={-1,-1};
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         if(k==0)
        //             ans[0]=i;
        //         k=1;
        //         ans[1]=i;
        //     }
        // }
        // return ans;
        
        // 2nd method usin BS //
        
        int[] ans={-1,-1};
        ans[0] = search(nums , target,true); // here we are finding the first index of target element
        ans[1] = search(nums,target,false); ///and here the last index
        return ans;
    }
        public int search(int[] arr, int target, boolean type)
        {
            int ans =-1;
            int start=0;
            int en=arr.length-1;
             while (start <= en) {
                int mi = (start + en) / 2;
                if (target == arr[mi]) 
                {
                    ans=mi;
                    if(type)
                    {
                        en=mi-1;
                    }
                    else{
                        start=mi+1;
                    }
                } 
                else if (target < arr[mi]) 
                {
                    en = mi - 1;
                } 
                else 
                {
                    start = mi + 1;
                }
            
            }
            return ans;
        }
}