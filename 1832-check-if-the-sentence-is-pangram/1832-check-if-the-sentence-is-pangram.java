class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] bool =new boolean[26];
        int n=sentence.length();
        for(int i = 0;i<n;i++)
        {
            bool[sentence.charAt(i) -'a'] = true;
        }
        int count=0;
        for(int i=0;i<bool.length;i++)
        {
            if(bool[i]==true)
                count++;
        }
        if(count==26)
            return true;
        return false;
    }
}