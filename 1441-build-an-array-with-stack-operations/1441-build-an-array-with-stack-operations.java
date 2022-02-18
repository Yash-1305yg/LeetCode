class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int j=0;
        for(int i =1 ;i <= n && j<target.length;i++)
        {
            res.add("Push");
            if(target[j]==i)
            {
                j++;
            }
            else
            {
                res.add("Pop");
            }
        }
        return res;
    }
}