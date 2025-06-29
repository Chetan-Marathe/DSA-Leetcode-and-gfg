class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
       HashSet<Integer> set = new HashSet<>();
       for(int i=0 ;i<arr1.length ;i++){
            while(arr1[i]>0){
                set.add(arr1[i]);
                arr1[i]=arr1[i]/10;
            }
       }

       int max = 0;
       for(int j=0;j<arr2.length;j++){
            int max2 = 0;
            while(arr2[j]>0){
                if(set.contains(arr2[j])){
                    max2=Math.max(max2,arr2[j]);
                }
                arr2[j]/=10;
            }

            if(max2>max) max = max2;
        }
        if(max==0) return 0;
        String ans = max+"";
        return  ans.length();
    }
}