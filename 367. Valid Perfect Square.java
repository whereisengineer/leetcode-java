//https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num == 1)
            return true;
        
        long left = 1;
        long right = num/2;
        
        return findPerfectSquare(left, right, num);
    }
    
    public boolean  findPerfectSquare(long left, long right, int num){
        
        long mid = left + (right - left)/2;
        
      
        if(left > right) return false;
        
        if(mid * mid == num){
            return true;
        }
        else if(mid*mid > num){
            return findPerfectSquare(left, mid-1, num);
        }
        else{
            return findPerfectSquare(mid+1, right, num);
        }
        
        
        
    }
}
