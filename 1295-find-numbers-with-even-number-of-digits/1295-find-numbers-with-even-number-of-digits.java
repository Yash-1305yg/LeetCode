class Solution {
    public int findNumbers(int[] nums) {
//         int  temp=0,count2=0;
        
//         for(int i=0;i<nums.length ; i++)
//         {
//             int count= 0 ;
//          while(nums[i]!=0)
//             {
             
//             nums[i]=nums[i]/10;
//             count++;
                

//             }
//             if(count%2==0)
//             {
//                 count2++;
//             }
        
//         }
//         return count2;
        
        ////////second method by converting number to string and then checking its length///////
        
        int count=0;
        for(int i: nums)
        {
            if(Integer.toString(i).length() % 2==0)
                count++;
        }
        return count;
        
        /////third method by using log/////
        
//         int count=0;
//         for(int i: nums)
//         {
//             if(i < 0)
//                 i = i*-1;
            
//             count=(int)(Math.log10(i))+1;
//         }
//         return count;
    }
}