class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len=pushed.length;
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i: pushed)
        {
            stack.push(i);
            while(!stack.isEmpty() && j<len && stack.peek() ==  popped[j])
            {
                stack.pop();
                j++;
            }
        }
        return j==len;
    }
}