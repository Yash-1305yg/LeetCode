class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for(int i=0;i<image.length;i++)
         {
                 int s=0;
                 int e=image[i].length-1;
                 while(s<e)
                 {
                     int temp= image[i][s];
                     image[i][s]=image[i][e];
                     image[i][e]=temp;
                     s++;
                     e--;
                 }
         }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;
    }
}