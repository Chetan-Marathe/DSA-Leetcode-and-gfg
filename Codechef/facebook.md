Facebook
A post on facebook is said to be more popular if the number of likes on the post is strictly greater than the number of likes on some other post. In case the number of likes is same, the post having more comments is more popular.

Given arrays 
A
A and 
B
B, each having size 
N
N, such that the number of likes and comments on the 
i
t
h
i 
th
  post are 
A
i
A 
i
​
  and 
B
i
B 
i
​
  respectively, find out which post is most popular.

It is guaranteed that the number of comments on all the posts is distinct.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains a single integer 
N
N, the number of posts.
The second line of each test case contains 
N
N space-separated integers 
A
1
,
A
2
,
…
,
A
N
A 
1
​
 ,A 
2
​
 ,…,A 
N
​
  — where 
A
i
A 
i
​
  is the number of likes on the 
i
t
h
i 
th
  post.
The third line of each test case contains 
N
N space-separated integers 
B
1
,
B
2
,
…
,
B
N
B 
1
​
 ,B 
2
​
 ,…,B 
N
​
  — where 
B
i
B 
i
​
  is the number of comments on the 
i
t
h
i 
th
  post.
Output Format
For each test case, output on a new line, an integer in the range 
1
1 to 
N
N, denoting the index of the post which is most popular among the 
N
N posts.

Constraints
1
≤
T
≤
1000
1≤T≤1000
1
≤
N
≤
10
5
1≤N≤10 
5
 
1
≤
A
i
,
B
i
≤
2
⋅
10
5
1≤A 
i
​
 ,B 
i
​
 ≤2⋅10 
5
 
The elements of array 
B
B are distinct.
It is guaranteed that the sum of 
N
N over all test case does not exceed 
2
⋅
10
5
2⋅10 
5
 .
Sample 1:
Input
Output
4
3
5 4 4
1 2 3
3
10 10 9
2 5 4
3
3 3 9
9 1 3
4
2 8 1 5
2 8 1 9
1
2
3
2
Explanation:
Test case 
1
1: The number of likes on the first post is greater than that of second and third post. Thus, the first post is most popular.

Test case 
2
2: The first and second post have maximum number of likes. But, the second post has more comments than the first post. Thus, the second post is most popular.

Test case 
3
3: The number of likes on the third post is greater than that of first and second post. Thus, the third post is most popular.

Test case 
4
4: The number of likes on the second post is greater than that of first, third, and fourth post. Thus, the second post is most popular.

Code:

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int a[n],b[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        for(int i=0;i<n;i++){
            cin>>b[i];
        }
        // your code goes here
        int arr[2];
        arr[0]=a[0];
        arr[1]=b[0];
        int ans = 1;
        for(int i=1;i<sizeof(a)/sizeof(a[0]);i++){
            if(a[i]>arr[0]){
                arr[0]=a[i];
                arr[1]=b[i];
                ans=i+1;
            }else if(a[i]==arr[0] && b[i]>arr[1]){
                arr[0]=a[i];
                arr[1]=b[i];
                ans=i+1;
            }
        }
        
        cout<<ans<<endl;
    }

}
