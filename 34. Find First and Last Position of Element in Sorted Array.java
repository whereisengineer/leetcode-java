//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = new int[]{-1,-1};
        
        //left binary search
        
        int left =0, right = nums.length-1;
        
        while(left <= right){
            
            int mid = left + (right-left)/2;
            
            if(nums[mid] == target){
                
                if(mid-1 >=0 && nums[mid] == nums[mid-1]){
                    right = mid-1;
                }
                else{
                    result[0] = mid;
                    break;
                }
                
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
        
        //right binary search
        
        left =0; right = nums.length - 1;
        
        while(left <= right){
            
            int mid = left + (right-left)/2;
            
            if(nums[mid] == target){
                
                if(mid+1 <= nums.length-1 && nums[mid+1] == target){
                    left = mid + 1;
                }
                else{
                    result[1] = mid;
                    break;
                }
            }
            else if(nums[mid] > target){

                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            
        }
        
        return result;
    }
}
