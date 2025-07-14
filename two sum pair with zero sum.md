class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] nums) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        Set<ArrayList<Integer>> result = new HashSet<>();

        for (int num : nums) {
            if (map.containsKey(-num)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(Math.min(num, -num));
                pair.add(Math.max(num, -num));
                result.add(pair);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
            
        }
        
       ArrayList<ArrayList<Integer>> list = new ArrayList<>(result);
       list.sort((a,b)->a.get(0)-b.get(0));
       
       return list;
    }
}