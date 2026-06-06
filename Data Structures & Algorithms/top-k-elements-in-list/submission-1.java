class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!map.keySet().contains(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            heap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = heap.poll()[1];
        }
        
        return res;

    }
}
