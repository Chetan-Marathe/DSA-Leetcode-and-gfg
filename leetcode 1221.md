1221. Split a String in Balanced Strings
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Code:
class Solution {
    public int balancedStringSplit(String s) {
        int var = 0;
        int ans = 0;
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i)=='L'){
                var++;
            }else{
                var--;
            }

            if(var==0){
                ans++;
            }
        }
        return ans;
    }
}