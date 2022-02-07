class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        // int count =0;
        // for(int i =0; i <time.length-1 ; i++)
        // {
        //     for(int j=i+1 ; j< time.length ; j++)
        //     {
        //         if((time[i]+time[j]) % 60 ==0)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
          
        int c[]  = new int[60], res = 0;
        for (int t : time) {
            res += c[(600 - t) % 60];
            c[t % 60] += 1;
        }
        return res;
    
    }
}