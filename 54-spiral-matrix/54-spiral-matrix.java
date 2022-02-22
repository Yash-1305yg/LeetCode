class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length==0){
            return list;
        }
        int rowstart=0;
        int rowend=matrix.length-1;
        int colstart=0;
        int colend=matrix[0].length-1;
        
        
        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart ;i<=colend;i++)
            {
                list.add(matrix[rowstart][i]);
            }
            rowstart++;
            
            for(int i=rowstart ;i<=rowend;i++)
            {
                list.add(matrix[i][colend]);
            }
            colend--;
            
            if(rowstart<=rowend)
            {
                for(int i=colend ; i>=colstart;i--)
                {
                    list.add(matrix[rowend][i]);
                }
            }
            rowend--;
            if(colstart<=colend)
            {
                for(int i=rowend ; i>=rowstart;i--)
                {
                    list.add(matrix[i][colstart]);
                }
            }
            colstart++;
        }
        return list;
    }
}