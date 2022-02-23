class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start=0;
        int en=arr.length-1;
        while (start <= en) 
        {
            int mi = (start + en) / 2;
            if (target < arr[mi]) 
            {
                en = mi - 1;
            } 
            else 
            {
                start = mi + 1;
            }
        }
            return arr[start%arr.length];//same code as binary search just remove the mid equlas consition ans return start % length for the wrap around part
        
    }
}