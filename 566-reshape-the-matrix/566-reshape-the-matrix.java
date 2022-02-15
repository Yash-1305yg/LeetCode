class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[r][c];
        if(m*n != r*c)
            return mat;
        int sr=0;
        int sc=0;
        for(int i =0;i< m ;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sc == c)
                {
                    sr++;
                    sc=0;
                }
                res[sr][sc]= mat[i][j];   
                sc++;
            }
        }
        return res;
    }
}