Product array puzzle
Difficulty: EasyAccuracy: 33.46%Submissions: 285K+Points: 2Average Time: 20m
Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
Note: Each element is res[] lies inside the 32-bit integer range.

Examples:

Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.

Code:
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] left = new int[n];
        int prod1 = 1;
        for(int i=0 ;i<n ;i++){
            prod1=prod1*arr[i];
            left[i]=prod1;
        }
        
        int[] right = new int[n];
        int prod2 = 1;
        for(int j=n-1 ;j>=0 ;j--){
            prod2=prod2*arr[j];
            right[j]=prod2;
        }
        
        int a = 0;
        int b = 2;
        arr[0]=right[1];
        for(int k=1 ;k<n-1;k++){
            arr[k]=left[a]*right[b];
            a++;
            b++;
        }
        arr[n-1]=left[n-2];
        
        return arr;
    }
}