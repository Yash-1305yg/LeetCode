class Solution {
    public int removeCoveredIntervals(int[][] in) {
        int res=0 ,left=-1 , right=-1;
        Arrays.sort(in, (a, b) -> a[0] - b[0]); // to sort the arrays accoring to their first element it is using lamba expression if the result is -1 then b i bigger else a is bigger
        for(int[] arr : in)
        {
            if(arr[0]>left && arr[1]>right)
            {
                left=arr[0];
                ++res;
            }
            right=Math.max(right, arr[1]);
        }
        return res;
    }
}