class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        int sum=0;
        res[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            sum=gain[i] +sum;
            res[i+1] = sum;
        }
        
        int max=Integer.MIN_VALUE;
        for(int i:res)
        {
            if(max<i)
                max=i;
        }
        return max;
    }
}