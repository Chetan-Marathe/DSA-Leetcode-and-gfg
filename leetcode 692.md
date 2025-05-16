692. Top K Frequent Words
Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.

Code:

class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            String element = nums[i];
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) -> {
            if (!(a.getValue().equals(b.getValue()))) {
                return b.getValue() - a.getValue(); 
            } else {
                return a.getKey().compareTo(b.getKey()); 
            }
        });

        ArrayList<String> ans = new ArrayList<>();
        for(int j=0 ; j<k ; j++){
            ans.add(entryList.get(j).getKey());
        }

        return ans;
    }
}