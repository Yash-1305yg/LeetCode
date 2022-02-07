class Solution {
    public int reverse(int x) {
        
        long a,b=0;
        
        while(x!=0)
        {
            a = x %10;
            b = (b*10)+a;
            x = x/10;           
            
        }
        if(b<=-2147483648 || b>=2147483647)
        {
            return 0;
        }
        return(int)b;
        
    }
}