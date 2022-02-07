class Solution {
    public int maximumWealth(int[][] a) {
       int m = a.length;
       int n = a[0].length;
       int max=a[0][0];
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum=sum+a[i][j];
            }
            if(sum>=max){
                    max=sum;
                }
            
                    sum=0;
        }
        return max;
    }
}