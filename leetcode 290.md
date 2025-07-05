Question:
290. Word Pattern
Solved
Easy
Topics
premium lock icon
Companies
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.

class Solution {
    public boolean wordPattern(String pattern, String s) {
      String[] arr = s.split("\\s+");
      if(pattern.length() != arr.length){
        return false;
      }


      HashSet<String> set = new HashSet<>();
      HashMap<Character,String> map = new HashMap<>();
      for(int i=0 ;i<pattern.length();i++){
        char c = pattern.charAt(i);
        if(map.containsKey(c) && !(map.get(c)).equals(arr[i]) ){
            return false;
        }else{
            if(!map.containsKey(c) && set.contains(arr[i])){
                return false;
            }else{
            map.put(pattern.charAt(i),arr[i]);
            set.add(arr[i]);
            }
        }
      }

      return true;
      
    }
}