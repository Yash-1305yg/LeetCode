class Solution {
    public int mySqrt(int x) {
        int count = 0 ;
      for(int i = 1 ; i<=x ; i=i+2)
      {
          if( x>=i)
          {
              x=x-i;
              count++;
          }
          
      }
        return count;
    }
}