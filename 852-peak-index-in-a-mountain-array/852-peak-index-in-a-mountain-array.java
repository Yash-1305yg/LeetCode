class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int lo= 0 , hi = arr.length -1, mid=0;
        while(lo <=hi){mid= (lo + hi)/2;if(arr[mid+1] < arr[mid] && arr[mid-1] < arr[mid]){return mid;}if(arr[mid+1] > arr[mid]){lo=mid+1;}else{hi=mid-1;}}return lo;}}