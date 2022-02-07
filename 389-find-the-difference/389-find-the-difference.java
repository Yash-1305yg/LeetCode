class Solution {
    public char findTheDifference(String s, String t) {
        int difs = 0;
        int dift = 0;
        for(int i=0 ; i< s.length() ; i++)
        {
            difs = difs + (int)s.charAt(i);
        }
        for(int i=0 ; i < t.length() ; i++)
        {
            dift = dift + (int) t.charAt(i);
        }
        return (char)(dift - difs);
    }
}