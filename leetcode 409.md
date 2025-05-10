409. Longest Palindrome
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

Code:

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        int ans = 0;
        boolean hasOdd = false;

        for (int val : map.values()) {
            if (val % 2 == 0) {
                ans += val;
            } else {
                ans += val - 1;  
                hasOdd = true;
            }
        }

        if (hasOdd) {
            ans += 1; 
        }

        return ans;
    }
}
