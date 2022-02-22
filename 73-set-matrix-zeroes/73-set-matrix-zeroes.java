class Solution {
    public void setZeroes(int[][] matrix) {
//         //// 1st method ///
//         Set<Integer> row = new HashSet<>();
//         Set<Integer> col = new HashSet<>();
        
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]==0)
//                 {
//                     row.add(i);
//                     col.add(j);
//                 }
//             }
//         }
        
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0 ;j<matrix[0].length;j++)
//             {
//                 if(row.contains(i) ||col.contains(j))
//                 {
//                     matrix[i][j]=0;
//                 }
//             }
//         }
        
        /// 2nd method without using extra space////
         Boolean bool = false;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
                bool =true; // first col 0 hai  isliye or row or col ke lie alag variable chahiye
            for(int j=1;j<matrix[0].length;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        if(matrix[0][0]==0)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[0][i]=0;
            }
        }
        if(bool)
        {
            for(int i=0 ; i<matrix.length;i++)
            {
                matrix[i][0]=0;
            }
        }
        
    }
}