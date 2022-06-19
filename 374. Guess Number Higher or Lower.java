//https://leetcode.com/problems/guess-number-higher-or-lower/

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        return findNumber(n, 0, n);
        
    }
    
    public int findNumber(int n, int left, int right){
        
        
        int mid = left + (right - left)/2;
        
        int result = guess(mid);
        
        if(result == -1){
            return findNumber(n, left, mid-1);
        }
        else if(result == 1){
            return findNumber(n, mid+1, right);
        }
        else{
            return mid;
        }
    }
}
