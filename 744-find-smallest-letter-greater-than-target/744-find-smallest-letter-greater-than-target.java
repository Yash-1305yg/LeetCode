class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0;
        int en=arr.length-1;
        // int target=10;
        
        
            while (start <= en) {
                int mi = (start + en) / 2;
                // if(target>arr[en])
                //     return arr[0];
                // if (target == arr[mi]) {
                //     en = mi;
                //     break;
                 if (target < arr[mi]) {
                    en = mi - 1;
                } else {
                    start = mi + 1;
                }
            }
            return arr[start%arr.length];
        
    }
}