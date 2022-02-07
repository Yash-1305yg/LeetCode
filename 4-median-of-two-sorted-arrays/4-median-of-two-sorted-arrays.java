class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length + nums2.length];
        int low=nums3[0] ; 
        int high = nums3.length - 1;
        int mid = 0;
        int mid2=0;
        double median =0 ;
        
        for(int i = 0 ; i <nums1.length; i++)
        {
            nums3[i]=nums1[i];
        }
        for(int i = nums1.length ; i <nums1.length + nums2.length; i++)
        {
            nums3[i]=nums2[i-nums1.length];
        }
        Arrays.sort(nums3);
        
        while(low<=high)
        {
            if(nums3.length %2 !=0)
            {
                mid = (low + high) / 2 ;
                return nums3[mid];
            }
            
            else
            {
                mid=(low+high)/2;
                mid2 = mid +1;
                median=(double)(nums3[mid] + nums3[mid2])/2;
                return median;
            }
        }
        return low;
    }
}