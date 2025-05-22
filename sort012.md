code:
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int a = 0;
        while(zero>0){
            arr[a]=0;
            a++;
            zero--;
        }
        while(one>0){
            arr[a]=1;
            a++;
            one--;
        }
        while(two>0){
            arr[a]=2;
            a++;
            two--;
        }
        
        
    }
}