class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        
        map.forEach((num , freq) -> pq.add(num));
        
        int res[] = new int[k], i = 0;
​
        while(k-- > 0) res[i++] = pq.poll(); 
        
        return res;
    }
}
