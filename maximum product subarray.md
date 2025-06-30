class Solution {
    public int maxProduct(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int max = 0;
        int prod = 1;
        for(int i=0 ; i<arr.length ;i++){
            prod=1;
            for(int j=i;j<arr.length;j++){
                prod=prod*arr[j];
                max=Math.max(prod,max);
            }
        }

        return max;

        
    }
}