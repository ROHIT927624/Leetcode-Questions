class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list,(a,b) -> {
            
        if(!a.getValue().equals(b.getValue())){
            return b.getValue() - a.getValue();
        }
        
        return b.getKey() - a.getKey();
            
        });
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            ans.add(list.get(i).getKey());
        }
        
        return ans;

    }
}
