class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[heights.length];
        
        for(int j = 0 ;j<heights.length;j++)
        {
            arr[j]=heights[j];
        }
        Arrays.sort(heights);
    
        // for(int i = 1 ; i < arr.length ; i++)
        // {
        //    int temp = heights[i];
        //    int  j = i-1;
        //    while(j >=0 && heights[j] > temp )
        //    {
        //        heights[j+1] = heights[j];
        //        j=j-1;
        //    }
        //    heights[j+1]=temp;
        // }

        int ind=0;
        
        for(int i = 0 ;i<heights.length;i++)
        {
            if(heights[i]!=arr[i])
            {
                ind++;
            }
        }
        return ind;
    }
}