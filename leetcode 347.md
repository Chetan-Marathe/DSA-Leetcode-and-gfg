347. Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique el]

Code:

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b) -> b.getValue()-a.getValue());

        int[] ans = new int[k];
        for(int j=0 ; j<k ; j++){
            ans[j]=entryList.get(j).getKey();
        }

        return ans;
    }
}