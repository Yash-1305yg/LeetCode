class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length ;
        int n = obstacleGrid[0].length;
        int[][] ar = new int[m][n];
        
        boolean flag = false;
        
        //agar rows mein obstacle mile to us position ke age ki cells lo 0 kar do
        for(int i = 0 ; i <n;i++){
            if(flag  || obstacleGrid[0][i]==1)
            {
                flag=true;
                ar[0][i]=0;
            }
            else{
                ar[0][i]=1;
            }
        }
        
        //similarly agar columns mein obstacles mile to uske aage ke cellas ko 0 kar dena hai
        flag = false;
        for(int i = 0 ; i < m ; i++){
            if(flag || obstacleGrid[i][0]==1)
            {
                flag = true;
                ar[i][0]=0;
            }else{
                ar[i][0]=1;
            }
        }
        
        // similar to unique path 1 problem
        
        for(int i = 1 ; i < m ; i ++){
            for(int j =1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    ar[i][j]=0;
                }
                else
                    ar[i][j]=ar[i-1][j]+ar[i][j-1];
            }
        }
        return ar[m-1][n-1];
    }
}