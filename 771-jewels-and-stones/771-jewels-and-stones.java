class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] c1 = stones.toCharArray();
        char[] c2 = jewels.toCharArray();
        int count =0;
        for(int i=0 ; i< c2.length ; i++)
        {
            for(int j=0 ; j<c1.length ; j++)
            {
                if(c1[j] == c2[i])
                {
                    count++;
                }
            }
        }
        return count;
    
    }
}