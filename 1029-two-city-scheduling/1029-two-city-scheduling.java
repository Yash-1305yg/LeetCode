class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum=0;
        int min=0;
        int[] arr = new  int[costs.length];
        for(int i=0;i<costs.length;i++)
        {
            sum=sum+costs[i][0];
            arr[i]=costs[i][1] - costs[i][0];
        }
        
        Arrays.sort(arr);
        for(int i=0 ; i<costs.length/2 ; i++)
        {
            sum=sum+arr[i];
        }
        
        return sum;
    }
}