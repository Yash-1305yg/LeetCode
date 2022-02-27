class Solution {
    public int minSteps(String s, String t) {
//         HashMap<Character,Integer> map1 = new HashMap<>();
//         HashMap<Character ,Integer> map2 = new HashMap<>();
//         int sum=0 ,count1=0,count2=0;
//         for(int i =0;i<s.length();i++)
//         {
//             map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i) ,0)+1);
//         }
//         for(int i =0;i<t.length();i++)
//         {
//             map2.put(t.charAt(i) , map2.getOrDefault(t.charAt(i) ,0)+1);
//         }
        
//         for(int i=0 ; i<t.length();i++)
//         {
//             if( map1.getOrDefault(t.charAt(i),0) ==0)
//                 count1++;
//         }
//         for(int i=0 ; i<s.length();i++)
//         {
//             if( map2.getOrDefault(s.charAt(i),0) ==0)
//                 count2++;
//         }
//         sum=count1+count2;
//         return sum;
        
        int[] arr = new int[26];
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        for(char c:ss)
        {
            arr[c-'a'] = arr[c-'a']+1;
        }
        
        for(char c:tt)
        {
            arr[c - 'a'] = arr[c-'a']-1;
        }
        int ans=0;
        
        for(int i:arr)
        {
            ans=ans+Math.abs(i);
        }
        return ans;
        
        
    }
}