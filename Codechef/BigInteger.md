Add One
You are given a large number 
N
N. You need to print the number 
N
+
1
N+1.

Note: The number is very large and it will not fit in standard integer data type. You have to take the input as String and then manipulate the digits to convert it to 
N
+
1
N+1.

Input Format
The first line of the input contains a single integer 
T
T - the number of test cases. The description of 
T
T test cases follows.

The first line of each test case contains a single integer 
N
N.

Output Format
For each test case, print a single line containing one integer - the number 
N
+
1
N+1.
Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
N
≤
10
200000
−
1
1≤N≤10 
200000
 −1
the sum of the number of digits of all 
N
N in a single test file does not exceed 
4
⋅
10
5
4⋅10 
5

Code:
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t-- > 0){
		    String str = sc.nextLine();
		    BigInteger a = new BigInteger(str);
		    BigInteger result = a.add(BigInteger.valueOf(1));
		    System.out.println(result);
		}

	}
}
