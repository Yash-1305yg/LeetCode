class Solution {
    public int addDigits(int num) {
        int sum =0;
        
        if(num ==0)
            return 0;
        
        if(num%9==0)
            return 9;
        
        else{
            return num%9;
        }
        // while(num >0)
        // {
        //     int temp = num;
        //     temp = temp%10;
        //     sum =sum+temp;
        //     num=num/10;
        // }
        // if(sum >9)
        // {
        //     return addDigits(sum);
        // }
        // return sum;
    }
}