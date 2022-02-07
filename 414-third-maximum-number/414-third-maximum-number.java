class Solution {
    public int thirdMax(int[] nums) {
        Integer fmax=null;
        Integer smax=null;Integer tmax=null;
        
        for(Integer num :nums)
        {
            if(num.equals(fmax) ||num.equals(smax)||num.equals(tmax) )
            {
                continue;
            }
            if(fmax==null || num>fmax){
                tmax=smax;
                smax=fmax;
                fmax=num;
            }else if(smax==null || num>smax){
                tmax=smax;
                smax=num;
            }else if(tmax==null || num>tmax){
                tmax=num;
            }
        }
        if(tmax==null)
        {
            return fmax;
        }
        
        return tmax;
        
    }
}