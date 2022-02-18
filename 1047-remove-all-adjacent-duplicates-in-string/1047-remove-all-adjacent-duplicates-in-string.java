class Solution {
    public String removeDuplicates(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<len ;i++)
        {
            while(i<len&& !stack.isEmpty() && stack.peek()==s.charAt(i) )
            {
                stack.pop();
                i++;
            }
            if(i<len)
                stack.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}