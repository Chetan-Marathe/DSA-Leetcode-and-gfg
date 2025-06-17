Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.

Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].

Examples:

Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and smallest positive missing number is 1.
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and smallest positive missing number is 2.

Code:
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int nums[]) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : nums){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0 ; j<nums.length ;j++){
           if(map.get(nums[j])==2){
               list.add(nums[j]);
               break;
           }
        }

        for(int i=1 ;i<=nums.length;i++){
            if(map.get(i)==null){
                list.add(i);
                break;
            }
        }
        
        
        
        return list;
        
    }
}
