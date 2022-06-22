//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int left =0, right = letters.length-1;
        
        while(left <= right){
            
            int mid = left + (right - left)/2;
            
            if(letters[mid] == target){
                while(mid < letters.length && letters[mid] == target){
                    mid++;
                }
                mid--;
                if(mid+1 < letters.length)
                    return letters[mid+1];
                else
                    return letters[0];
            }
            else if(letters[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            
            
        }
        
        if(left < letters.length)
            return letters[left];
        else
            return letters[0];
        
    }
}
