class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        if(s1.length()  > s2.length())
        {
            return false;
        }
        
        for(int i = 0 ; i<s1.length();i++)
        {
            arr1[s1.charAt(i) - 'a']++;
        }
        for(int j=0 ; j<=s2.length()-s1.length();j++)
        {
            int[] arr2 = new int[26];
            for(int k =0;k<s1.length();k++)
            {
                arr2[s2.charAt(j+k) -'a']++;
            }
            if(matches(arr1,arr2))
                return true;
        }
        return false;
    }
    public boolean matches(int[] arr1,int[] arr2)
    {
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
                return false;
            
        }
        return true;
    }
}