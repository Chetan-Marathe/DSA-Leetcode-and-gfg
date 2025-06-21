Trapping rain water:

class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int[] left = new int[n];
        int max1 = 0;
        for(int i=0 ; i<n ;i++){
            if(arr[i]>max1){
                left[i]=arr[i];
                max1=arr[i];
            }else{
                left[i]=max1;
            }
        }
        
        int[] right = new int[n];
        int max2 = 0;
        for(int j=n-1 ; j>=0 ;j--){
            if(arr[j]>max2){
                right[j]=arr[j];
                max2=arr[j];
            }else{
                right[j]=max2;
            }
        }
        
        int sum = 0;
        for(int k=0;k<n;k++){
            sum = sum + (Math.min(left[k],right[k])-arr[k]);
        }
        
        return sum;
    }
}
