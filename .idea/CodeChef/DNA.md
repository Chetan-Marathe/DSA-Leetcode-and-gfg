DNA Storage
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string 
S
S of length 
N
N (
N
N is even), find the encoded sequence.

Input Format
First line will contain 
T
T, number of test cases. Then the test cases follow.
Each test case contains two lines of input.
First line contains a single integer 
N
N, the length of the sequence.
Second line contains binary string 
S
S of length 
N
N.
Output Format
For each test case, output in a single line the encoded sequence.

Note: Output is case-sensitive.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
N
≤
10
3
2≤N≤10 
3
 
N
N is even.
Sum of 
N
N over all test cases is at most 
10
3
10 
3
 .
S
S contains only characters 0 and 1.

Code:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int tn = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int i=0;
            int j=2;
            while(i<=tn-2){
                String sub = str.substring(i,j);
                if(sub.equals("00")){
                    sb.append("A");
                }else if(sub.equals("01")){
                    sb.append("T");
                }else if(sub.equals("10")){
                    sb.append("C");
                }else{
                    sb.append("G");
                }
                i+=2;
                j+=2;
            }
            System.out.println(sb.toString());
        }
    }
}
hello my name is chetan i like to draw

