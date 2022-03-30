class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k=0;
        for( int i=0 ;i<m-1;i++)
        {
            if(target>matrix[i][n-1])
            {
                k++;
            }
        }
           
                int start=0;
                int end = n-1;
                while(start<=end)
                {
                    int mid = (start+end)/2;
                    if(matrix[k][mid] == target)
                        return true;
                    else if(matrix[k][mid] > target)
                    {
                        end=mid-1;
                    }
                    else
                    {
                        start=mid+1;
                    }
                }
            
        
        return false;
    }
}