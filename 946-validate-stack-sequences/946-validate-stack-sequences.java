class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len=pushed.length;
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int i: pushed)
        {
            stack.push(i);
            while(!stack.isEmpty() && j<len && stack.peek() ==  popped[j]) // j<N is there to check whether the length of both the arrays is same or not if it is guaranteed than it is not necessary but it is good for safe practice
            {
                stack.pop();
                j++;
            }
        }
        return j==len;
    }
}