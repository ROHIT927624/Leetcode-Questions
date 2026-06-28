class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b) -> {
            
        if(!a.getValue().equals(b.getValue())){
            return b.getValue() - a.getValue();
        }
        
        return b.getKey() - a.getKey();
            
        });
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) {
            ans[i]= list.get(i).getKey();
        }
        
        return ans;

    }
}