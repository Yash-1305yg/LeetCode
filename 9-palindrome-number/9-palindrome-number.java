class Solution {
    public boolean isPalindrome(int x) {
        int a ;int b=0;int c=x;
        while(x!=0)
        {
            if(x>0)
            {
                a=x%10;
                b=(b*10)+a;
                x=x/10;
            }
            else
            {
                return false;
            }
        }
        if(b==c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}