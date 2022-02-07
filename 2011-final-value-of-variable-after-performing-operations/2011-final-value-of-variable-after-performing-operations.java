class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int j = 0;
    	for(int i=0;i<operations.length;i++) {
    		if(operations[i].charAt(1)=='+') j++;
    		else j--;
    	}
    	return j;  
    }
}