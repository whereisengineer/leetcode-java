//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        return findPeak(arr, 0, arr.length-1);
        
    }
    
    public int findPeak(int[] arr, int left, int right){
        
        int mid = left + (right - left)/2;
        
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
            return mid;
        else if(arr[mid] > arr[mid -1] && arr[mid] < arr[mid+1])
            return findPeak(arr, mid, right);
        else
            return findPeak(arr, left, mid);
        
    }
}
