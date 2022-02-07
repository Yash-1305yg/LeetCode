class Solution {
    public int[] decompressRLElist(int[] nums) {
        int k=0;
        int length=0;
        
        for(int i=0 ; i<nums.length ;i+=2){
            length = length + nums[i];
        }
        int[] arr= new int[length];
        for(int i=0 ;i<nums.length/2;i++)
        {   
            int freq=nums[2*i];
            int val=nums[2*i +1];
            
            while(freq>0 ){
                arr[k]=val;
                k++;
                freq--;
            }
        }
        return arr;
    }
}