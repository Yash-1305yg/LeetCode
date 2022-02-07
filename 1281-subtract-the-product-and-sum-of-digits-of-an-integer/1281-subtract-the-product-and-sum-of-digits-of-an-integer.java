class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0){
            int m = n%10;
            sum=sum+m;
            pro=pro*m;
            n=n/10;
        }
        
        return pro-sum;
    }
}