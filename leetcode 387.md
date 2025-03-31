Question: 
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.

Ans:-

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i=0 ; i<ch.length ; i++){
            char element = ch[i];

            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                map.put(element,1);
            }
        }

        for(int j=0 ; j<ch.length ;j++){
            if(map.get(ch[j])==1){
                return j;
            }
        }



        return -1;
    }
}