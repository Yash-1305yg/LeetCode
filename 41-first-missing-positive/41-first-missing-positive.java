class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i ,map.getOrDefault(i,0)+1);
        }
        int l=1;
        while(l<=nums.length)
        {
            if(map.getOrDefault(l,0) ==0 )
            {
                return l;
            }
            l++;
        }
        return l;
    }
}