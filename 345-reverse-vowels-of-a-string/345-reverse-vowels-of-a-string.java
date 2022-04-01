class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o','u','A','E','I','O','U'));
        int i = 0;
        int j= c.length-1;
        while(i<j){
            if(set.contains(c[i]) && set.contains(c[j]))
            {
                char temp = c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }
            else if(!set.contains(c[i]) && set.contains(c[j]))
            {
                i++;
            }
            else
                j--;
            
        }
        return new String(c);                       
    }
}