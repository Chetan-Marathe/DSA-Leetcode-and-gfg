Sorting by frequency

Code:

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : nums){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        } 

        Collections.sort(list,(a,b) -> {
            int num1 = map.get(a);
            int num2 = map.get(b);

            if(num1 != num2){
                return num1 - num2;
            }else{
                return b-a;
            }
        });

        int[] ans = new int[list.size()];
        int i=0;
        for(int val : list){
            ans[i]=val;
            i++;
        }

        return ans;

    }
}