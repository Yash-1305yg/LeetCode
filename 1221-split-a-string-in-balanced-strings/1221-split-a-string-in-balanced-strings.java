class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int count=0;
        char[] c = s.toCharArray();
        for(int i=0 ; i < c.length ; i++)
        {
            if(c[i] == 'R')
                res++;
            else{
                res--;
                
            }
            if(res == 0)
                    count++;
                
        }
        return count;
        
    }
}