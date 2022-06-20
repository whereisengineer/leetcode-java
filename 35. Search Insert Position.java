//https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(target < nums[0])
            return 0;
        else if(target > nums[nums.length-1]){
            return nums.length;
        }
        else{
            return findIndex(nums, target, 0, nums.length-1);
        }
        
    }
    
    public int findIndex(int[] nums, int target, int left, int right){
        
        int mid = left + (right-left)/2;
        
        if(nums[mid] == target) 
            return mid;
        else if(target < nums[mid] && target > nums[mid-1])
            return mid;
        else if(target < nums[mid])
            return findIndex(nums, target, left, mid-1);
        else
            return findIndex(nums, target, mid+1, right);
    
    }
}
