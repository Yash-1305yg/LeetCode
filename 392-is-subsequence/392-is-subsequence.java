class Solution {
    public boolean isSubsequence(String s, String t) {
        //1st method using two pointers
        
        if(s.length()==0)
            return true;
        int start =0;
        int end=0;
        while(end < t.length())
        {
            if(t.charAt(end)==s.charAt(start))
            {
                start++;
                if(start==s.length())
                    return true;
            }
            end++;
        }
        return false;
        
    }
}