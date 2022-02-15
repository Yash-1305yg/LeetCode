class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map = new HashMap<>();
        int n = magazine.length();
        int m= ransomNote.length();
        for(int i= 0;i< m ;i++)
        {
            map.put(ransomNote.charAt(i) , map.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        
        for(int i=0 ; i< n ;i++)
        {
            map.put(magazine.charAt(i) , map.getOrDefault(magazine.charAt(i),0)-1);
        }
        
        for(int i=0 ; i< m ;i++)
        {
            if(map.get(ransomNote.charAt(i))>0)
            {
                return false;
            }
        }
        return true;
    }
}