class Solution {
    public int[] countBits(int n) {
        //solution using DP
        int[] arr =new int[n+1];
        for(int i=0 ;i<=n;i++)
        {
            arr[i] = result(i , arr);
        }
        return arr;
    }
    public int result(int n,int[] arr)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(arr[n]!=0)
        {
            return arr[n];
        }
        if(n%2==0)
        {
            arr[n]= result(n/2,arr);
            return result(n/2,arr);
        }
        else{
            arr[n]=1+result(n/2,arr);
            return 1+result(n/2,arr);
        }
    }
}