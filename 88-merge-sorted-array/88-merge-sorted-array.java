class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n ; i++)
        {
            nums1[m+i]=nums2[i];
        }
        int temp =0;
        for(int j = 0 ; j <m+n; j++)
        {
            for(int k = j ; k >0 ; k--)
            {
                if(nums1[k] <=nums1[k-1])
                {
                    temp = nums1[k-1];
                    nums1[k-1]=nums1[k];
                    nums1[k]=temp;
                }
            }
        }
    }
}