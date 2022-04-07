class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int count=stones.length-1;
        int n = stones.length;
        while(count!=0)
        {
            if(stones[n-1] == stones[n-2])
            {
                stones[n-1]=0;
                stones[n-2]=0;
            }
            if(stones[n-1]!=stones[n-2])
            {
                stones[n-1]=stones[n-1]-stones[n-2];
                stones[n-2]=0;
            }
            Arrays.sort(stones);
            count--;
        }
        // for(int j:stones)
        // {
        //     if(j!=0)
        //         return j;
        // }
        return stones[n-1];
    }
}