class Solution {
    public int search(int[] nums, int target) {
        
        return findIndex(nums, 0, nums.length-1, target);
        
        
    }
    
    public int findIndex(int[] nums, int left, int right, int target){
        
        int mid = (left + right)/2;
        
        if(left > right){
            return -1;
        }
        
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return findIndex(nums, mid+1, right, target);
        }
        else{
            return findIndex(nums, left, mid-1, target);
        }
        
    }
}
