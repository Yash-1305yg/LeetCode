class Solution {
    public int titleToNumber(String col) {
      
        char[] arr=col.toCharArray();
        int sum=0;
        for(char c: arr)
        {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}