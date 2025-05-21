345. Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"

Output: "AceCreIm"
Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
Example 2:

Input: s = "leetcode"
Output: "leotcede"

Code:
class Solution {
   
    public String reverseVowels(String s) {
       Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
       char[] arr = s.toCharArray();
       int left=0;
       int right=arr.length-1;
       while(left<right){
            while(left<right && !vowels.contains(arr[left])){
                left++;
            }
            while(left<right && !vowels.contains(arr[right])){
                right--;
            }

            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
       }

       return new String(arr);
    }
}