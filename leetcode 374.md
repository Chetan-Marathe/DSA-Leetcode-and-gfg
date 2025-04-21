Question:
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

Code:

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start+(end-start)/2;
            int ans = guess(mid);
            if(ans==0){
                return mid;
            }else if(ans == -1){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return -1;
    }
}