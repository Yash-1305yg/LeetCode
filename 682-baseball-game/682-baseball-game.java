class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for(String str : ops)
        {
            if(str.equals("C"))
            {
                stack.pop();
            }
            else if(str.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else if(str.equals("+"))
            {
                int temp = stack.pop();
                int sum= stack.peek()+temp;
                stack.push(temp);
                stack.push(sum);
            }
            else
            {
                stack.push(Integer.valueOf(str));
            }
        }
        int res =0;
        while(!stack.isEmpty())
        {
            res = res+ stack.pop();
        }
        return res;
    }
}