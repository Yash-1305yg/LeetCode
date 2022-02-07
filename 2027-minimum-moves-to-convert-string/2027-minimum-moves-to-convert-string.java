class Solution {
    public int minimumMoves(String s) {
        int r = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'X') {
                r++;
                i += 2;
            }
        return r;
    }
}