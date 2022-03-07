class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        int w= (int)Math.sqrt(area);
        while(area%w!=0)
            w--;
        int l = area/w;
        res[0]=l;
        res[1]=w;
        return res;
    }
}