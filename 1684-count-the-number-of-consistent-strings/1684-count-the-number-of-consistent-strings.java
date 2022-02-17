class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
//         HashMap<Character , Integer> map = new HashMap<>();
//         char[] ch = allowed.toCharArray();
//         for(char i: ch)
//         {
//             map.put(i , map.getOrDefault(i , 0)+1);
//         }
//         int count2=0;
        
//         for(int i=0;i< words.length;i++)
//         {
//             int count=0;
//             char[] ch1 = words[i].toCharArray();
//             for(char j: ch1)
//             {
//                 if(map.containsKey(j))
//                     count++;
                
//             }
//             if(count == ch1.length)
//                 count2++;
//         }
//         return count2;
        
        
        ///////Faster Approach/////
        HashMap<Character , Integer> map = new HashMap<>();
        int count=0;
        
        for(int i = 0 ; i < allowed.length();i++)
        {
            map.put(allowed.charAt(i),0);
        }
        for(int i=0;i<words.length;i++)
        {
            boolean flag =true;
            for(int j=0;j<words[i].length();j++)
            {
                if(!map.containsKey(words[i].charAt(j)))
                {flag=false;
                 break;}
                
            }
            if(flag)
                count++;
                
        }
        return count;
    }
}