class Solution {
    public int mostWordsFound(String[] sen) {
        int max=0;
        for(int i=0;i<sen.length;i++){
            max = Math.max(max , (sen[i].split(" ")).length);
        }
        return max;
    }
    
}