1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Code:
class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder ans = new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length()&& j<word2.length()){
            ans.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }

        while(i<word1.length()){
            ans.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            ans.append(word2.charAt(j));
            j++;
        }

        return ans.toString();
    }
}