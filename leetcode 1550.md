1550. Three Consecutive Odds
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 
Example 1:
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.

Code:
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int val : arr){
            if(val%2!=0){
                count++;
            }else{
                count=0;
            }

            if(count==3){
                break;
            }
        }

        return count==3;
    }
}