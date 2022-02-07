class Solution {
    public void duplicateZeros(int[] arr) {
        int index=0;
        
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i]==0)
            {
                index = i;
                for (int j = arr.length-1 ; j > index; j--)
                {
                    arr[j ] = arr[j-1];
                }
                //to avoid duplicating new 0 that we just duplicated
                i=i+1;
            }
        }
    }
}