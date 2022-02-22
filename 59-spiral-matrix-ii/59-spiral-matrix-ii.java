class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int fill=1;
        
        int rowstart=0;
        int rowend=matrix.length-1;
        int colstart=0;
        int colend=matrix[0].length-1;
        
        
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart ;i<=colend;i++)
            {
                matrix[rowstart][i]=fill++;
            }
            rowstart++;
            
            for(int i=rowstart ;i<=rowend;i++)
            {
                matrix[i][colend]=fill++;
            }
            colend--;
            
            if(rowstart<=rowend)
            {
                for(int i=colend ; i>=colstart;i--)
                {
                    matrix[rowend][i]=fill++;
                }
            }
            rowend--;
            if(colstart<=colend)
            {
                for(int i=rowend ; i>=rowstart;i--)
                {
                    matrix[i][colstart]=fill++;
                }
            }
            colstart++;
        }
        
        return matrix;
    }
}