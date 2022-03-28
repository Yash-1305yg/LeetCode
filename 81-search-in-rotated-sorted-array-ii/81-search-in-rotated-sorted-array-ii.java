class Solution {
    public boolean search(int[] nums, int target) {
//         int end = 0;
//         while(end<nums.length-1 && nums[end]<nums[end+1])
//         {
//             end++;
//         }
//         int start=0;
        
//         int end2=end;
//         boolean bool = false;
//         // int mid2 = (start+end)/2;
//         while(start <= end)
//         {   
//             int mid = (start+end)/2;
//             if(nums[mid]==target)
//             {
//                 bool= true;
//                 break;
//             }
                
            
//             else if(nums[mid] >target)
//             {
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
//         }
//         if(bool == false)
//         {
//             int start2=end2+1;
//             end2 = nums.length-1;
            
//             while(start2<=end2)
//             {
//                 int l = (start2+end2)/2;
//                 if(nums[l]==target)
//                    {bool= true;}
//                 else if(nums[l] >target)
//                 {
//                     end2=l-1;
//                 }
//                 else{
//                     start2=l+1;
//                 }
//             }
            
//         }
//         return bool;
        int n = nums.length;
        if (n == 0) return false;
        int end = n - 1;
        int start = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (!isBinarySearchHelpful(nums, start, nums[mid])) {
                start++;
                continue;
            }
            // which array does pivot belong to.
            boolean pivotArray = existsInFirst(nums, start, nums[mid]);

            // which array does target belong to.
            boolean targetArray = existsInFirst(nums, start, target);
            if (pivotArray ^ targetArray) { // If pivot and target exist in different sorted arrays, recall that xor is true when both operands are distinct
                if (pivotArray) {
                    start = mid + 1; // pivot in the first, target in the second
                } else {
                    end = mid - 1; // target in the first, pivot in the second
                }
            } else { // If pivot and target exist in same sorted array
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
    // returns true if element `target` exists in the first sorted array.
private boolean existsInFirst(int[] arr, int start, int element) {
    return arr[start] <= element;
}
    // returns true if we can reduce the search space in current binary search space
private boolean isBinarySearchHelpful(int[] arr, int left, int element) {
    return arr[left] != element;
}
}