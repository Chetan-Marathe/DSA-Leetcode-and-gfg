171. Excel Sheet Column Number
Solved
Easy
Topics
premium lock icon
Companies
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
 

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].


Solution:

class Solution {
    public int titleToNumber(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',1); 
        map.put('B',2);
         map.put('C',3); 
         map.put('D',4); 
         map.put('E',5);
          map.put('F',6);
           map.put('G',7);
            map.put('H',8);
             map.put('I',9);
              map.put('J',10);
               map.put('K',11); 
               map.put('L',12); 
               map.put('M',13); 
               map.put('N',14); 
               map.put('O',15);
                map.put('P',16);
                 map.put('Q',17);
                  map.put('R',18); 
                  map.put('S',19);
                   map.put('T',20);
                    map.put('U',21);
                     map.put('V',22);
                      map.put('W',23); 
                      map.put('X',24);
                       map.put('Y',25);
                        map.put('Z',26);
        if(str.length()==1){
            return map.get(str.charAt(0));
        }
        int ans = 0;
        int j = str.length()-1;
        for(int i=0;i<str.length();i++){
           int val1 = (int) Math.pow(26,j);
           j--;
           int val2 = val1*map.get(str.charAt(i));
           ans+=val2;
            
        }
        return ans ;

    }
}