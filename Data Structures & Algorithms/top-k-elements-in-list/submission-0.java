class Solution{
    public int[] topKFrequent(int[] nums, int k) {
    // Step 1: Count frequency of each number
    Map<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
        count.put(num, count.getOrDefault(num, 0) + 1);
    }
    
    // Step 2: Sort by frequency (descending)
    List<Integer> sortedByFreq = new ArrayList<>(count.keySet());
    sortedByFreq.sort((a, b) -> count.get(b) - count.get(a));
    
    // Step 3: Take top k elements
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = sortedByFreq.get(i);
    }
    
    return result;
    }
}
