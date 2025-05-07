884. Uncommon Words from Two Sentences

A sentence is a string of single-space separated words where each word consists only of lowercase letters.
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:
Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Explanation:
The word "sweet" appears only in s1, while the word "sour" appears only in s2

Code:
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split("\\s");
        String[] arr2 = s2.split("\\s");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String word : arr1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        for (String word : arr2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }

        return list.toArray(new String[0]);
    }
}