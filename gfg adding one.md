Question:- 
Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

Examples:

Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679
Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 9
There are no leading zeros in the input number. 

Answer:-
class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();
        int i= arr.length-1;
        int carry = 1;
        while(i>=0 || carry>0){
            if(i>=0){
                carry+=arr[i];
                i--;
            }
            result.add(carry%10);
            carry/=10;
        }
        Collections.reverse(result);
        return result;
    }
}