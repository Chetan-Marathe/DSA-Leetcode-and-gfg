Question:-
Given an array arr, find the average or mean of the prefix array at every index.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: [10, 15, 20, 25, 30] 
Explanation: 10 / 1 = 10, (10 + 20) / 2 = 15, (10 + 20 + 30) / 3 = 20 and so on.
Input: arr[] = [12, 2]
Output: [12, 7] 
Constraints:
1 ≤ arr.size ≤ 105
1 ≤ arr[i] ≤ 106

Ans:-

class Solution {
    // Prints average of a stream of numbers
    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
       ArrayList<Integer> list = new ArrayList<>();
       int sum = 0;
       
       for(int i=0 ; i<arr.size(); i++){
           sum+=arr.get(i);
           list.add(sum/(i+1));
       }
      
        return list;
    }
}