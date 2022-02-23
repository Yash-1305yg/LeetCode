class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length , n=matrix[0].length;
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>(); 
        for(int i=0;i< m;i++)
        {
            int min1=Integer.MAX_VALUE;
            for(int j=0 ; j< matrix[i].length;j++)
            {
                if(matrix[i][j]< min1)
                {
                    min1 = matrix[i][j];
                }  
                
            }
            min.add(min1);
        }
        
        for(int j=0;j< n;j++)
        {
            int max1= Integer.MIN_VALUE;
            for(int i=0;i<m;i++)
            {
                if(matrix[i][j]>max1)
                {
                    max1 = matrix[i][j];
                }
                
            }
            max.add(max1);
        }
        List<Integer> res = new ArrayList<>();
        for(int i: min)
        {
            for(int j:max)
            {
                if(i==j)
                    res.add(i);
            }
        }
        return res;
    }
}