class Solution {
    public int diagonalSum(int[][] mat) {
        int temp=mat[0].length-1;
        int psum=0;
        int ssum=0;
        int len=mat.length;
        int res=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i==j)
                {
                    psum=psum+mat[i][j];
                }
                
            }
            if(temp>=0)
                ssum=ssum+mat[i][temp];
            temp--;
        }
        if(len%2==0)
        {
            res = res+ssum+psum;
        }
        else
        {
            res=(res+ssum+psum) - mat[len/2][len/2];
        }
        return res;
        
    }
}