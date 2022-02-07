class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> ar = new ArrayList<>(candies.length);
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=max){
                max=candies[i];
            }
            
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extra >=max)
                ar.add(true);
            else
                ar.add(false);
        }
        return ar;
    }
}