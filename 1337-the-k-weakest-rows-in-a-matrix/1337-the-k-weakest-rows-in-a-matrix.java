class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
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
            arr[in]=Integer.MAX_VALUE;
        }
        return res;
    }
}