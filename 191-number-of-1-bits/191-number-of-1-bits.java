public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//         String s = "";
//         s =s+n;
//         int i=0;
        int count=0;
//         while(i<=s.length()-1)
//         {
//             if(s.charAt(i)=='1')
//             {
//                 count++;
//             }
//             i++;
//         }
//         return count;
        
        int mask=1;
        for(int i=0 ; i<=31 ; i++)
        {
            if((n & mask) !=0)
                count++;
            mask<<=1;
        }
        return count;
    }
}