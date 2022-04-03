class Solution {
    public boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        if(num==1) return true;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid*mid==num )
                return true;
             if(mid > num / mid)//to prevent overflow
            {
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return false;
    }
}