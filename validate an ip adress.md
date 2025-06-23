validate an ipn adress;
Validate an IP Address
Difficulty: MediumAccuracy: 11.22%Submissions: 292K+Points: 4Average Time: 20m
You are given a string s in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., "172.16.254.1"

A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255)

Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

Code:

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        String[] sparts = s.split("\\.");
        if(sparts.length!=4) return false;
        for(int i=0 ;i<4 ;i++){
            String curr = sparts[i];
             if(curr.length()==0 || curr.length()>4){
                return false;
            }
            
            if(curr.length()>1 && curr.charAt(0)=='0'){
                return false;
            }
            
            
            int num = Integer.parseInt(curr);
            if(num<0 || num>255){
                return false;
            }
            
        }
        
        return true;
    }
}