class Solution {
    public boolean isAnagram(String s, String t) {
        
        ////////////// METHOD 1//////////////
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s1.length != s2.length)
            return false;
        for(int i =0; i< s1.length;i++)
        {
            if(s1[i] != s2[i])
            {
                return false;
            }
        }
        return true;
        
        
        ///////////// METHOD 2///////////
//         HashMap<Character, Integer> map = new HashMap<>();
//         int n = s.length();
//         int m = t.length();
        
//         if(s.length() != t.length())
//             return false;
        
//         for(int i =0;i< n;i++)
//         {
//             map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) ,0) +1);
//         }
//         for(int i =0;i< m;i++)
//         {
//             map.put(t.charAt(i) , map.getOrDefault(t.charAt(i) ,0) -1);
//         }
        
//         for(int i=0 ; i< n ;i++)
//         {
//             if(map.get(s.charAt(i)) !=0)
//                 return false;
//         }
//         return true;
    }
}