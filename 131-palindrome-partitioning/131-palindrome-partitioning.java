class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        func(0, ans, new ArrayList<String>(),s);
        return ans;
    }
    
    public void func(int ind  ,List<List<String>> ans , List<String> ds , String s)
    {
        if( ind>= s.length())
        {
            ans.add(new ArrayList<String>(ds));
            return;
        }
        for(int i =ind ; i<s.length() ; i++)
        {
            if(pallindrome(s,ind,i))
            {
                ds.add(s.substring(ind,i+1));
                func(i+1,ans,ds,s);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    public boolean pallindrome(String s , int start , int end)
    {
        while(start<end)
        {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}