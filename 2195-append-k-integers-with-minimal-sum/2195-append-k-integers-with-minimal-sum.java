class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        long a = 1;
        
        for (int num : nums) {
            if (num > a) {
                long l = Math.min(num - 1, a + k - 1);
                long n = l - a + 1;
                // AP formula for sum => n (a + l) / 2
                sum += n * (a + l) / 2;
                k -= n;
				
				if (k == 0) {
                    break;
                }
            }
            a = num + 1;
        }
        
        if (k > 0) {
            // AP formula for sum => n (2 * a + (n - 1) * d) / 2, here d is 1 and n is k
            sum += k * ((a << 1) + k - 1) / 2;  
        }
        
        return sum;
    }
}