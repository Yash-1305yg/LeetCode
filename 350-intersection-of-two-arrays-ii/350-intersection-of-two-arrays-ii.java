class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        
        while(i < nums1.length && j<nums2.length)
        {
            if(nums1[i] < nums2[j])
                {
                    i++;
                }
                else if(nums1[i] > nums2[j])
                {
                    j++;
                }
                else{
                    res.add(nums1[i++]);
                    j++;
                }
        }
        
        int[] output = new int[res.size()];
        int k=0;
        for(int l:res)
        {
            output[k++] = l;
        }
        return output;
    }
}