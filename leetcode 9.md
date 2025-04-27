Question:
Check whethera number is a palindrome or not

Code:
class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int z = 0;
        while(y>0){
            int d = y%10;
            z=z*10+d;
            y/=10;
        }

        return x==z;
    }
}
