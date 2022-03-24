class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int count=0;
        int hi = arr.length-1;
        int lo = 0;
        
        while(lo<=hi)
        {
            if(arr[lo]+arr[hi] <=limit)
            {count++;
             lo++;
             hi--;
            }
            
            else
            {
                count++;
                hi--;
            }
            
        }
        return count;
    }
}