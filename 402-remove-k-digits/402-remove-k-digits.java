class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k==n)
            return "0";
        
        Stack<Character> s = new Stack<>();
        
        for(int i= 0 ;i< num.length() ;i++)
        {
            while(k>0 && !s.isEmpty() && s.peek() > num.charAt(i))
            {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        
        while(k>0)
        {
            s.pop();
            k--;
        }
        
        StringBuilder sb  = new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        while(sb.length() >1 && sb.charAt(sb.length()-1)== '0')
        {
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.reverse().toString();
    }
}