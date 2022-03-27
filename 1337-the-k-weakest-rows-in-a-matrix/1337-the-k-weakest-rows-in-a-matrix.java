class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        //first we will fin the number of ones in each row an store in the arr array
        int m=mat.length;
        int n=mat[0].length;
        int[] arr= new int[mat.length];
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
                else
                    break;
            }
            arr[i] =count;
        }
        //then we will fin the k minimum element in arr array an store their inexes in the res array
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            int min = Integer.MAX_VALUE;
            int in=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min= arr[j];
                    in=j;
                }
                
            }
            res[i]=in;
            arr[in]=Integer.MAX_VALUE; // we have done this to stop visiting the same element once again
        }
        return res;
    }
}