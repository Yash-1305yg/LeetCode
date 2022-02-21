import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i: nums)
        {
            map.put(i , map.getOrDefault(i ,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++)
        {
            int r = nums[i];
            if(map.get(r)!=null && max <map.get(r))
                max = map.get(r);
        }
        
        int t =getKey(map,max);
        return t;
    }
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (K key: map.keySet())
        {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}