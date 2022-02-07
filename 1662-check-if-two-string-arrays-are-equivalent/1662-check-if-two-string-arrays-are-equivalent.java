class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         String str= String.join("",word1);
        String str1 = String.join("",word2);
        // int count=0;
        if(str.equals(str1))
            {
                return true;
            }
        return false;
    }
}