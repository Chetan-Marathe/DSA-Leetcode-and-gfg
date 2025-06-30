1903. Largest Odd Number in String
You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
A substring is a contiguous sequence of characters within a string.

Example 1:
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.


Code:
class Solution {
    public String largestOddNumber(String num) {
        String ans ="";
        for(int j=num.length()-1;j>=0;j--){
            int a = num.charAt(j)-'0';
            if(a%2!=0){
                ans=num.substring(0,j+1);
                break;
            }
        }
        return ans;
    }
}